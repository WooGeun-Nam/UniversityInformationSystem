package FTP_Network;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPClient;
//import org.apache.commons.net.ftp.FTPReply;
 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 남우근
 */
public class FTPUtil {

    /**
     * @param args the command line arguments
     */
public static void uploadDirectory(FTPClient ftpClient,
        String remoteDirPath, String localParentDir, String remoteParentDir)
        throws IOException {
 
    System.out.println("LISTING directory: " + localParentDir);
 
    File localDir = new File(localParentDir);
    File[] subFiles = localDir.listFiles();
    if (subFiles != null && subFiles.length > 0) {
        for (File item : subFiles) {
            String remoteFilePath = remoteDirPath + "/" + remoteParentDir
                    + "/" + item.getName();
            if (remoteParentDir.equals("")) {
                remoteFilePath = remoteDirPath + "/" + item.getName();
            }
 
 
            if (item.isFile()) {
                // upload the file
                String localFilePath = item.getAbsolutePath();
                System.out.println("About to upload the file: " + localFilePath);
                boolean uploaded = uploadSingleFile(ftpClient,
                        localFilePath, remoteFilePath);
                if (uploaded) {
                    System.out.println("UPLOADED a file to: "
                            + remoteFilePath);
                } else {
                    System.out.println("COULD NOT upload the file: "
                            + localFilePath);
                }
            } else {
                // create directory on the server
                boolean created = ftpClient.makeDirectory(remoteFilePath);
                if (created) {
                    System.out.println("CREATED the directory: "
                            + remoteFilePath);
                } else {
                    System.out.println("COULD NOT create the directory: "
                            + remoteFilePath);
                }
 
                // upload the sub directory
                String parent = remoteParentDir + "/" + item.getName();
                if (remoteParentDir.equals("")) {
                    parent = item.getName();
                }
 
                localParentDir = item.getAbsolutePath();
                uploadDirectory(ftpClient, remoteDirPath, localParentDir,
                        parent);
            }
        }
    }
}
 
public static boolean uploadSingleFile(FTPClient ftpClient,
        String localFilePath, String remoteFilePath) throws IOException {
    File localFile = new File(localFilePath);
 
    InputStream inputStream = new FileInputStream(localFile);
    try {
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        return ftpClient.storeFile(remoteFilePath, inputStream);
    } finally {
        inputStream.close();
    }
} 

public static void downloadDirectory(FTPClient ftpClient, String parentDir,
        String currentDir, String saveDir) throws IOException {
    String dirToList = parentDir;
    if (!currentDir.equals("")) {
        dirToList += "/" + currentDir;
    }
 
    FTPFile [] subFiles = ftpClient.listFiles(dirToList);
 
    if (subFiles != null && subFiles.length > 0) {
        for (FTPFile aFile : subFiles) {
            String currentFileName = aFile.getName();
            if (currentFileName.equals(".") || currentFileName.equals("..")) {
                // skip parent directory and the directory itself
                continue;
            }
            String filePath = parentDir + "/" + currentDir + "/"
                    + currentFileName;
            if (currentDir.equals("")) {
                filePath = parentDir + "/" + currentFileName;
            }
 
            //String newDirPath = saveDir + parentDir + File.separator
            String newDirPath = saveDir + File.separator
                    + currentDir + File.separator + currentFileName;
            if (currentDir.equals("")) {
                //newDirPath = saveDir + parentDir + File.separator
                newDirPath = saveDir + File.separator
                          + currentFileName;
            }
 
            if (aFile.isDirectory()) {
                // create the directory in saveDir
                File newDir = new File(newDirPath);
                boolean created = newDir.mkdirs();
                if (created) {
                    System.out.println("CREATED the directory: " + newDirPath);
                } else {
                    System.out.println("COULD NOT create the directory: " + newDirPath);
                }
 
                // download the sub directory
                downloadDirectory(ftpClient, dirToList, currentFileName,
                        saveDir);
            } else {
                // download the file
                boolean success = downloadSingleFile(ftpClient, filePath,
                        newDirPath);
                if (success) {
                    // System.out.println("DOWNLOADED the file: " + filePath);
                } else {
                    System.out.println("COULD NOT download the file: "
                            + filePath);
                }
            }
        }
    }
}
 
public static boolean downloadSingleFile(FTPClient ftpClient,
        String remoteFilePath, String savePath) throws IOException {
    File downloadFile = new File(savePath);
     
    File parentDir = downloadFile.getParentFile();
    if (!parentDir.exists()) {
        parentDir.mkdir();
    }
         
    OutputStream outputStream = new BufferedOutputStream(
            new FileOutputStream(downloadFile));
    try {
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        return ftpClient.retrieveFile(remoteFilePath, outputStream);
    } catch (IOException ex) {
        throw ex;
    } finally {
        if (outputStream != null) {
            outputStream.close();
        }
    }
}
public void uploadStart() {
        String server = "115.22.217.193";
        // int port = 14147;
        String user = "Team";
        String pass = "1234";
 
        FTPClient ftpClient = new FTPClient();
 
        try {
            // connect and login to the server
            ftpClient.connect(server);
            ftpClient.login(user, pass);
 
            // use local passive mode to pass firewall
            ftpClient.enterLocalPassiveMode();
 
            System.out.println("Connected");
 
            String remoteDirPath = "/DB";
            String localDirPath = "DB";
 
            FTPUtil.uploadDirectory(ftpClient, remoteDirPath, localDirPath, "");
 
            // log out and disconnect from the server
            ftpClient.logout();
            ftpClient.disconnect();
 
            System.out.println("Disconnected");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}

public void downloadStart() {
        String server = "115.22.217.193";
        // int port = 14147;
        String user = "Team";
        String pass = "1234";

        FTPClient ftpClient = new FTPClient();
 
        try {
            // connect and login to the server
            ftpClient.connect(server);
            ftpClient.login(user, pass);
 
            // use local passive mode to pass firewall
            ftpClient.enterLocalPassiveMode();
 
            System.out.println("Connected");
 
            String remoteDirPath = "/DB/";
            String saveDirPath = "DB";
 
            FTPUtil.downloadDirectory(ftpClient, remoteDirPath, "", saveDirPath);
 
            // log out and disconnect from the server
            ftpClient.logout();
            ftpClient.disconnect();
 
            System.out.println("Disconnected");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}
}

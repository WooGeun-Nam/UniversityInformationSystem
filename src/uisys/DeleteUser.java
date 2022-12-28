/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uisys;

import FTP_Network.FTPUtil;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class DeleteUser {
    int userPoint;
    int searchPoint;
    FTPUtil ftputil;
    public DeleteUser(int userPoint,int searchPoint) {
         this.userPoint = userPoint;
         this.searchPoint = searchPoint;
    }
    public int DeleteData() {
    ftputil = new FTPUtil();
    ftputil.downloadStart();
                  String dummy = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("DB\\information.txt"));
			String line;
			for(int i=0; i<searchPoint; i++) {
			    line = br.readLine();
			    dummy += (line + "\r\n" ); 
			}
			String delData = br.readLine();
			while((line = br.readLine())!=null) {
				dummy += (line + "\r\n" ); 
			}
			FileWriter fw = new FileWriter("DB\\information.txt");
			fw.write(dummy);			
			fw.close();
			br.close();
                                           JOptionPane.showMessageDialog(null, "사용자가 삭제되었습니다\r\n삭제된정보 : " + delData);
                                           if (searchPoint < userPoint) {
                                               userPoint -= 1;
                                           }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                ftputil.uploadStart();
        return userPoint;
    }
}

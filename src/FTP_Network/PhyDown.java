/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FTP_Network;

/**
 *
 * @author 남우근
 */
public class PhyDown {
  static FTPUtil a;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                         a = new FTPUtil();
                         a.downloadStart();
    } 
}

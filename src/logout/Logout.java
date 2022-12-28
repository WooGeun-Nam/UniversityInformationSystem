/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logout;

import FTP_Network.FTPUtil;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import login.Login;
/**
 *
 * @author dbswl
 */
public class Logout {
    int userPoint; // 사용자의 정보를 알려줌 (information.txt에서의 줄 수)
    String []arr = null; // userPoint줄 수에 해당하는 사용자의 정보
    String name = null; // 사용자의 이름
    Login login;
    FTPUtil a;
   public Logout(int point){
        userPoint = point;
        name();
        
    }
   public void name(){ // userPoint 수에 해당하는 정보를 arr에 저장한다.
       
		try {
			BufferedReader br = new BufferedReader(new FileReader("DB\\information.txt"));
			//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			//1. 받아야하는 position 이전까지는 이동하며 dummy에 저장
			String line;
			for(int i=0; i<userPoint; i++) {
			    line = br.readLine(); //읽으며 이동
			}
			//2. 데이터 받기
			String Data = br.readLine();
                          arr = Data.split("/");
			br.close();
                       
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
        }          
              sign();
   }
   public void sign(){ // 사용자 이름으로 로그아웃 message 생성 후 Login화면으로 돌아간다.
                         name = arr[2] + "님 로그아웃 하셨습니다";
                         a = new FTPUtil();
                         a.uploadStart();
                        JOptionPane.showMessageDialog(null,name , "로그아웃", JOptionPane.DEFAULT_OPTION);
                        login = new Login();
                        //login.setVisible(true);
   }
}

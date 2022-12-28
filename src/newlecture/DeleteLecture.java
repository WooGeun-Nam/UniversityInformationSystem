package newlecture;

import FTP_Network.FTPUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
    
/**
 *
 * @author dbswl
 */
public class DeleteLecture {
    int saveRow; // 줄 수
    String Lecture;
    int UserPoint;
    FTPUtil ftputil;
    String []a;
    public DeleteLecture(String lecture,int userPoint){ // 강좌 삭제
        UserPoint = userPoint;
        Lecture = lecture; // 강좌정보
        a = lecture.split("/");
        delete();
    }
    public void delete(){
         if(Lecture !=""){
             if(a[4].equals("1")){
                             JOptionPane.showMessageDialog(null, "이미 개설된 강좌입니다." );
             }
             else{
            Knowline();
            modify();                 
             }

        }
        else{ // 입력되어있지 않으면
            JOptionPane.showMessageDialog(null, "조회가 되지않았습니다" );
        }
    }
    public void Knowline(){ // 몇번째 라인 인지 찾음
    ftputil = new FTPUtil();
    ftputil.downloadStart();
                    try { //입력된 강좌정보와 classinfo1의 정보를 비교해서 정보가 있는 줄 수를 얻음
                int i =0;
                String s; 

                File myFile = new File("DB\\classinfo1.txt");
                FileReader fileReader = new FileReader(myFile);
                BufferedReader reader = new BufferedReader(fileReader);
                while ((s = reader.readLine()) != null) {
                    if(s.equals(Lecture)){
                        saveRow = i;
                    }    
                    i++;
                } 
                reader.close();
            } catch (IOException e2) { 
                e2.printStackTrace(); 
            }
    }
    public void modify(){

            File file = new File("DB\\classinfo1.txt");		
            String dummy = "";
            //위에서 받아온 saveRow를 이용하여 입력된 강좌의 위치 전까지는 dummy에 저장
            //삭제하고자하는 데이터는 건너뛰고 다음 위치의 데이터부터 또 dummy에 이어서 저장 후 덮어쓰기
            try { 
                BufferedReader br = new BufferedReader(new FileReader("DB\\classinfo1.txt"));
                String line;
                for(int j=0; j<saveRow; j++) {
                    line = br.readLine(); 
                    dummy += (line + "\r\n" ); 
                }
                System.out.println(dummy);
                String delData = br.readLine();
                System.out.println(delData);
                int count = 0;
                while((line = br.readLine())!=null ) {
                    dummy += (line + "\r\n" ); 
                    count ++;
                }
               
                FileWriter fw = new FileWriter("DB\\classinfo1.txt");
                fw.write(dummy);
                fw.close();
                br.close();
                JOptionPane.showMessageDialog(null, "강좌가 삭제되었습니다.\r\n삭제된정보 : " + delData);
                            ftputil.uploadStart();
                            new SearchLecture("", 0,UserPoint).setVisible(true);
            
                
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


    }
}

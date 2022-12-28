/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newclass;

import FTP_Network.FTPUtil;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import newlecture.SearchLecture;


/**
 *
 * @author dbswl
 */
public class NewClass extends javax.swing.JFrame {
    String lecture;
    int order;
    String sec;
    int semester;
    String max;
    String min;
    String []a;
    String Grade;
    String name;
    String perfect;
    boolean yesno;
    FTPUtil ftputil;
    SearchLecture searchlecture;
    int UserPoint;
    /**
     * Creates new form NewClass
     */
    public NewClass(String l,int userPoint) {
        initComponents();
        UserPoint = userPoint;
        lecture = l;
        a = lecture.split("/");
        order = GetLecture(); // 줄 수를 받아낸다
        ShowSelectLecture();
        setTitle("강의등록");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JCreate = new javax.swing.JButton();
        JCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Pname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Max = new javax.swing.JTextField();
        Min = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        label = new javax.swing.JLabel();
        professorname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel1.setText("아래 강좌에 대해 강의를 개설하세요.");

        JCreate.setText("개설");
        JCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCreateActionPerformed(evt);
            }
        });

        JCancel.setText("취소");
        JCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCancelActionPerformed(evt);
            }
        });

        jLabel2.setText("최대 수강인원");

        jLabel3.setText("개설 학기");

        Pname.setText("교수이름");

        jLabel4.setText("최소 수강인원");

        Min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1학기", "2학기" }));

        professorname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professornameActionPerformed(evt);
            }
        });

        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);
        jScrollPane1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jScrollPane1ComponentRemoved(evt);
            }
        });
        jScrollPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jScrollPane1ComponentHidden(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setAutoscrolls(false);
        jTable1.setPreferredSize(new java.awt.Dimension(500, 80));
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("학년");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setText("한 학년이상 개설할 시 ,로 구분해주세요.ex)1,2,3,4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Max, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Min, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(professorname, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(273, 273, 273)
                                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(199, 199, 199)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(Max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pname)
                    .addComponent(professorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JCreate)
                        .addComponent(JCancel))
                    .addComponent(label))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCancelActionPerformed
        // TODO add your handling code here:
        dispose();
        searchlecture = new SearchLecture("",0,UserPoint);
        searchlecture.setVisible(true);
        
    }//GEN-LAST:event_JCancelActionPerformed

    private void JCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCreateActionPerformed
        // TODO add your handling code here:

               if (professorname.getText().equals("") || Max.getText().equals("") || Min.getText().equals("")||jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "빈칸이 존재합니다!");
            }
               else if(Integer.parseInt(Max.getText())<Integer.parseInt(Min.getText()) ){
                   JOptionPane.showMessageDialog(null, "최소값이 최대값보다 큽니다");
               }
         else{
        semester = jComboBox2.getSelectedIndex(); // 학기 선택
        max = Max.getText();
        min = Min.getText();
        Grade = jTextField1.getText();
        name = professorname.getText();
        perfect = a[0]+"/"+a[1]+"/"+a[2]+"/"+a[3]+"/" +"1/"+ Grade+"/" + name +"/"+ max +"/"+ min +"/0\r\n"; 
                //newclass = new NewClass(lecture,order,semester,jTextField1.getText(),professorname.getText(),max,min);
                //dispose();
                check();
                 }
    }//GEN-LAST:event_JCreateActionPerformed

    private void MinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MinActionPerformed

    private void professornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professornameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professornameActionPerformed

    private void jScrollPane1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1ComponentRemoved

    private void jScrollPane1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1ComponentHidden

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void check(){ // 강의개설

        boolean yes = false;
        boolean b = false;
        boolean number = false;
            try { 
            String str;
            String []array;
            File classFile = new File("DB\\Lecture\\AllClass.txt");
            FileReader fileReader = new FileReader(classFile);
            BufferedReader AllClassreader = new BufferedReader(fileReader);
            boolean end = false; // 한번 체크가 되면 이후 줄 끝까지는 확인이 안된다.
            boolean onetwo = false;
            int count = 0;
            while ((str = AllClassreader.readLine()) != null || count == 0) { // 첫줄이 null인 상황도 고려
                if(!end){
                    if(str != null){
               array = str.split("/");
                if(array[0].equals(a[0])){ // 선택한 강좌 번호가 개설 되었는지 확인
                   if(namecheck() == 1){ // 교수가 재직중인가
                       if(semester == 0){ // 1학기
                           onecheck(); // 1학기가 개설되었는지 체크
                           end = true;
                       }
                       if (semester == 1){ // 2학기
                           twocheck();// 2학기가 개설되었는지 체크
                           end = true;
                       }
                    }
                   else{ // 교수가 재직중이지않음 
                       end = true;
                        JOptionPane.showMessageDialog(null, "재직중인 교수가 아닙니다"); 
                        break;
                   }
                   }
                }
                 if(str == null){
                    if(namecheck() == 1){ // 교수가 재직중인가
                       if(semester == 0){ // 1학기
                           onetwo = true;
                           NewCreate(onetwo); // 1학기 개설

                       }
                       if (semester == 1){ // 2학기
                           onetwo = false;
                          NewCreate(onetwo); // 2학기 개설

                       }                
                        end = true;
                    }
                    else{ // 교수가 재직중이지 않으면 
                     JOptionPane.showMessageDialog(null, "재직중인 교수가 아닙니다");        
                     end = true;
                     break;
                    }   
                    }

                }
                count++;
 	   }  
            if(!end){ // 강좌가 개설되어있지않으면 
                    if(namecheck() == 1){ // 교수가 재직중인가
                       if(semester == 0){ // 1학기
                           onetwo = true;
                           NewCreate(onetwo); // 1학기 개설

                       }
                       if (semester == 1){ // 2학기
                           onetwo = false;
                          NewCreate(onetwo); // 2학기 개설

                       }            
                        
                    }
                    else{ // 교수가 재직중이지 않으면 
                     JOptionPane.showMessageDialog(null, "재직중인 교수가 아닙니다");                      
                    }
           }

 	   AllClassreader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
        public int namecheck(){ // 교수가 재직중인지 확인한다.
                    yesno = false;
         try { 
            String s;
            String []array = null;
            File File = new File("DB\\information.txt");
            FileReader namefileReader = new FileReader(File);
            BufferedReader namereader = new BufferedReader(namefileReader);
            int count = 0;
            while ((s = namereader.readLine()) != null || count == 0) {
                array = s.split("/");
                if(name.equals(array[2])&&array[0].charAt(0) == 'P'){
                    yesno = true; // 교수재직중
                        return 1;
                }
                count ++;
 	   } 


        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        } 
         return 2;
    }
        public void onecheck(){ // 강좌번호 txt에 1학기 강의가 개설되어있는지 확인
        ftputil = new FTPUtil();
        ftputil.downloadStart();
        String fileName ="DB\\Lecture\\"+a[0]+".txt" ;
        
        try{
            String number[]; // txt파일의 첫줄 강의번호
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String s = br.readLine();
            number= s.split("/");
            System.out.println(s);
            System.out.println(number[0]);
            System.out.println(a[0]);
            if(number[0].equals(a[0])) //1학기가 개설됨
            {
                JOptionPane.showMessageDialog(null, "동일한 강의가 이번 학기에 개설되었습니다.");
            }
            else{
                onecreate();
            }
        }catch (FileNotFoundException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  public void twocheck(){ // 강좌번호 txt에 2학기 강의가 개설되어있는지 확인
        ftputil = new FTPUtil();
        ftputil.downloadStart();
        try{
                  String fileName ="DB\\Lecture\\"+a[0]+".txt" ;
 
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                //number= br.readLine().split("/");
                                   String number[] = null; 
            String s;
            //number= br.readLine().split("/");
                int yesno = 1;
                int count = 0;
                while ((s = br.readLine()) != null) { // txt파일 모두 읽기
                    System.out.println(s);
                    if(yesno == 1){
                        if(s.equals("-----------------------------------------------------------------") ){ // 만약 2학기 구분자가 있다면
                            number = br.readLine().split("/");
                            yesno = 2; // 2학기가 개설되었는지 체크
                            count++;
                        }
                        else{
                        }
                    }
                    
                }
                System.out.println("count"+count);
                if(count == 0){
                    twocreate();
                }
                else{
                    if(number[0].equals(a[0])){ // 2학기 강의가 있음
                        JOptionPane.showMessageDialog(null, "동일한 강의가 이번 학기에 개설되었습니다.");
                    }
                    else{
                        twocreate();
                    }
                }
            }

        }catch (FileNotFoundException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     public void NewCreate(boolean onetwo ){ // 새로운 강의를 개설한다.
        ftputil = new FTPUtil();
        ftputil.downloadStart();
                        try{         
            String fileName ="DB\\Lecture\\"+a[0]+".txt" ;
            // 파일 객체 생성
            File file = new File(fileName) ;
            // true 지정시 파일의 기존 내용에 이어서 작성
            FileWriter fw = new FileWriter(file,true) ;
             
            // 파일안에 문자열 쓰기
            if(!onetwo){ // 2학기로 체크되었다면
              fw.write("-----------------------------------------------------------------\r\n");   
            }
            fw.write(perfect ); // 새 강의를 추가 저장
                
            fw.flush();
            // 객체 닫기
            fw.close(); 
        }catch(Exception e){
            e.printStackTrace();
        }
                                ftputil.uploadStart();
        classinfoSetting();
        classinfoSetting2();
        AllClassSetting();
    }
    public void onecreate(){ // 2학기가 개설된 1학기 강의정보 입력
        ftputil = new FTPUtil();
        ftputil.downloadStart();
		try {
                    System.out.println(a[0]);
                  String fileName ="DB\\Lecture\\"+a[0]+".txt" ;	
		String read = "";
			BufferedReader br = new BufferedReader(new FileReader(fileName));
                          String s;
                          String renew[] = lecture.split("/");
                          renew[4] = "1";
                          read += renew[0]+"/"+renew[1]+"/"+renew[2]+"/"+renew[3]+"/"+renew[4]+ "\r\n"; // 첫줄에 정보 입력
                          int count =0;
                        while ((s = br.readLine()) != null|| count == 0) { // txt파일 모두 읽기
			    read += (s + "\r\n" ); 
                            count++;
                          }
			// FileWriter를 이용해서 덮어쓰기
			FileWriter fw = new FileWriter(fileName);
			fw.write(read);
			fw.close();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                   ftputil.uploadStart();
                    classinfoSetting();
                   classinfoSetting2();
                    AllClassSetting();
    }
    public void twocreate(){ // 1학기가 개설된 2학기 강의정보 입력
        ftputil = new FTPUtil();
        ftputil.downloadStart();

		try {
                            String fileName ="DB\\Lecture\\"+a[0]+".txt" ;
                            	BufferedWriter bos = new BufferedWriter(new FileWriter(fileName,true));
                          	String read = "";
                            read+= "-----------------------------------------------------------------\r\n"; // 학기 구분자
                            read += perfect+"\r\n"; // 마지막 줄에 정보 입력
			// FileWriter를 이용해서 덮어쓰기
			bos.write(read);
			bos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                   ftputil.uploadStart();
                    classinfoSetting();
                    classinfoSetting2();
                    AllClassSetting();
    }
public void classinfoSetting(){ // 강의가 개설됨을 알려주기위해 classinfo에 강의존재여부(1)변경
            ftputil = new FTPUtil();
        ftputil.downloadStart();		
    try {
                    
			BufferedReader br = new BufferedReader(new FileReader("DB\\\\classinfo1.txt"));
                        	String read = "";
                          String s;
                          int count = 0;
                        while ((s = br.readLine()) != null || count == 0) { // txt파일 모두 읽기
                            if(lecture.equals(s)){
                          String renew[] = lecture.split("/");
                          renew[4] = "1";
                          read += renew[0]+"/"+renew[1]+"/"+renew[2]+"/"+renew[3]+"/"+renew[4]+"\r\n"; // 첫줄에 정보 입력
                            }
                            else
			    read += (s + "\r\n" ); 
                            count++;
                          }
			// FileWriter를 이용해서 덮어쓰기
			FileWriter fw = new FileWriter("DB\\\\classinfo1.txt");
			fw.write(read);
			fw.close();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
                       ftputil.uploadStart();
}  
public void classinfoSetting2(){ // 강의의 설명도 삭제한다.
     ftputil = new FTPUtil();
        ftputil.downloadStart();		
    try {
                    
			BufferedReader br = new BufferedReader(new FileReader("DB\\\\classinfo2.txt"));
                        	String read = "";
                          String s;
                          int count = 0;
                          for(int i =0; i < order; i++){
                              read += br.readLine()+"\r\n";
                          }
                           String renew[] = br.readLine().split("/");
                          read += renew[0]+"/"+renew[1]+"/"+"1"+"\r\n";
                        while ((s = br.readLine()) != null ) { // txt파일 모두 읽기
                              read += br.readLine()+"\r\n";
                          }
			// FileWriter를 이용해서 덮어쓰기
			FileWriter fw = new FileWriter("DB\\\\classinfo2.txt");
			fw.write(read);
			fw.close();
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
                       ftputil.uploadStart();
}
public void AllClassSetting(){ // 생성된 강의를 강의목록에 추가한다.
      ftputil = new FTPUtil();
        ftputil.downloadStart();	
             try{
	BufferedWriter bos = new BufferedWriter(new FileWriter("DB\\Lecture\\AllClass.txt",true));
	bos.write(perfect);
	bos.close();
	JOptionPane.showMessageDialog(null, "개설되었습니다");
        }catch (Exception ex){
              JOptionPane.showMessageDialog(null, "개설 실패");
        } 
                                    ftputil.uploadStart();
}
    private int GetLecture(){  // 줄 수를 받아낸다

        int count = 0;

        try { 
            int i =0;
            String s;
            File classFile = new File("DB\\classinfo1.txt");
            FileReader fileReader = new FileReader(classFile);
            BufferedReader reader = new BufferedReader(fileReader);
            while ((s = reader.readLine()) != null) {
                    if(s.equals(lecture)){
                         count = i; 
                          }
                    i++;
 	   } 
 	   reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return count;
    }
    public void ShowSelectLecture(){ // 강의 개설을 원하는 강좌를 표로 보여줌
        
         jTable1.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "강좌 번호","강좌 이름","학과","학점" }){
        public boolean isCellEditable(int row, int column) {
             //all cells false
            return false;
         }
        });   
             DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
             model.setNumRows(0);    
             String firstLine = "강좌 번호/강좌 이름/학과/학점";
            String[] columnsName = firstLine.split("/");
            model.setColumnIdentifiers(columnsName);
            String[] dataRow = lecture.split("/");
            model.addRow(dataRow);

        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JCancel;
    private javax.swing.JButton JCreate;
    private javax.swing.JTextField Max;
    private javax.swing.JTextField Min;
    private javax.swing.JLabel Pname;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel label;
    private javax.swing.JTextField professorname;
    // End of variables declaration//GEN-END:variables
}

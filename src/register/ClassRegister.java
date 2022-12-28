/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;

import FTP_Network.FTPUtil;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JFrame;

public class ClassRegister extends javax.swing.JFrame {

    String myNumber;
    String [] lecture = {"","","","","","","","","","","",""};
    int userPoint;
    String myGrade = null;
    String myDep = null;
    String myName = null;
    int myScore=0;
    FTPUtil ftputil;
    /**
     * Creates new form ProfessorLecture
     */
    int j=0;

    public ClassRegister(int userPoint) {
    ftputil = new FTPUtil();
    ftputil.downloadStart();
        
        initComponents();
        setTitle("수강신청");
        setSize(600,430);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        RegClass.setModel(new DefaultTableModel(new Object[][][] {}, new String[] { "셀1","셀2","셀3" }){
        public boolean isCellEditable(int row, int column) {
             //all cells false
            return false;
         }
        });
        
        this.userPoint = userPoint;

        try {
            String s; 
            String[] array;
            File myFile = new File("DB\\information.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
 	   int i=0;
            while ((s = reader.readLine()) != null) {
               array = s.split("/");
               if (i == userPoint) {
                   myNumber = array[0];
                   myDep = array[3];
                   myGrade = array[4];
                   myName = array[2];
               }
               i += 1;
 	   } 
 	   reader.close();
 	   } catch (IOException e2) { 
 	   e2.printStackTrace(); 
           }
        
        //jLabel2.setText("학번 : "+ myNumber);
        //String fileName = "DB\\Student\\"+myNumber+".txt";
        Refresh();

        RegClass.getTableHeader().setResizingAllowed(false);
        RegClass.getTableHeader().setReorderingAllowed(false);
        
        final TableColumnModel columnModel = RegClass.getColumnModel();
             for (int column = 0; column < RegClass.getColumnCount(); column++) { // 글자 크기에 맞춰서 행 크기 설정
        int width = 50; // Min width 
       for (int row = 0; row < RegClass.getRowCount(); row++) { 
        TableCellRenderer renderer = RegClass.getCellRenderer(row, column); 
        Component comp = RegClass.prepareRenderer(renderer, row, column); 
        width = Math.max(comp.getPreferredSize().width +1 , width); } 
        columnModel.getColumn(column).setPreferredWidth(width); }
        
        jLabel1.setText(myNumber+ " / " + myName + " / " + myGrade + "학년 / " + myDep);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        RegClass = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegClass.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(RegClass);

        jButton1.setText("종 료");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("수강신청");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jLabel1))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        append();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void append() {
    ftputil = new FTPUtil();
    ftputil.downloadStart();
        String StudyScore = null;
        try {
        int roww = RegClass.getSelectedRow();
        StudyScore = RegClass.getValueAt(roww, 4).toString(); // 신청 과목의 학점
        boolean full=false;
        if (RegClass.getValueAt(roww, 6).toString() == "초과") full = true;
        if (full == true) {
            JOptionPane.showMessageDialog(null, "해당강좌는 신청할 수 없습니다.");
            return;
        }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "강의를 선택하세요.");
            return;
        }
         myScoreCheck();
         if (18 < myScore+Integer.parseInt(StudyScore)) {
             JOptionPane.showMessageDialog(null, "최대학점을 초과합니다.");
             return;
         }
        
        boolean eqcheck = false;
        try{
        String Lnumber;
        String Lname;
        int row = RegClass.getSelectedRow();
        Lnumber = RegClass.getValueAt(row, 0).toString();
        Lname = RegClass.getValueAt(row, 1).toString();
        String fileName = "DB\\Student\\"+myNumber+".txt";
        String fileName2 = "DB\\Lecture\\"+Lnumber.substring(0, 6)+".txt";
        try {
            String s; 
            String[] array;
            File myFile = new File(fileName);
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
 	   int i=0;
            while ((s = reader.readLine()) != null) {
                array = s.split("/");
                if(Lname.equals(array[1])) {
                    eqcheck = true;
                }
            }
 	   reader.close();
                if (eqcheck == false) {
                        try{ // 학번의 파일에 새로신청한 강의 내용등록
                        BufferedWriter bos = new BufferedWriter(new FileWriter(fileName,true));
                        bos.write(Lnumber+"/"+Lname+"/"+StudyScore+"\r\n");
                        bos.close();
                        }catch (Exception ex){
                            JOptionPane.showMessageDialog(null, "신청 실패");
                        }
                        // S20181234/35/38/최종/출석/출석/출석/출석/5/6/7/8/9/10/11/12/출석/14/15
                        try{ // 강의번호의 파일에 새로신청한 학생 정보 등록
                        BufferedWriter bos = new BufferedWriter(new FileWriter(fileName2,true));
                        bos.write(myNumber+"/"+myName+"/중간/기말/-/1/2/3/4/5/6/7/8/9/10/11/12/13/14/15\r\n");
                        bos.close();
                        }catch (Exception ex){
                            JOptionPane.showMessageDialog(null, "신청 실패");
                        }
                        countLecture(Lnumber);
                        JOptionPane.showMessageDialog(null, "등록 완료");
                } else if (eqcheck == true) {
                    JOptionPane.showMessageDialog(null, "이미 신청한 강의 입니다.");
                }
            } catch(FileNotFoundException e) { // 파일이 없을경우 중복이 아니므로, 새로 작성
                try{ // 학번의 파일에 새로신청한 강의 내용등록
                BufferedWriter bos = new BufferedWriter(new FileWriter(fileName,true));
                bos.write(Lnumber+"/"+Lname+"/"+StudyScore+"\r\n");
                bos.close();
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "신청 실패");
                }
                // S20181234/35/38/최종/출석/출석/출석/출석/5/6/7/8/9/10/11/12/출석/14/15
                try{ // 강의번호의 파일에 새로신청한 학생 정보 등록
                BufferedWriter bos = new BufferedWriter(new FileWriter(fileName2,true));
                bos.write(myNumber+"/"+myName+"/중간/기말/-/1/2/3/4/5/6/7/8/9/10/11/12/13/14/15\r\n");
                bos.close();
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "신청 실패");
                }
                countLecture(Lnumber);
                JOptionPane.showMessageDialog(null, "등록 완료");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "강의를 선택하세요.");
        }
        ftputil.uploadStart();
        Refresh();
    }
    
    public void countLecture(String SLnumber) {
        int SLpoint = 1;
        try {
            String s; 
            String[] array;
            File myFile = new File("DB\\Lecture\\AllClass.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
 	   int i=0;
            while ((s = reader.readLine()) != null) {
               array = s.split("/");
               if (array[0].equals(SLnumber)) {
                   SLpoint = i;
               }
               i += 1;
 	   } 
 	   reader.close();
 	   } catch (IOException e2) { 
 	   e2.printStackTrace(); 
           }
        
                  File file = new File("DB\\Lecture\\AllClass.txt");		
		String dummy = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("DB\\Lecture\\AllClass.txt"));
			//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			//1. 삭제하고자 하는 position 이전까지는 이동하며 dummy에 저장
			String line;
			for(int i=0; i<SLpoint; i++) {
			    line = br.readLine(); //읽으며 이동
			    dummy += (line + "\r\n" ); 
			}
			//2. 수정할 내용 새 내용으로 저장 9번 배열만 수정
                           String preData = br.readLine();
                           String [] array;
                           String newData = "";
                           array = preData.split("/");
                           for(int i=0;i<9;i++) {
                               newData += array[i]+"/";
                           }
                           newData += Integer.parseInt(array[9]) + 1;
                           dummy += newData+"\r\n";
			//Log.d("mstag","삭제되는 데이터 = "+delData);
			//3. 삭제하고자 하는 position 이후부터 dummy에 저장
			while((line = br.readLine())!=null) {
				dummy += (line + "\r\n" ); 
			}
			//4. FileWriter를 이용해서 덮어쓰기
			FileWriter fw = new FileWriter("DB\\Lecture\\AllClass.txt");
			fw.write(dummy);
			//bw.close();
			fw.close();
			br.close();
                          //JOptionPane.showMessageDialog(null, "정보가 수정되었습니다.\r\n" + "수정 전 : " + preData +"\r\n수정 후 : " + newData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void myScoreCheck() {
        myScore = 0;
         try {
            String s; 
            String[] array;
            File myFile = new File("DB\\Student\\"+myNumber+".txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            while ((s = reader.readLine()) != null) {
               array = s.split("/");
                   myScore += Integer.parseInt(array[2]);
 	   }
 	   reader.close();
 	   } catch (IOException e2) { 
 	   e2.printStackTrace(); 
           }    
    }
    
    public void Refresh() {
        DefaultTableModel model = (DefaultTableModel)RegClass.getModel();
        model.setNumRows(0);
        try {
             FileReader fileReader = new FileReader("DB\\Lecture\\AllClass.txt");
             // DefaultTableModel model = (DefaultTableModel)RegClass.getModel();
             model.setNumRows(0);
        try {
            BufferedReader br = new BufferedReader(fileReader);
            //String firstLine = br.readLine().trim();
            String firstLine = "강좌번호/강좌명/교수명/학과/학점/현재인원/최대인원";
            String[] columnsName = firstLine.split("/");
            //DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setColumnIdentifiers(columnsName);
            Object[] tableLines = br.lines().toArray();
            
            
            for(int i = 0; i < tableLines.length; i++) {
               
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                String [] sortDB = {"","","","","","",""};
                 System.out.println("dd");
                // 강좌번호(0) / 강좌명(1) / 교수명(6) / 학과(2) / 학점(3) / 현재인원(9) / 최대인원(8)
                sortDB[0] = dataRow[0] ; sortDB[1] = dataRow[1]; sortDB[2] = dataRow[6]; sortDB[3] = dataRow[2]; sortDB[4] = dataRow[3]; sortDB[5] = dataRow[9]; sortDB[6] = dataRow[8];
                
                if (Integer.parseInt(dataRow[8]) == Integer.parseInt(dataRow[9])) {
                    sortDB[6] = "초과";
                }
                if( dataRow[5].contains(myGrade) && myDep.equals(dataRow[2])) { // 배열5는 가능한 학년, 배열2는 학과
                    // && myGrade.contains(dataRow[5])  myDep.equals(dataRow[2])
                    model.addRow(sortDB);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        }
        catch (FileNotFoundException fnfe) {
           JOptionPane.showMessageDialog(null, "강의내역이 없습니다.");
        }
        
       final TableColumnModel columnModel = RegClass.getColumnModel();
             for (int column = 0; column < RegClass.getColumnCount(); column++) { // 글자 크기에 맞춰서 행 크기 설정
        int width = 50; // Min width 
       for (int row = 0; row < RegClass.getRowCount(); row++) { 
        TableCellRenderer renderer = RegClass.getCellRenderer(row, column); 
        Component comp = RegClass.prepareRenderer(renderer, row, column); 
        width = Math.max(comp.getPreferredSize().width +1 , width); } 
        columnModel.getColumn(column).setPreferredWidth(width); }
        
    }
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ClassRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassRegister(2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RegClass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

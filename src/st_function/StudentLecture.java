/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st_function;

import FTP_Network.FTPUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 남우근
 */
public class StudentLecture extends javax.swing.JFrame {

    String myNumber ="S20163315";
    String [] lecture = {"","","","","","","","","","","",""};
    int userPoint;
    FTPUtil ftputil;
    /**
     * Creates new form ProfessorLecture
     */
    int j=0;
    public StudentLecture(int userPoint) {
    ftputil = new FTPUtil();
    ftputil.downloadStart();
        
        initComponents();
        setTitle("강의조희(학생)");
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        jTable1.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "강좌 번호","강좌 이름" }){
        public boolean isCellEditable(int row, int column) {
             //all cells false
            return false;
         }
        });
        
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
               }
               i += 1;
 	   } 
 	   reader.close();
 	   } catch (IOException e2) { 
 	   e2.printStackTrace(); 
           }
        
        jLabel2.setText("학번 : "+ myNumber);
        String fileName = "DB\\Student\\"+myNumber+".txt";
        
        try {
             FileReader fileReader = new FileReader(fileName);
             DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
             model.setNumRows(0);
        try {
            BufferedReader br = new BufferedReader(fileReader);
            //String firstLine = br.readLine().trim();
            String firstLine = "강좌 번호/강좌 이름";
            String[] columnsName = firstLine.split("/");
            //DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setColumnIdentifiers(columnsName);
            Object[] tableLines = br.lines().toArray();
            
            for(int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
 
        }
        catch (FileNotFoundException fnfe) {
           JOptionPane.showMessageDialog(null, "강의내역이 없습니다.");
        }
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always조건
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("강좌번호 / 강좌명");

        jLabel2.setText("학생명 : 학생명");

        jButton3.setText("종료");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("출석 & 성적 조회");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            /*new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }*/
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(151, 151, 151)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        LookUpDB();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void LookUpDB() {
    ftputil = new FTPUtil();
    ftputil.downloadStart();
    
        String [] array = {"",""};
        try {
        int row = jTable1.getSelectedRow();
        array[0] = jTable1.getValueAt(row, 0).toString();
        array[1] = jTable1.getValueAt(row, 1).toString();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "강의를 선택하세요.");
            return;
        }
        
        try{
        String Lnumber;
        Lnumber = array[0];
        String fileName = "DB\\Lecture\\"+Lnumber.substring(0, 6)+".txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            int i =0;
            String show = array[1] +" 과목의\r\n출결 & 성적 정보 입니다.\r\n";
            while((line = br.readLine())!=null) {
                array = line.split("/");
                if (array[0].equals(myNumber)) {
                    show += "중간시험 점수 : "+array[1] +"\r\n";
                    show += "기말시험 점수 : "+array[2] +"\r\n";
                    String score = null;
                    switch(array[3]) {
                        case "A":
                            score = "A (4.0)";
                            break;
                        case "B":
                            score = "B (3.0)";
                            break;
                        case "C":
                            score = "C (2.0)";
                            break;
                        case "D":
                            score = "D (1.0)";
                            break;
                        case "F":
                            score = "F (0.0)";
                            break;
                       default:
                            score = "성적이 입력되지 않았습니다.";
                            break;
                    }
                    show += "최종 학점 : "+score +"\r\n";
                    for(int j = 4; j <array.length ; j++) {
                        show += j-3 + "주차 : "+array[j] +"\r\n";
                    }
                }
                i += 1;
            }
            br.close();
            JOptionPane.showMessageDialog(null,show);
            } catch (IOException e) {
			// TODO Auto-generated catch block
            e.printStackTrace();
        }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "강의를 선택하세요.");
        } 
    }
    
    
    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentLecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLecture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
           // public void run() {
            //    new StudentLecture().setVisible(true);
          //  }
      //  });
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args){
        StudentLecture a = new StudentLecture(5);
        a.setVisible(true);
    }
}

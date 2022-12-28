/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchallclass;

import FTP_Network.FTPUtil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import newlecture.NewLecture;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;


/**
 *
 * @author dbswl
 */
public class SearchAllClass extends javax.swing.JFrame  {
     String select ;
     String lecture;
     int count = 0; // 일치하는 강의 개수
     String [][] str; // JTable에 보여줄 강의요소
     String[] a; // 학기를 알기위해 임시 입력
     ShowClass show;
     FTPUtil ftputil;
    /**
     * Creates new form SearchAllClass
     */
    public SearchAllClass() {
    ftputil = new FTPUtil();
    ftputil.downloadStart();
        
        initComponents();

        setTitle("전체강의 조회");
        setSize(400,200);
        setLocationRelativeTo(null);
        setVisible(true);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jFrame2 = new javax.swing.JFrame();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "전체", "전산학과", "전자공학과", "화학공학과", "기계공학과", "항공우주공학과" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("강좌명");

        jLabel2.setText("학과");

        jButton1.setText("조회");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("취소");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(312, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        select = jComboBox1.getSelectedItem().toString();
        lecture = jTextField1.getText();
        countclass(); // 일치하는 강의 개수 체크
        
            

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
     //boolean checkclass = false;
     
    }//GEN-LAST:event_jComboBox1ActionPerformed
    public void countclass(){
        try { 
            String s;
            String[] array;
            File classFile = new File("DB\\Lecture\\AllClass.txt");
            FileReader fileReader = new FileReader(classFile);
            BufferedReader reader = new BufferedReader(fileReader);
            int x = 0;
            while ((s = reader.readLine()) != null || x == 0) {
                System.out.println(s);
                if(s !=null){
                     array = s.split("/"); 
                     //선택한 요소에 맞게 배열의 크기가 정해진다.
                    if((select.equals("전체")&&(lecture.equals("")||array[1].contains(lecture)))||(array[2].equals(select)&&(lecture.equals("")|| array[1].contains(lecture)))){
                         count++;
                          }
                    x++;
                }
 	   } 
 	   reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchAllClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SearchAllClass.class.getName()).log(Level.SEVERE, null, ex);
        } 
                    
                     str = new String[count][10]; // count된 개수만큼 배열의 크기가 정해진다.
                     inclass();
    }
    public void inclass(){ //강의를 배열에 입력한다.
             int i =0; // 강의를 넘긴다.
                  try { 
            String s;

            File classFile = new File("DB\\Lecture\\AllClass.txt"); 
            FileReader fileReader = new FileReader(classFile);
            BufferedReader reader = new BufferedReader(fileReader);
            while ((s = reader.readLine()) != null) {
                 System.out.println("");
                     a = s.split("/"); 
                     if((select.equals("전체")&&(lecture.equals("")||a[1].contains(lecture)))||(a[2].equals(select)&&lecture.equals("")) || (a[2].equals(select)&&a[1].contains(lecture))){
                         //countclass와 동일한 강의요소로 강의를 배열에 넣는다.
                        for(int j =0; j <10; j++){
                            if(j<4)
                           str[i][j] = a[j];
                            else if(j==4){
                           str[i][j] = a[j+1];                                
                            }
                            else if(j == 5){
                            boolean one = onecheck(); // 1학기 존재 여부를 찾으므로 2학기인지 1학기인지를 판단할 수 있음
                            if(one){
                                str[i][j] = "1";
                            }
                            else{
                                str[i][j] = "2";
                            }
                            }
                            else
                           str[i][j] = a[j];
                        }                             
                         i++;
                     }
 	   } 
 	   reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SearchAllClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SearchAllClass.class.getName()).log(Level.SEVERE, null, ex);
        } 
                  if(count == 0){ // 체크했던 강의 수가 0이라면 message
                      JOptionPane.showMessageDialog(null, "일치하는 강의가 존재하지 않습니다."); 
                  }
                  else   {
                         dispose();
                        show = new ShowClass(str);  
                  }

    }
        public boolean onecheck(){ // 강좌번호 txt에 1학기 강의가 개설되어있는지 확인
        String fileName ="DB\\Lecture\\"+a[0]+".txt" ;
        boolean yesorno = false;
        try{
            String number[]; // txt파일의 첫줄 강의번호
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            number= br.readLine().split("/");
            if(number[0].equals(a[0])) //1학기가 개설됨
            {
                yesorno = true;
            }
            else{
                yesorno = false;
            }
        }catch (FileNotFoundException ex) {
            Logger.getLogger(SearchAllClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SearchAllClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         return yesorno;
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
            java.util.logging.Logger.getLogger(SearchAllClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchAllClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchAllClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchAllClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchAllClass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

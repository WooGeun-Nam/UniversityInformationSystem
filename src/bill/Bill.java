package bill;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dbswl
 */
public class Bill extends javax.swing.JFrame {
    public String studentnumber;
    public static String studentname;
    public static String studentpath;
    public static boolean Bisissued;
    public static boolean isfind;
    
    public Bill() {
        initComponents();
        setTitle("학사관리자 청구서 발급");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SearchS = new javax.swing.JButton();
        IssueBill = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        studentnum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jLabel1.setText("학생이름");

        jLabel2.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jLabel2.setText("학번");

        jLabel3.setFont(new java.awt.Font("굴림", 1, 24)); // NOI18N
        jLabel3.setText("청구서 발급");

        SearchS.setText("조회");
        SearchS.setPreferredSize(new java.awt.Dimension(70, 23));
        SearchS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchSActionPerformed(evt);
            }
        });

        IssueBill.setText("발급");
        IssueBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueBillActionPerformed(evt);
            }
        });

        Cancel.setText("취소");

        jLabel4.setText("일치하는 학생 이름과 학번을 입력한 후 조회 버튼을 눌러주세요.");

        jLabel5.setText("조회 후 발급 버튼을 누르면 해당 학생에게 청구서가 발급됩니다.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(SearchS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(74, 74, 74)
                            .addComponent(IssueBill, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(studentnum, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IssueBill, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IssueBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueBillActionPerformed
        // TODO add your handling code here:
        isFind();
    }//GEN-LAST:event_IssueBillActionPerformed

    private void SearchSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchSActionPerformed
        // TODO add your handling code here:
        findstudent();
    }//GEN-LAST:event_SearchSActionPerformed

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    public void isFind(){
        if(isfind){
            Bisissued = true;
            JOptionPane.showMessageDialog(null, "학생에게 청구서를 발급했습니다");
            dispose();
        }
    }
    
    public void findstudent() {
        try{
            boolean checking = true;
            int linenum = -1;
            String s;
            String[] array;
            File classFile = new File("DB\\information.txt");
            FileReader fileReader = new FileReader(classFile);
            BufferedReader reader = new BufferedReader(fileReader);
            while ((s = reader.readLine()) != null) {
                linenum++;
                array = s.split("/"); 
                
                if(name.getText().equals(array[2]) && studentnum.getText().equals(array[0])){
                    studentnumber = array[0];
                    studentname = array[2];
                    checking = false;
                    showstclass();
                    isfind = true;
                    break;
                }
            }
 	   reader.close();
           if(checking){
                    JOptionPane.showMessageDialog(null, "입력하신 정보와 일치하는 학생이 없습니다.");
                    isfind = false;
           }
        }catch(IOException e){
            System.err.println(e);
        }
    }
    
    public void showstclass() throws FileNotFoundException, IOException{
        
        int countlec = 0;
        String str = null;
        
        File classFile = new File("DB\\Student");
        String[] classlist = classFile.list();
        int len = classlist.length;
        for(int i = 0; i < len; i++){
            if(classlist[i].contains(studentnumber)){
                studentpath = "DB\\Student\\"+studentnumber+".txt";
            }
        }
       
        String s;
        String[] array = null;
        File classfile = new File(studentpath);
        FileReader fileReader = new FileReader(classfile);
        BufferedReader reader = new BufferedReader(fileReader);
        while ((s = reader.readLine()) != null) {
            array = s.split("/"); 
            if(countlec == 0)
                str = array[0]+"      "+array[1]+"      "+array[2]+"학점\r\n";
            else
                str = str + array[0]+"      "+array[1]+"      "+array[2]+"학점\r\n";
            countlec+=1;
       } 
       reader.close();
        JOptionPane.showMessageDialog(null, str);
        System.out.println(str);
        }
        
    
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton IssueBill;
    private javax.swing.JButton SearchS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField name;
    private javax.swing.JTextField studentnum;
    // End of variables declaration//GEN-END:variables
}
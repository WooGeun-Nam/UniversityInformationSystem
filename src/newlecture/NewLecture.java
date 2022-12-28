package newlecture;

import FTP_Network.FTPUtil;
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

/**
 *
 * @author pc
 */
public class NewLecture extends javax.swing.JFrame {
    public boolean checkclass = false;
    public boolean blankclass = false;
    FTPUtil ftputil;
    
    public NewLecture() {
        initComponents();
        setTitle("강좌 등록");
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lecnum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lecname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lecgpa = new javax.swing.JTextField();
        lecdep = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lecexp = new javax.swing.JTextArea();
        newlec = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("강좌등록");

        jLabel1.setText("강좌 번호");

        jLabel2.setText("강좌 이름");

        jLabel3.setText("개설 학과");

        jLabel4.setText("학점 수");

        lecdep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "전산학과", "전자공학과", "화학공학과", "기계공학과", "항공우주공학과" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lecname, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(lecnum, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lecgpa)
                    .addComponent(lecdep, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lecdep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecgpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("강좌등록", jPanel1);

        jLabel7.setText("강좌 설명");

        lecexp.setColumns(20);
        lecexp.setRows(5);
        jScrollPane1.setViewportView(lecexp);

        newlec.setText("등록");
        newlec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newlecActionPerformed(evt);
            }
        });

        exit.setText("취소");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(newlec, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newlec)
                    .addComponent(exit))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("강좌등록-설명", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane4.getAccessibleContext().setAccessibleName("강좌정보1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newlecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newlecActionPerformed
        // TODO add your handling code here:
        if(checkblanked()){ //모든 란을 기입했는지 확인
        checkclass();
        checknewlecture();
        }
    }//GEN-LAST:event_newlecActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    
    //공란이 있는지 확인
    public boolean checkblanked(){
        System.out.println("cb");
        if(lecnum.getText().equals("") || lecname.getText().equals("") || lecgpa.getText().equals("") || lecexp.getText().equals("")) {//공란이 있으면
            JOptionPane.showMessageDialog(null, "모든 란을 입력해주세요.");  
            blankclass = false;
        }
        else
            blankclass = true;
        return blankclass;
    }
    //정보(강좌번호, 강좌명)가 겹치는 강좌가 있는지
    public void checkclass(){
        try { 
            checkclass = false;
            String s;
            String[] array;
            File classFile = new File("DB\\classinfo1.txt");
            FileReader fileReader = new FileReader(classFile);
            BufferedReader reader = new BufferedReader(fileReader);
            
            while ((s = reader.readLine()) != null) { //입력한 강좌 정보와 txt 파일의 정보들을 비교
                     array = s.split("/"); 
                     if(lecnum.getText().equals(array[0]) || lecname.getText().equals(array[1])){
                         checkclass = true;
                     }
 	   } 
 	   reader.close();
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(NewLecture.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewLecture.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    //강좌 등록
    public void checknewlecture(){
    ftputil = new FTPUtil();
    ftputil.downloadStart();
        if(checkclass == false){ //새로운 강좌이면 등록
            try {
                BufferedWriter wclass = new BufferedWriter(new FileWriter("DB\\classinfo1.txt",true));  
                wclass.write(lecnum.getText()+"/");
                wclass.write(lecname.getText()+"/");
                wclass.write(lecdep.getSelectedItem().toString()+"/");
                wclass.write(lecgpa.getText()+"/0\r\n");
                BufferedWriter wrclass = new BufferedWriter(new FileWriter("DB\\classinfo2.txt",true)); 
                wrclass.write(lecnum.getText()+"/");
                wrclass.write(lecexp.getText() +"/0"+"\r\n");
                wclass.close();
                wrclass.close();
                JOptionPane.showMessageDialog(null, "강좌가 등록되었습니다.");
    ftputil.uploadStart();
                dispose();
            } catch (IOException ex) {
                Logger.getLogger(NewLecture.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        else { //강좌 정보가 겹치면
            JOptionPane.showMessageDialog(null, "같은 정보의 강좌가 존재합니다!");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JComboBox<String> lecdep;
    private javax.swing.JTextArea lecexp;
    private javax.swing.JTextField lecgpa;
    private javax.swing.JTextField lecname;
    private javax.swing.JTextField lecnum;
    private javax.swing.JButton newlec;
    // End of variables declaration//GEN-END:variables
}

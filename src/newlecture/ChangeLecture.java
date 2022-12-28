package newlecture;

import FTP_Network.FTPUtil;
import java.io.BufferedReader;
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
public class ChangeLecture extends javax.swing.JFrame {
    public int linenum = 0;
    public int lineNum = 0;
    public String[] temporarys1 = null;
    public String[] temporarys2 = null;
    FTPUtil ftputil;
    
    public ChangeLecture(String str) {
        initComponents();
        
        setTitle("강의 변경");
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       countline(str);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lecturenum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lecturename = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lecturegpa = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        change = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("강좌등록");

        jLabel1.setText("강좌 번호");

        lecturenum.setEditable(false);

        jLabel2.setText("강좌 이름");

        jLabel3.setText("개설 학과");

        jLabel4.setText("학점 수");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------------", "전산학과", "전자공학과", "화학공학과", "기계공학과", "항공우주공학과" }));

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
                    .addComponent(lecturename, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(lecturenum, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lecturegpa)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecturenum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecturename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecturegpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("강좌수정", jPanel1);

        jLabel7.setText("강좌 설명");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        change.setText("등록");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
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
                .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(change)
                    .addComponent(exit))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("강좌수정-설명", jPanel2);

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

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedItem() == "---------------------"){ //학과가 선택되지 않았을 경우
            JOptionPane.showMessageDialog(null, "학과가 선택되지 않았습니다.\n선택 후 다시 시도 해주세요.");
        }
        else  //학과가 선택되어있을 경우
            changelec();
    }//GEN-LAST:event_changeActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose(); //창닫기
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    //classinfo1과 classinfo2를 읽어 입력받은 강좌번호와 맞는지 확인하고, 해당 강좌의 정보를 불러옴
    public void countline(String str){ 
        //classinfo1 파일을 읽어, 비교 후에 정보 불러오기
        try { 
            String s;
            String[] array;
            File classFile = new File("DB\\classinfo1.txt");
            FileReader fileReader = new FileReader(classFile);
            BufferedReader reader = new BufferedReader(fileReader);
            while ((s = reader.readLine()) != null) {
                array = s.split("/"); 
                if(str.equals(array[0])){
                    lecturenum.setText(array[0]);
                    lecturename.setText(array[1]);
                    lecturegpa.setText(array[3]);
                    lineNum = linenum;
                    break;
                }
                linenum++;
            } 
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewLecture.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewLecture.class.getName()).log(Level.SEVERE, null, ex);
        }
        //classinfo2 파일을 읽어, 비교 후에 정보 불러오기
        try { 
            String s;
            String[] array;
            File classFile = new File("DB\\classinfo2.txt");
            FileReader fileReader = new FileReader(classFile);
            BufferedReader reader = new BufferedReader(fileReader);
            while ((s = reader.readLine()) != null) {
                array = s.split("/"); 
                if(str.equals(array[0])){
                    jTextArea1.setText(array[1]);
                    break;
                }
           } 
           reader.close();
        }  catch (IOException ex) {
            Logger.getLogger(NewLecture.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //classinfo1의 변경된 강좌의 정보들을 저장. 
    //변경하고자 하는 위치 이전까지는 이동하며 dummy에 저장하고, 변경된 데이터는 따로 받아 dummy에 저장하고, 
    //변경된 데이터 다음 위치의 값부터 이어서 dummy에 저장하여 원래 파일에 덮어쓰기
    public void changelec(){
    ftputil = new FTPUtil();
    ftputil.downloadStart();
        File file = new File("DB\\classinfo1.txt");		
        String dummy = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("DB\\classinfo1.txt"));
            String line;
            for(int i=0; i<lineNum; i++) {
                line = br.readLine(); 
                dummy += (line + "\r\n" ); 
            }
            String preData = br.readLine();
            String newData = (lecturenum.getText()+"/"+lecturename.getText()+"/"+jComboBox1.getSelectedItem().toString()+"/"+lecturegpa.getText()+"/0"+"\r\n");
            dummy += newData;
            while((line = br.readLine())!=null) {
                dummy += (line + "\r\n" ); 
            }
            FileWriter fw = new FileWriter("DB\\classinfo1.txt");
            fw.write(dummy);
            fw.close();
            br.close();
            dispose();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //classinfo2의 변경된 강좌의 정보들을 저장. 
        //변경하고자 하는 위치 이전까지는 이동하며 dummy에 저장하고, 변경된 데이터는 따로 받아 dummy에 저장하고, 
        //변경된 데이터 다음 위치의 값부터 이어서 dummy에 저장하여 원래 파일에 덮어쓰기
        File Ffile = new File("DB\\classinfo2.txt");		
        String Ddummy = "";
        try {
                BufferedReader Br = new BufferedReader(new FileReader("DB\\classinfo2.txt"));
                String Lline;
                for(int i=0; i<linenum; i++) {
                    Lline = Br.readLine(); 
                    Ddummy += (Lline + "\r\n" ); 
                }
                String PreData = Br.readLine();
                String NewData = (lecturenum.getText()+"/"+jTextArea1.getText()+"/0"+"\r\n");
                Ddummy += NewData;
                while((Lline = Br.readLine())!=null) {
                    Ddummy += (Lline + "\r\n" ); 
                }
                FileWriter fw = new FileWriter("DB\\classinfo2.txt");
                fw.write(Ddummy);
                fw.close();
                Br.close();
                JOptionPane.showMessageDialog(null, "정보가 수정되었습니다.\r\n" );
    ftputil.uploadStart();
                dispose();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton change;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField lecturegpa;
    private javax.swing.JTextField lecturename;
    private javax.swing.JTextField lecturenum;
    // End of variables declaration//GEN-END:variables
}

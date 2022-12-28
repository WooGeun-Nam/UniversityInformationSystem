package pf_function;

import FTP_Network.FTPUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InputScore extends javax.swing.JFrame {
    public String Lnumber;
    String [] student = {"","","","","","","","","","","","","","","","","","",""};
    FTPUtil ftputil;
    public InputScore(String Lnumber) {
    ftputil = new FTPUtil();
    ftputil.downloadStart();
        initComponents();
        setTitle("성적입력(교수)");
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jLabel2.setText("선택된 강좌번호 : "+Lnumber);
        this.Lnumber = Lnumber;
        String fileName = "DB\\Lecture\\"+Lnumber.substring(0, 6)+".txt";
        String str = null;
        int i = 0;
            try { //로그인하고 회원정보 데이터 입력
            String s; 
            String[] array;
            File myFile = new File(fileName);
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            reader.readLine();
 	   while ((s = reader.readLine()) != null) {
                     array = s.split("/");
                     student[i] = array[0]+"/"+array[1]+"/"+array[4];
                             i += 1;
 	   } 
 	   reader.close();
 	   } catch (IOException e2) { 
 	   e2.printStackTrace(); 
 	}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            //String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return student.length; }
            public String getElementAt(int i) { return student[i]; }
        });
        jList1.setMaximumSize(new java.awt.Dimension(30, 85));
        jList1.setMinimumSize(new java.awt.Dimension(30, 85));
        jList1.setPreferredSize(new java.awt.Dimension(30, 85));
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("학번 / 이름");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "중간", "기말" }));

        jButton1.setText("입력");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("종료");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("선택된 강좌번호 : ");

        jLabel3.setText("점수 :");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "F" }));

        jLabel4.setText("학점 :");

        jButton3.setText("학점 입력");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, 0, 77, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ScoreInput();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LastScoreInput();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void ScoreInput() {
    ftputil = new FTPUtil();
    ftputil.downloadStart();
        String fileName = "DB\\Lecture\\"+Lnumber.substring(0, 6)+".txt";
        //JOptionPane.showMessageDialog(null, number);
        int userPoint = jList1.getSelectedIndex()+1;
        String [] array;
        if(jList1.getSelectedValue() == "") {
            JOptionPane.showMessageDialog(null, "학생을 선택하세요");
            return;
        }
        if(jTextField1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "점수를 입력하세요");
            return;
        }
        if(0 > Integer.parseInt(jTextField1.getText()) || 100 < Integer.parseInt(jTextField1.getText())) {
            JOptionPane.showMessageDialog(null, "점수를 정확하게 입력하세요 \r\n성적범위는 0~100 입니다.");
            return;
        }
        		String dummy = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			for(int i=0; i<userPoint; i++) {
			    line = br.readLine(); //읽으며 이동
			    dummy += (line + "\r\n" ); 
			}
			String preData = br.readLine();
                                           String newData = null;
                                           array = preData.split("/");
                                           System.out.println(preData);
                                           if (jComboBox1.getSelectedItem().toString() == "중간") {
                                               newData = array[0]+"/"+array[1]+"/"+jTextField1.getText()+"/"+array[3];
                                               for (int j = 4 ; j<20;j++) {
                                                   newData += "/"+array[j];
                                                   System.out.println(array[j]);
                                               }
                                               newData += "\r\n";
                                               dummy += newData;
                                               preData = array[2];
                                               newData = jTextField1.getText();
                                           } else if(jComboBox1.getSelectedItem().toString() == "기말") {
                                               newData = array[0]+"/"+array[1]+"/"+array[2]+"/"+jTextField1.getText();
                                               for (int j = 4 ; j<20;j++) {
                                                   newData += "/"+array[j];
                                               }
                                               newData += "\r\n"; 
                                               dummy += newData;
                                               preData = array[3];
                                               newData = jTextField1.getText();
                                           }
			while((line = br.readLine())!=null) {
				dummy += (line + "\r\n" ); 
			}
			//4. FileWriter를 이용해서 덮어쓰기
			FileWriter fw = new FileWriter(fileName);
			fw.write(dummy);
			//bw.close();
			fw.close();
			br.close();
                                           JOptionPane.showMessageDialog(null, "성적이 수정되었습니다.\r\n" + "수정 전 : " + preData +"\r\n수정 후 : " + newData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    ftputil.uploadStart();
                refresh();
    }

    public void LastScoreInput() {
    ftputil = new FTPUtil();
    ftputil.downloadStart();
        String fileName = "DB\\Lecture\\"+Lnumber.substring(0, 6)+".txt";
        //JOptionPane.showMessageDialog(null, number);
        int userPoint = jList1.getSelectedIndex() + 1;
        String [] array;
        if(jList1.getSelectedValue() == "") {
            JOptionPane.showMessageDialog(null, "학생을 선택하세요");
            return;
        }
        		String dummy = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line;
			for(int i=0; i<userPoint; i++) {
			    line = br.readLine(); //읽으며 이동
			    dummy += (line + "\r\n" ); 
			}
			String preData = br.readLine();
                                           String newData = null;
                                           array = preData.split("/");
                                               newData = array[0]+"/"+array[1]+"/"+array[2]+"/"+array[3]+"/"+jComboBox2.getSelectedItem().toString();
                                               for (int j = 5 ; j<20;j++) {
                                                   newData += "/"+array[j];
                                               }
                                               newData += "\r\n";
                                               dummy += newData;
                                               preData = array[1];
                                               newData = jTextField1.getText();
			while((line = br.readLine())!=null) {
				dummy += (line + "\r\n" ); 
			}
			//4. FileWriter를 이용해서 덮어쓰기
			FileWriter fw = new FileWriter(fileName);
			fw.write(dummy);
			//bw.close();
			fw.close();
			br.close();
                                           JOptionPane.showMessageDialog(null, "성적이 수정되었습니다.\r\n"+"수정된 학점 : "+jComboBox2.getSelectedItem().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    ftputil.uploadStart();
                refresh();
    }

    public void refresh() {
        String fileName = "DB\\Lecture\\"+Lnumber.substring(0, 6)+".txt";
        String str = null;
        int i = 0;
            try { //로그인하고 회원정보 데이터 입력
            String s; 
            String[] array;
            File myFile = new File(fileName);
            FileReader fileReader = new FileReader(myFile);
            BufferedReader reader = new BufferedReader(fileReader);
            reader.readLine();
 	   while ((s = reader.readLine()) != null) {
                     array = s.split("/");
                     student[i] = array[0]+"/"+array[1]+"/"+array[4];
                             i += 1;
 	   } 
 	   reader.close();
 	   } catch (IOException e2) { 
 	   e2.printStackTrace(); 
 	}
        jList1.setListData(student);
    }        
    
        public static void main(String[] args){
        InputScore a = new InputScore("19-001");
        a.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

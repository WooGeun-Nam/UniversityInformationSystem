package pf_function;

import FTP_Network.FTPUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.NullPointerException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AttendCheck extends javax.swing.JFrame {
    public String Lnumber;
    String [] student = {"","","","","","","","","","","","","","","","","","",""};
    FTPUtil ftputil;
    public AttendCheck(String Lnumber) {
    ftputil = new FTPUtil();
    ftputil.downloadStart();
        initComponents();
        setTitle("출석조회(교수)");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

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

        jLabel3.setText("주차");

        jLabel4.setText("유형");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "출석", "결석", "지각", "미출" }));

        jCheckBox1.setText("전체 적용");

        jButton3.setText("출결 조회");
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
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
        ChangeAttend();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        StudentAttend();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void ChangeAttend() {
    ftputil = new FTPUtil();
    ftputil.downloadStart();
        String fileName = "DB\\Lecture\\"+Lnumber.substring(0, 6)+".txt";
        //JOptionPane.showMessageDialog(null, number);
        int userPoint = jList1.getSelectedIndex()+1;
        String [] array;
        int week = Integer.parseInt(jComboBox1.getSelectedItem().toString()) + 4;
        if(jList1.getSelectedValue() == "" &&  jCheckBox1.isSelected() != true) {
            JOptionPane.showMessageDialog(null, "학생을 선택하세요");
            return;
        }
        if( jCheckBox1.isSelected() == true) { // 전체 학생 일괄 출결
        		String dummy = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			//1. 삭제하고자 하는 position 이전까지는 이동하며 dummy에 저장
			String line;
                                           String save = "";
                                           dummy += (br.readLine()+ "\r\n" );
			while((line = br.readLine())!=null) {
                                                          array = line.split("/");
                                                          save = array[0];
                                                          for(int i=1;i<array.length;i++) {
                                                                  if (i == week) save += "/"+jComboBox2.getSelectedItem().toString();
                                                                  else save += "/"+array[i];
                                                          }
				dummy += (save + "\r\n" );
			}
			//4. FileWriter를 이용해서 덮어쓰기
			FileWriter fw = new FileWriter(fileName);
			fw.write(dummy);
			fw.close();
			br.close();
                                           JOptionPane.showMessageDialog(null, "출결이 수정되었습니다.\r\n" + "수정된 주차 : "+ jComboBox1.getSelectedItem().toString() + "주차\r\n전체 학생 : " + jComboBox2.getSelectedItem().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        } else if( jCheckBox1.isSelected() != true) { // 개인 학생 출결
                      	String dummy = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			//1. 삭제하고자 하는 position 이전까지는 이동하며 dummy에 저장
			String line;
			for(int i=0; i<userPoint; i++) {
			    line = br.readLine(); //읽으며 이동
			    dummy += (line + "\r\n" ); 
			}
			//2. 삭제하고자 하는 데이터는 건너뛰기
			String preData = br.readLine();
                                           String newData = null;
                                           array = preData.split("/");
                                                          newData = array[0];
                                                          for(int i=1;i<array.length;i++) {
                                                                  if (i == week) newData += "/"+jComboBox2.getSelectedItem().toString();
                                                                  else newData += "/"+array[i];
                                                          }
                                           dummy += (newData + "\r\n");
                                           preData = array[week];
			//Log.d("mstag","삭제되는 데이터 = "+delData);
			//3. 삭제하고자 하는 position 이후부터 dummy에 저장
			while((line = br.readLine())!=null) {
				dummy += (line + "\r\n" ); 
			}
			//4. FileWriter를 이용해서 덮어쓰기
			FileWriter fw = new FileWriter(fileName);
			fw.write(dummy);
			//bw.close();
			fw.close();
			br.close();
                                           JOptionPane.showMessageDialog(null,jList1.getSelectedValue()+ "학생의 출결이 수정되었습니다.\r\n" + "수정된 주차 : "+ jComboBox1.getSelectedItem().toString() + "주차\r\n수정 전 : " + preData +"\r\n수정 후 : " + jComboBox2.getSelectedItem().toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
    ftputil.uploadStart();
    }
    
    public void StudentAttend() {
    ftputil = new FTPUtil();
    ftputil.downloadStart();
        String fileName = "DB\\Lecture\\"+Lnumber.substring(0, 6)+".txt";
        //JOptionPane.showMessageDialog(null, number);
        int userPoint = jList1.getSelectedIndex()+1;
        String [] array;
        try {
        if (jList1.getSelectedValue() == "") {
            JOptionPane.showMessageDialog(null, "학생을 선택하세요.");
        } else {
            		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			//1. 삭제하고자 하는 position 이전까지는 이동하며 dummy에 저장
			String line;
                                           int i =0;
                                           String show = jList1.getSelectedValue() +" 학생의 출결 정보 입니다.\r\n";
			while((line = br.readLine())!=null) {
                                                         array = line.split("/");
                                                         if (userPoint == i) {
                                                             for(int j = 5; j <array.length ; j++) {
                                                                 show += j-4 + "주차 : "+array[j] +"\r\n";
                                                             }
                                                         }
				i += 1;
			}
			br.close();
                                           JOptionPane.showMessageDialog(null,show);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
        }  catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "학생을 선택하세요.");
        }
    ftputil.uploadStart();
    }
    
    public static void main(String[] args){
        AttendCheck a = new AttendCheck("19-001");
        a.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

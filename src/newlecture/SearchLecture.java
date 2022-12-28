package newlecture;

import FTP_Network.FTPUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import menu.SAdminMenu;
import newclass.NewClass;


/**
 *
 * @author 12
 */
public class SearchLecture extends javax.swing.JFrame {
    public int indexcnt = 0;
    public String finder, index;
    public String [] classlist = null;
    public static String selectedsel;
    public static int trynum;
    NewClass newclass;
    DeleteLecture dlt;
    ShowLecture showlecture;
    ChangeLecture changelecture;
    SAdminMenu samenu;
    int UserPoint;
    FTPUtil ftputil;
    public SearchLecture(String selectedsel, int trynum, int userPoint) {
    ftputil = new FTPUtil();
    ftputil.downloadStart();
        initComponents();
        UserPoint = userPoint;
        this.trynum = trynum;
        this.selectedsel = selectedsel;
        buttondo(); //Search 버튼의 역할을 지정해준다
        setSize(400,400);
        setTitle("강좌 수정 및 삭제");
        setLocationRelativeTo(null);
        res.setText(selectedsel);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchcon = new javax.swing.JComboBox<>();
        Finder = new javax.swing.JTextField();
        res = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Open = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchcon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "과목번호", "과목명", "학과명" }));

        res.setEditable(false);
        res.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        res.setToolTipText("");

        Search.setText("조회");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Open.setText("강의 개설");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });

        Delete.setText("삭제");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Cancel.setText("취소");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        jLabel1.setText("강좌의 정보를 입력한 후 조회 클릭 시 선택된 강좌가 표시됩니다.");

        jLabel2.setText("조회가 성공하면, 조회한 데이터를 삭제 버튼으로 삭제가 가능합니다.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Open)
                        .addGap(18, 18, 18)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(res)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchcon, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Finder, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Finder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Open, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        finder = Finder.getText(); //Finder에서 text 받아오기
        index = searchcon.getSelectedItem().toString(); //콤보박스의 조건 받아오기
        
        howmanylec(); //총 강좌개수
        finddata(); //데이터 찾기 
    }//GEN-LAST:event_SearchActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // TODO add your handling code here:
        newclass = new NewClass(res.getText(),UserPoint);
        newclass.setVisible(true);
        dispose();
    }//GEN-LAST:event_OpenActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        String lecture = res.getText(); //선택한 강좌 값 받아오기
        dlt = new DeleteLecture(lecture,UserPoint); //deleteLecture 클래스 호출 
        dispose();
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        dispose();
        samenu = new SAdminMenu(UserPoint);
        samenu.setVisible(true);
    }//GEN-LAST:event_CancelActionPerformed

    /**
     * @param args the command line arguments
     */
     public void buttondo(){ //Search 버튼의 역할 지정
        if(trynum == 0){
              Open.setEnabled(false);
              Delete.setEnabled(false);
              Search.setText("조회");
        }
        else{
             Open.setEnabled(true);
             Delete.setEnabled(true);
             Search.setText("수정");
        }

    }
    
    public void howmanylec(){
        try{ //총 강좌의 개수 확인
            File allFile = new File("DB\\classinfo1.txt");
            FileReader FileReader = new FileReader(allFile);
            BufferedReader Breader = new BufferedReader(FileReader);
            while (Breader.readLine() != null) {
                indexcnt++;
            } 
        } catch(IOException e0) {
             System.err.println(e0);
        }
    }
    
    public void conditionalsearch(){
        String[] array;
        String s; 
        int num = 0;
        boolean numbercheck = false;    
        
        if(index == "과목번호"){
            try { //검색 내용과 비교
                File myFile = new File("DB\\classinfo1.txt");
                FileReader fileReader = new FileReader(myFile);
                BufferedReader reader = new BufferedReader(fileReader);
                classlist = new String[indexcnt];
                while ((s = reader.readLine()) != null) {
                    array = s.split("/"); 
                    if(array[0].contains(finder)){ //검색 내용이 포함되어 있으면 배열에 추가
                        classlist[num] = s;
                        System.out.println(classlist[num]);
                        num++;
                        numbercheck = true;
                    }
                } 
                reader.close();
            } catch (IOException e2) { 
                e2.printStackTrace(); 
            }catch (IndexOutOfBoundsException e) { 
                System.err.println(e);
            }
        }
        if(index == "과목명"){
            try { //검색 내용과 비교
                File myFile = new File("DB\\classinfo1.txt");
                FileReader fileReader = new FileReader(myFile);
                BufferedReader reader = new BufferedReader(fileReader);
                classlist = new String[indexcnt];
                while ((s = reader.readLine()) != null) {
                    array = s.split("/"); 
                    if(array[1].contains(finder)){ //검색 내용이 포함되어 있으면 배열에 추가
                        classlist[num] = s;
                        System.out.println(classlist[num]);
                        num++;
                        numbercheck = true;
                    }
               } 
               reader.close();
            } catch (IOException e2) { 
               e2.printStackTrace(); 
            } catch (IndexOutOfBoundsException e) { 
                System.err.println(e);
            }
        }
        if(index == "학과명"){
            try { //검색 내용과 비교
                File myFile = new File("DB\\classinfo1.txt");
                FileReader fileReader = new FileReader(myFile);
                BufferedReader reader = new BufferedReader(fileReader);
                classlist = new String[indexcnt];
                while ((s = reader.readLine()) != null) {
                    array = s.split("/"); 
                    if(array[2].contains(finder)){ //검색 내용이 포함되어 있으면 배열에 추가
                        classlist[num] = s;
                        System.out.println(classlist[num]);
                        num++;
                        numbercheck = true;
                    }
                } 
               reader.close();
            } catch (IOException e2) { 
               e2.printStackTrace(); 
            }catch (IndexOutOfBoundsException e) { 
                System.err.println(e);
            }
        }
        //check successful search
        if (numbercheck == false) {
             JOptionPane.showMessageDialog(null, "찾으려는 데이터가 없습니다!");
             trynum = 0;
             //new SearchLecture(str).setVisible(true);
            // dispose();
         } else {
             JOptionPane.showMessageDialog(null, "데이터를 찾았습니다!");
             //dispose();
            try {

                showlecture = new ShowLecture(index,classlist,UserPoint);
                showlecture.setVisible(true);
                dispose();
            } catch (IOException ex) {
                Logger.getLogger(SearchLecture.class.getName()).log(Level.SEVERE, null, ex);
            }
         } 
    }
    
    public void finddata(){
        if(trynum == 0){
            conditionalsearch();
        }
        else if(trynum == 1){
           String s = res.getText();
           String[] array = s.split("/");
           if(array[4].equals("1")){
                            JOptionPane.showMessageDialog(null, "강의가 개설되어 강좌를 수정할 수 없습니다.");
           }
           else{
           changelecture = new ChangeLecture(array[0]);
           changelecture.setVisible(true);
           }

           
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Finder;
    private javax.swing.JButton Open;
    private javax.swing.JButton Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField res;
    private javax.swing.JComboBox<String> searchcon;
    // End of variables declaration//GEN-END:variables
}

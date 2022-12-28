/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchallclass;
import FTP_Network.FTPUtil;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author dbswl
 */
public class ShowClass {
    FTPUtil ftputil;
    ShowClass(String str[][]){
    ftputil = new FTPUtil();
    ftputil.downloadStart();
    
        JFrame frame = new JFrame("전체강의조회");
        frame.setLocation(400,400);
        frame.setSize(800,400);

        String header[] = {"강좌번호","강의명","학과","학점","학년","학기","교수","최소 인원","최대 인원","현재 수강인원"};
        DefaultTableModel dtcr;
        dtcr = new DefaultTableModel(str,header){
            public boolean isCellEditable(int rowIndex,int mColIndex){ // 셀 수정 불가능
                return false;
            }
        };
        JTable table = new JTable(dtcr);
        
        table.getTableHeader().setReorderingAllowed(false); // 이동불가
        JScrollPane scrollpane = new JScrollPane(table);
        scrollpane.setPreferredSize(new Dimension(1000,200)); // 표의 크기
        frame.add(scrollpane);
        table.getTableHeader().setResizingAllowed(false); 
        final TableColumnModel columnModel = table.getColumnModel();
     for (int column = 0; column < table.getColumnCount(); column++) { // 글자 크기에 맞춰서 행 크기 설정
        int width = 100; // Min width 
       for (int row = 0; row < table.getRowCount(); row++) { 
        TableCellRenderer renderer = table.getCellRenderer(row, column); 
        Component comp = table.prepareRenderer(renderer, row, column); 
        width = Math.max(comp.getPreferredSize().width +1 , width); } 
        columnModel.getColumn(column).setPreferredWidth(width); }
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        

        
    }
}

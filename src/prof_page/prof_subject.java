/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package prof_page;

import Components.sub_packageForComp.subject_container;
import static Components.sub_packageForComp.subject_container.btnm;
import static Components.sub_packageForComp.subject_container.course;
import static Main.Prof_dash.fullname;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import net.miginfocom.swing.MigLayout;
import java.sql.*;
/**
 *
 * @author Balabal
 */
public class prof_subject extends javax.swing.JPanel {

      PreparedStatement pst;
    Connection con;
    ResultSet rs;
    
    public prof_subject() {
        initComponents();
        connect();
        this.setLayout(new MigLayout("wrap,fillx", "[][][]"));
        showSubject();
      
    }
    public void connect() {
        String url = "jdbc:mysql://localhost/mainproject_db";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error");
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }
    
     public void showSubject(){
        String sql = "Select * from `set_subject_admin` where prof='"+fullname.getText()+"'";
        
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                String  subject = rs.getString("course");
                String prof = rs.getString("prof");
                String program = rs.getString("program");
                String day = rs.getString("day");
                String time = rs.getString("schedule");
                String day_time = day + " "+ time;
                this.add(new subject_container(subject,program,day_time));
                
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

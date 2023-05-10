/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package prof_page;

import static Main.Prof_dash.fullname;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import static prof_page.set_notification.combo;
import static prof_page.set_notification.main;
/**
 *
 * @author Balabal
 */
public class notif_container extends javax.swing.JPanel {

   Connection con;
   PreparedStatement pst;
   ResultSet rs;
    
    public notif_container(String base1,String base2,String time){
        initComponents();
        connect();
        content.setText("<html><p style=\"width:180px;\">"+base2+"</p></html>");
        Time.setText(time);
        program.setText(base1);
        eks.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String base3 = fullname.getText();
                String sql = "DELETE FROM `notification_student` WHERE prof='" + base3+ "' and message='" + base2 + "' and Time_day='"+time+"'";
                try {
                    pst = con.prepareStatement(sql);
                    int k = pst.executeUpdate();
                    if (k == 1) {
                        JOptionPane.showMessageDialog(null, "Deleted");
                        main.removeAll();
                        showNotif();
                        main.repaint();
                        main.revalidate();

                    }

                } catch (SQLException ex) {
                    System.out.println(ex);
                }

            }

        });
    
    

    }

   private void showNotif() {
        String base = combo.getSelectedItem().toString();
        String name = fullname.getText();
        String sql = "Select * from `notification_student` where prof='" + name + "' and program='"+base+"'";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String program = rs.getString("program");
                String Time = rs.getString("Time_day");
                String content = rs.getString("message");

                main.add(new notif_container(program, content, Time));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cont = new Components.PanelBackground();
        program = new javax.swing.JLabel();
        eks = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        content = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 15, 19));
        setOpaque(false);

        cont.setBackground(new java.awt.Color(30, 15, 19));
        cont.setRound(30);
        cont.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        program.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        program.setForeground(new java.awt.Color(255, 255, 255));
        program.setText("BSCS 1B");
        cont.add(program, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 12, -1, -1));

        eks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cross.png"))); // NOI18N
        eks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cont.add(eks, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 23, 28));

        Time.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Time.setForeground(new java.awt.Color(153, 153, 153));
        Time.setText("03/05/2023 - 11:19 AM");
        cont.add(Time, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 34, -1, -1));

        content.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        content.setForeground(new java.awt.Color(204, 204, 204));
        content.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 10, 0));
        cont.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 59, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cont, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Time;
    private Components.PanelBackground cont;
    private javax.swing.JLabel content;
    private javax.swing.JLabel eks;
    private javax.swing.JLabel program;
    // End of variables declaration//GEN-END:variables
}

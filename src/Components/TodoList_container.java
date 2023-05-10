/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components;

import Main.Student_Dash;
import static Main.Student_Dash.count_todo;
import static Main.Student_Dash.studentnum;
import Pages_component.Home;
import Pages_component.Todo;
import static Pages_component.Todo.main;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Balabal
 */
public class TodoList_container extends javax.swing.JPanel {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public TodoList_container(String base) {
        initComponents();
        connect();
        content.setText(base);
        check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/1stCheck.png")));
       
        
  
        
        check.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String sql = "DELETE FROM `todo_student_db` WHERE student_no='" + studentnum.getText() + "' and message='" + base + "'";
                try {
                    pst = con.prepareStatement(sql);
                    int k = pst.executeUpdate();
                    if (k == 1) {
                        JOptionPane.showMessageDialog(null, "GOOD JOB, KEEP GOING");
                        countDb("todo_student_db", "student_no", studentnum.getText(), count_todo);
                        main.removeAll();
                        addItem();
                        main.repaint();
                        main.revalidate();

                    }

                } catch (SQLException ex) {
                    Logger.getLogger(TodoList_container.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });
    }

    public void addItem() {
        String sql = "Select * from `todo_student_db` where student_no='" + studentnum.getText() + "'";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String content = rs.getString("message");
                main.add(new TodoList_container(content));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Todo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void countDb(String DB, String table, String value, JLabel data_show) {
        String wander = "Select COUNT(*) As user From  `" + DB + "` where " + table + "='" + value + "'";
        int count_data;
        try {
            pst = con.prepareStatement(wander);
            rs = pst.executeQuery();
            while (rs.next()) {
                count_data = rs.getInt("user");
                String ct = Integer.toString(count_data);
                if (ct.length() == 1) {
                    data_show.setText("0" + ct);
                } else {
                    data_show.setText(ct);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
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

        panelBackground1 = new Components.PanelBackground();
        jLabel1 = new javax.swing.JLabel();
        content = new javax.swing.JLabel();
        check = new javax.swing.JLabel();

        setBackground(new java.awt.Color(14, 156, 54));
        setOpaque(false);

        panelBackground1.setBackground(new java.awt.Color(36, 29, 29));
        panelBackground1.setRound(30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/To-do.png"))); // NOI18N

        content.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        content.setForeground(new java.awt.Color(244, 235, 235));
        content.setText("Read 5 Pages of Book");

        check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkMouseClicked
        this.hide();    }//GEN-LAST:event_checkMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel check;
    public static javax.swing.JLabel content;
    private javax.swing.JLabel jLabel1;
    private Components.PanelBackground panelBackground1;
    // End of variables declaration//GEN-END:variables
}

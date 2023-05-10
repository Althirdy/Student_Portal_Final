/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package prof_page;

import static Main.Prof_dash.fullname;
import Sub_Comp.ScrollBarCustom;
import java.awt.Color;
import java.awt.Dimension;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Balabal
 */
public class set_notification extends javax.swing.JPanel {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public set_notification() {
        initComponents();
        connect();
        updatecombo();
        scroll1.getViewport().setOpaque(false);
        scroll1.setViewportBorder(null);
        message.setBackground(new Color(0, 0, 0, 0));
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JScrollBar sb = scroll.getVerticalScrollBar();
        sb.setForeground(Color.white);

        sb.setPreferredSize(new Dimension(10, 10));
        main.setLayout(new MigLayout("wrap,fillx, gapy 10", "[fill]"));
        main.removeAll();
        showNotif();
        main.repaint();
        main.revalidate();

    }

    public void updatecombo() {
        
        String sql = "SELECT * FROM `set_subject_admin` WHERE prof='" + fullname.getText() + "'";
        ArrayList<String> item = new ArrayList<String>();

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                if (item.contains(rs.getString("program"))) {

                } else {
                    item.add(rs.getString("program"));
                }
            }
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        for (String x : item) {
            combo.addItem(x);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo = new Components.ComboBoxSuggestion();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        scroll1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        ct1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        main = new javax.swing.JPanel();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Create Notification");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Notification");

        combo.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Program");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Message");

        scroll1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        scroll1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        message.setColumns(20);
        message.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        message.setForeground(new java.awt.Color(204, 204, 204));
        message.setLineWrap(true);
        message.setRows(5);
        message.setWrapStyleWord(true);
        message.setOpaque(false);
        message.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                messageKeyTyped(evt);
            }
        });
        scroll1.setViewportView(message);

        ct1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ct1.setForeground(new java.awt.Color(102, 102, 102));
        ct1.setText("/70");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/send1.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        scroll.setBackground(new java.awt.Color(20, 19, 19));
        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setOpaque(true);

        main.setBackground(new java.awt.Color(20, 19, 19));

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        scroll.setViewportView(main);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ct1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scroll1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ct1)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
    private void messageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageKeyTyped
        String s = message.getText();
        int l = s.length();
        try {
            if (l >= 100) {
                evt.consume();
            }
        } catch (Exception w) {
        }
        ct1.setText(l + "/100");
    }//GEN-LAST:event_messageKeyTyped

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/send2.png")));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/send1.png")));
    }//GEN-LAST:event_jLabel5MouseExited

    private void showNotif() {
        String base = combo.getSelectedItem().toString();
        String name = fullname.getText();
        String sql = "Select * from `notification_student` where prof='" + name + "' and program ='"+base+"'";

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
            Logger.getLogger(set_notification.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        String prog = combo.getSelectedItem().toString();
        String content = message.getText();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd    HH:mm:ss a");
        LocalDateTime now = LocalDateTime.now();
        String date_data = dtf.format(now);
        String fullname_ = fullname.getText();

        if (!message.getText().equals("")) {
            String sql = "INSERT INTO `notification_student`( `message`, `program`, `Time_day`, `prof`) VALUES (?,?,?,?)";

            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, content);
                pst.setString(2, prog);
                pst.setString(3, date_data);
                pst.setString(4, fullname_);
                int k = pst.executeUpdate();
                if (k == 1) {
                    message.setText("");
                    JOptionPane.showMessageDialog(this, "Sent");
                    main.removeAll();
                    showNotif();
                    main.repaint();
                    main.revalidate();
                }

//                    main.add(new notif_container(prog, content, date_data));
            } catch (SQLException ex) {
                Logger.getLogger(set_notification.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Put your Message");
        }


    }//GEN-LAST:event_jLabel5MouseClicked

    private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
         main.removeAll();
         showNotif();
         main.repaint();
         main.revalidate();
    }//GEN-LAST:event_comboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static Components.ComboBoxSuggestion combo;
    private javax.swing.JLabel ct1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JPanel main;
    public static javax.swing.JTextArea message;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scroll1;
    // End of variables declaration//GEN-END:variables
}

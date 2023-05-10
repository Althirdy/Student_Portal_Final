/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Pages_component;

import static Main.Student_Dash.fullname;
import static Main.Student_Dash.gender;
import static Main.Student_Dash.program;
import static Main.Student_Dash.studentnum;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.sql.*;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Balabal
 */
public class Profile extends javax.swing.JPanel {

    PreparedStatement pst;
    Connection con;
    ResultSet rs;

    public Profile() {
        initComponents();
        connect();
        full_name.setText(fullname.getText());
        student_num.setText(studentnum.getText());
        program_.setText(program.getText());
        gender_.setText(gender);
        iconGender(gender);
        passUI(old_pass);
        passUI(new_pass);
        passUI(confirm_pass);
        _email.setBackground(new Color(0, 0, 0, 0));
        _email.setEditable(false);
        _username.setBackground(new Color(0, 0, 0, 0));
        _username.setEditable(false);
        _contact.setBackground(new Color(0, 0, 0, 0));
        _contact.setEditable(false);
        showInfo();
        save.hide();
    }

    public void passUI(JPasswordField x) {
        x.setBackground(new Color(0, 0, 0, 0));

    }

    public void iconGender(String base) {

        switch (base) {
            case "Male":
                imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user.jpg")));
                break;
            case "Female":
                imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/female_logo.png")));
                break;
        }

    }

    public void connect() {
        String url = "jdbc:mysql://localhost/mainproject_db";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public void showInfo() {
        String base = studentnum.getText();
        String base1 = fullname.getText();
        String sql = "Select * from `user_db` where student_no='" + base + "' and fullname='" + base1 + "'";
        String username = "";
        String emailadd = "";
        String contactnum = "";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                username = rs.getString("username");
                emailadd = (rs.getString("email") == null) ? "N/A" : rs.getString("email");
                contactnum = (rs.getString("contact_no") == null) ? "N/A" : rs.getString("contact_no");
            }

        } catch (SQLException ex) {
            System.out.println(ex);
        }

        _username.setText(username);
        _email.setText(emailadd);
        _contact.setText(contactnum);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar1 = new Components.ImageAvatar();
        jLabel1 = new javax.swing.JLabel();
        full_name = new javax.swing.JLabel();
        student_num = new javax.swing.JLabel();
        gender_ = new javax.swing.JLabel();
        program_ = new javax.swing.JLabel();
        panelBackground1 = new Components.PanelBackground();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        save = new javax.swing.JLabel();
        _email = new javax.swing.JTextField();
        _username = new javax.swing.JTextField();
        _contact = new javax.swing.JTextField();
        panelBackground2 = new Components.PanelBackground();
        jLabel6 = new javax.swing.JLabel();
        panelBackground3 = new Components.PanelBackground();
        old_pass = new javax.swing.JPasswordField();
        button1 = new Components.Button();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelBackground4 = new Components.PanelBackground();
        new_pass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        panelBackground5 = new Components.PanelBackground();
        confirm_pass = new javax.swing.JPasswordField();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(654, 547));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageAvatar1.setForeground(new java.awt.Color(255, 255, 255));
        imageAvatar1.setBorderSize(5);
        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.jpg"))); // NOI18N
        imageAvatar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageAvatar1MouseClicked(evt);
            }
        });
        add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/photo-1469719847081-4757697d117a.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 654, 160));

        full_name.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        full_name.setForeground(new java.awt.Color(204, 204, 204));
        full_name.setText("Alfredo A. Sanger III");
        add(full_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        student_num.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        student_num.setForeground(new java.awt.Color(204, 204, 204));
        student_num.setText("20221125-N");
        add(student_num, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 30));

        gender_.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        gender_.setForeground(new java.awt.Color(204, 204, 204));
        gender_.setText("Male");
        add(gender_, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 20));

        program_.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        program_.setForeground(new java.awt.Color(204, 204, 204));
        program_.setText("BSCS 1B");
        add(program_, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, 30));

        panelBackground1.setBackground(new java.awt.Color(34, 24, 24));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Username");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Email Add");

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Contact No.");

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit.png"))); // NOI18N
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/save.png"))); // NOI18N
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });

        _email.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        _email.setForeground(new java.awt.Color(255, 255, 255));
        _email.setText("jTextField1");
        _email.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        _username.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        _username.setForeground(new java.awt.Color(255, 255, 255));
        _username.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        _contact.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        _contact.setForeground(new java.awt.Color(255, 255, 255));
        _contact.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(_username, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(_email, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11))
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackground1Layout.createSequentialGroup()
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        add(panelBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 322, 364, 190));

        panelBackground2.setBackground(new java.awt.Color(34, 24, 24));

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Old Password");

        panelBackground3.setBackground(new java.awt.Color(55, 36, 36));
        panelBackground3.setRound(25);

        old_pass.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        old_pass.setForeground(new java.awt.Color(204, 204, 204));
        old_pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 3, 1, 1));

        javax.swing.GroupLayout panelBackground3Layout = new javax.swing.GroupLayout(panelBackground3);
        panelBackground3.setLayout(panelBackground3Layout);
        panelBackground3Layout.setHorizontalGroup(
            panelBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackground3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(old_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBackground3Layout.setVerticalGroup(
            panelBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(old_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        button1.setBackground(new java.awt.Color(14, 156, 54));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Save");
        button1.setColor(new java.awt.Color(14, 156, 54));
        button1.setColorOver(new java.awt.Color(14, 138, 48));
        button1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        button1.setRadius(30);
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Change Password");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("New Password");

        panelBackground4.setBackground(new java.awt.Color(55, 36, 36));
        panelBackground4.setRound(25);

        new_pass.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        new_pass.setForeground(new java.awt.Color(204, 204, 204));
        new_pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 3, 1, 1));

        javax.swing.GroupLayout panelBackground4Layout = new javax.swing.GroupLayout(panelBackground4);
        panelBackground4.setLayout(panelBackground4Layout);
        panelBackground4Layout.setHorizontalGroup(
            panelBackground4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(new_pass)
                .addContainerGap())
        );
        panelBackground4Layout.setVerticalGroup(
            panelBackground4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(new_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Confirm New Password");

        panelBackground5.setBackground(new java.awt.Color(55, 36, 36));
        panelBackground5.setRound(25);

        confirm_pass.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        confirm_pass.setForeground(new java.awt.Color(204, 204, 204));
        confirm_pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 3, 1, 1));

        javax.swing.GroupLayout panelBackground5Layout = new javax.swing.GroupLayout(panelBackground5);
        panelBackground5.setLayout(panelBackground5Layout);
        panelBackground5Layout.setHorizontalGroup(
            panelBackground5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirm_pass)
                .addContainerGap())
        );
        panelBackground5Layout.setVerticalGroup(
            panelBackground5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(confirm_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBackground2Layout = new javax.swing.GroupLayout(panelBackground2);
        panelBackground2.setLayout(panelBackground2Layout);
        panelBackground2Layout.setHorizontalGroup(
            panelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBackground3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBackground4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBackground5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelBackground2Layout.setVerticalGroup(
            panelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBackground3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBackground4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBackground5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(panelBackground2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 240, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void imageAvatar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar1MouseClicked
        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.jpg")));
    }//GEN-LAST:event_imageAvatar1MouseClicked

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        String old_password = old_pass.getText(),
                new_password = new_pass.getText(),
                confirm_password = confirm_pass.getText();
        String sql = "SELECT * FROM `user_db` WHERE student_no='" + studentnum.getText() + "' and fullname='" + fullname.getText() + "'";

        if (!old_password.equals("") && !new_password.equals("") && !confirm_password.equals("")) {

            try {
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();
                if (rs.next()) {
                    if (new_password.equals(confirm_password)) {
                        String update = "UPDATE `user_db` SEt `password`='" + confirm_password + "' where student_no='" + studentnum.getText() + "' and fullname='" + fullname.getText() + "'";
                        pst = con.prepareStatement(update);
                        int k = pst.executeUpdate();
                        if (k == 1) {
                            JOptionPane.showMessageDialog(this, "UPDATED");
                            old_pass.setText("");
                            new_pass.setText("");
                            confirm_pass.setText("");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Password don't match");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Check your password");
                }

            } catch (SQLException ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "ERROR");
        }

    }//GEN-LAST:event_button1MouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        _username.setEditable(true);
        _email.setEditable(true);
        _contact.setEditable(true);

        save.show();
    }//GEN-LAST:event_editMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        String username = _username.getText(),
                email = _email.getText(),
                contact = _contact.getText();
        if (!username.equals("") && !email.equals("") && !contact.equals("")) {
            String select = "SELECT * from `user_db` where username=?";
            try {
                pst = con.prepareStatement(select);
                pst.setString(1, username);
                rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "This username is already taken");
                } else {
                    String sql = "UPDATE `user_db` set contact_no=?, email=?,username=? where student_no='" + studentnum.getText() + "' and fullname='" + fullname.getText() + "'";
                    try {
                        pst = con.prepareStatement(sql);
                        pst.setString(1, contact);
                        pst.setString(2, email);
                        pst.setString(3, username);
                        int k = pst.executeUpdate();
                        if (k == 1) {
                            JOptionPane.showMessageDialog(this, "UPDATED");
                            showInfo();
                            _username.setEditable(false);
                            _email.setEditable(false);
                            _contact.setEditable(false);
                            save.hide();
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_saveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField _contact;
    private javax.swing.JTextField _email;
    private javax.swing.JTextField _username;
    private Components.Button button1;
    private javax.swing.JPasswordField confirm_pass;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel full_name;
    private javax.swing.JLabel gender_;
    private Components.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField new_pass;
    private javax.swing.JPasswordField old_pass;
    private Components.PanelBackground panelBackground1;
    private Components.PanelBackground panelBackground2;
    private Components.PanelBackground panelBackground3;
    private Components.PanelBackground panelBackground4;
    private Components.PanelBackground panelBackground5;
    private javax.swing.JLabel program_;
    private javax.swing.JLabel save;
    private javax.swing.JLabel student_num;
    // End of variables declaration//GEN-END:variables
}

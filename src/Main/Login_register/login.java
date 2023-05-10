package Main.Login_register;

import Main.Admin_dash;
import Main.Prof_dash;
import Main.Student_Dash;
import static Main.Student_Dash.fullname;
import static Main.Student_Dash.studentnum;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    int positionX = 0, positionY = 0;

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public login() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        label1.setText("<html><p>Get ahead of the curve - log in and discover <br> a world of academic opportunities waiting for you</p></html>");
        border(username);
        border(pass);
        connect();
    }

    public void border(JTextField s) {
        s.setBackground(new Color(0, 0, 0, 0));
        s.setBorder(BorderFactory.createCompoundBorder(s.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));

    }

    public void connect() {
        String url = "jdbc:mysql://localhost/mainproject_db";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground1 = new Components.PanelBackground();
        Movable = new javax.swing.JPanel();
        Btn_exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        button1 = new Components.Button();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelBackground7 = new Components.PanelBackground();
        username = new javax.swing.JTextField();
        panelBackground6 = new Components.PanelBackground();
        pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBackground1.setBackground(new java.awt.Color(20, 21, 28));
        panelBackground1.setRound(30);

        Movable.setOpaque(false);
        Movable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovableMouseDragged(evt);
            }
        });
        Movable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovableMousePressed(evt);
            }
        });

        javax.swing.GroupLayout MovableLayout = new javax.swing.GroupLayout(Movable);
        Movable.setLayout(MovableLayout);
        MovableLayout.setHorizontalGroup(
            MovableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MovableLayout.setVerticalGroup(
            MovableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-green-circle-48.png"))); // NOI18N
        Btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_exitMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");

        label1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        button1.setBackground(new java.awt.Color(14, 156, 54));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Login");
        button1.setBorderColor(new java.awt.Color(255, 255, 255));
        button1.setColor(new java.awt.Color(14, 156, 54));
        button1.setColorOver(new java.awt.Color(14, 138, 48));
        button1.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        button1.setRadius(30);
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Don’t have an account? ");

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Sign in");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelBackground7.setBackground(new java.awt.Color(40, 40, 40));
        panelBackground7.setRound(25);

        username.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(204, 204, 204));
        username.setToolTipText("");
        username.setBorder(null);

        javax.swing.GroupLayout panelBackground7Layout = new javax.swing.GroupLayout(panelBackground7);
        panelBackground7.setLayout(panelBackground7Layout);
        panelBackground7Layout.setHorizontalGroup(
            panelBackground7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(username)
                .addContainerGap())
        );
        panelBackground7Layout.setVerticalGroup(
            panelBackground7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBackground6.setBackground(new java.awt.Color(40, 40, 40));
        panelBackground6.setRound(25);

        pass.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(204, 204, 204));
        pass.setBorder(null);

        javax.swing.GroupLayout panelBackground6Layout = new javax.swing.GroupLayout(panelBackground6);
        panelBackground6.setLayout(panelBackground6Layout);
        panelBackground6Layout.setHorizontalGroup(
            panelBackground6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pass)
                .addContainerGap())
        );
        panelBackground6Layout.setVerticalGroup(
            panelBackground6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Movable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBackground7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBackground6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 26, Short.MAX_VALUE))))
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Movable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBackground7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(panelBackground6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MovableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovableMouseDragged
        setLocation(evt.getXOnScreen() - positionX, evt.getYOnScreen() - positionY);
    }//GEN-LAST:event_MovableMouseDragged

    private void MovableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovableMousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_MovableMousePressed

    private void Btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Btn_exitMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
        new Register().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        String user_name = username.getText();
        String password = pass.getText();
        String sql = "SELECT * FROM `user_db` WHERE username='" + user_name + "' and password='" + password + "' ";

        try {
            Statement smt = con.createStatement();
            rs = smt.executeQuery(sql);
            if (rs.next()) {
                String base = rs.getString("userType");
                String fullname = rs.getString("fullname");
                String studentnum = rs.getString("student_no");
                String program = rs.getString("course_section");
                String sex = rs.getString("sex");
                if (base.equals("Student")) {
                    dispose();
                    new Student_Dash(fullname, studentnum, program, sex).setVisible(true);

                }else if(base.equals("Prof")){
                    dispose();
                    new Prof_dash(fullname).setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Username or password Error");
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(user_name.equals("admin") && password.equals("password")){
            dispose();
            new Admin_dash().setVisible(true);
            
        }
        
    }//GEN-LAST:event_button1MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_exit;
    private javax.swing.JPanel Movable;
    private Components.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private Components.PanelBackground panelBackground1;
    private Components.PanelBackground panelBackground6;
    private Components.PanelBackground panelBackground7;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

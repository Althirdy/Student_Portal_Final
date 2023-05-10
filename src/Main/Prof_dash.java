/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Components.subject_display;
import Main.Login_register.login;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import prof_page.prof_home;
import prof_page.prof_subject;
import prof_page.set_notification;
import java.sql.*;
import javax.swing.JLabel;
/**
 *
 * @author Balabal
 */
public class Prof_dash extends javax.swing.JFrame implements Runnable {

    int positionX, positionY;
    int hour, minute, second;

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public Prof_dash(String base1) {
        initComponents();
        connect();
        Thread t = new Thread(this);
        t.start();

        fullname.setText(base1);
        setBackground(new Color(0, 0, 0, 0));
        //----- Menu coloring
        Home.setBackground(new Color(0, 0, 0, 0));
        subject.setBackground(new Color(0, 0, 0, 0));
        Todo.setBackground(new Color(0, 0, 0, 0));
        logout.setBackground(new Color(0, 0, 0, 0));
        getContentPane().setBackground(new Color(255, 255, 255));

        //----Time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        date.setText(dtf.format(now));
        //----Date
        date();
        //---------------
        main.add(new prof_home());
        countDb("set_subject_admin","prof",fullname.getText(),count_todo);

    }

    private Prof_dash() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void date() {
        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        if (hour > 0 && hour < 11) {
            greet.setText("Good Morning");
        } else if (hour > 11 && hour < 18) {
            greet.setText("Good Afternoon");
        } else {
            greet.setText("Good Evening");
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
    
    
    
     public void countDb(String DB, String table, String value,JLabel data_show) {
        String wander = "Select COUNT(*) As user From  `"+DB+"` where "+table+"='" + value + "'";
        int count_data;
        try {
            pst = con.prepareStatement(wander);
            rs = pst.executeQuery();
            while(rs.next()){
                count_data = rs.getInt("user");
                String ct = Integer.toString(count_data);
                if (ct.length() == 1) {
                    data_show.setText("0" + ct);
                } else {
                    data_show.setText(ct);
                }
            }
        } catch (SQLException ex) {
            System.out.print(ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground1 = new Components.PanelBackground();
        Btn_exit = new javax.swing.JLabel();
        Movable = new javax.swing.JPanel();
        panelBackground3 = new Components.PanelBackground();
        fullname = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        imageAvatar1 = new Components.ImageAvatar();
        greet = new javax.swing.JLabel();
        panelBackground2 = new Components.PanelBackground();
        Home = new Components.PanelBackground();
        jLabel1 = new javax.swing.JLabel();
        Todo = new Components.PanelBackground();
        jLabel3 = new javax.swing.JLabel();
        subject = new Components.PanelBackground();
        jLabel2 = new javax.swing.JLabel();
        logout = new Components.PanelBackground();
        jLabel6 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        panelBackground4 = new Components.PanelBackground();
        show_day = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        panelBackground10 = new Components.PanelBackground();
        count_todo = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBackground1.setBackground(new java.awt.Color(20, 19, 19));
        panelBackground1.setRound(35);

        Btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-green-circle-48.png"))); // NOI18N
        Btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_exitMouseClicked(evt);
            }
        });

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

        panelBackground3.setBackground(new java.awt.Color(34, 24, 24));
        panelBackground3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullname.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fullname.setForeground(new java.awt.Color(204, 204, 204));
        fullname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullname.setText("Ryan Rei Alban");
        panelBackground3.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 185, -1));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Prof");
        panelBackground3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 180, -1));

        imageAvatar1.setForeground(new java.awt.Color(255, 255, 255));
        imageAvatar1.setToolTipText("");
        imageAvatar1.setBorderSize(2);
        imageAvatar1.setDoubleBuffered(true);
        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user.jpg"))); // NOI18N
        panelBackground3.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 70, 60));

        greet.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        greet.setForeground(new java.awt.Color(204, 204, 204));
        greet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        panelBackground2.setBackground(new java.awt.Color(34, 24, 24));
        panelBackground2.setRound(30);
        panelBackground2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setBackground(new java.awt.Color(14, 156, 54));
        Home.setRound(100);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Home.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBackground2.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 50, 50, 50));

        Todo.setBackground(new java.awt.Color(14, 156, 54));
        Todo.setRound(100);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Todo.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout TodoLayout = new javax.swing.GroupLayout(Todo);
        Todo.setLayout(TodoLayout);
        TodoLayout.setHorizontalGroup(
            TodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        TodoLayout.setVerticalGroup(
            TodoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBackground2.add(Todo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 190, 50, 50));

        subject.setBackground(new java.awt.Color(14, 156, 54));
        subject.setRound(100);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Subject.png"))); // NOI18N
        jLabel2.setToolTipText("");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout subjectLayout = new javax.swing.GroupLayout(subject);
        subject.setLayout(subjectLayout);
        subjectLayout.setHorizontalGroup(
            subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        subjectLayout.setVerticalGroup(
            subjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBackground2.add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 120, 50, 50));

        logout.setBackground(new java.awt.Color(14, 156, 54));
        logout.setRound(100);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/logout.png"))); // NOI18N
        jLabel6.setToolTipText("");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBackground2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 480, 50, 50));

        main.setOpaque(false);
        main.setLayout(new java.awt.BorderLayout());

        panelBackground4.setBackground(new java.awt.Color(34, 24, 24));
        panelBackground4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_day.setFont(new java.awt.Font("Poppins Medium", 0, 20)); // NOI18N
        show_day.setForeground(new java.awt.Color(255, 255, 255));
        show_day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_day.setText("Sunday");
        panelBackground4.add(show_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        time.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        time.setForeground(new java.awt.Color(204, 204, 204));
        time.setText("04:30:25 PM");
        panelBackground4.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, -1));

        date.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        date.setForeground(new java.awt.Color(204, 204, 204));
        date.setText("04:30:25 PM");
        panelBackground4.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 85, 118, -1));

        panelBackground10.setBackground(new java.awt.Color(34, 24, 24));
        panelBackground10.setRound(30);
        panelBackground10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        count_todo.setFont(new java.awt.Font("Poppins SemiBold", 0, 48)); // NOI18N
        count_todo.setForeground(new java.awt.Color(255, 255, 255));
        count_todo.setText("03");
        panelBackground10.add(count_todo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 64, 70));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Todo_list.png"))); // NOI18N
        jLabel23.setAutoscrolls(true);
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        panelBackground10.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 40, 46));

        jLabel24.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Total Course");
        panelBackground10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 128, -1));

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Movable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackground1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(greet, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBackground3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(panelBackground4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addComponent(panelBackground10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Movable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelBackground1Layout.createSequentialGroup()
                            .addComponent(greet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(panelBackground3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelBackground4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBackground10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Btn_exitMouseClicked

    private void MovableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovableMouseDragged
        setLocation(evt.getXOnScreen() - positionX, evt.getYOnScreen() - positionY);
    }//GEN-LAST:event_MovableMouseDragged

    private void MovableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovableMousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_MovableMousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        showForm(new prof_home());
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        Home.setBackground(Color.decode("#0E9C36"));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        Home.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        showForm(new set_notification());
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        Todo.setBackground(Color.decode("#0E9C36"));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        Todo.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        showForm(new prof_subject());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        subject.setBackground(Color.decode("#0E9C36"));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        subject.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        logout.setBackground(Color.decode("#0E9C36"));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        logout.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        showForm(new prof_subject());
    }//GEN-LAST:event_jLabel23MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Prof_dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prof_dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prof_dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prof_dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prof_dash().setVisible(true);
            }
        });
    }
    
       private void showForm(Component com) {
        main.removeAll();
        main.add(com);
        main.revalidate();
        main.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_exit;
    private Components.PanelBackground Home;
    private javax.swing.JPanel Movable;
    private Components.PanelBackground Todo;
    public static javax.swing.JLabel count_todo;
    private javax.swing.JLabel date;
    public static javax.swing.JLabel fullname;
    private javax.swing.JLabel greet;
    private Components.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private Components.PanelBackground logout;
    private javax.swing.JPanel main;
    private Components.PanelBackground panelBackground1;
    private Components.PanelBackground panelBackground10;
    private Components.PanelBackground panelBackground2;
    private Components.PanelBackground panelBackground3;
    private Components.PanelBackground panelBackground4;
    private javax.swing.JLabel show_day;
    private Components.PanelBackground subject;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            Calendar cal = Calendar.getInstance();
            hour = cal.get(Calendar.HOUR_OF_DAY);
            minute = cal.get(Calendar.MINUTE);
            second = cal.get(Calendar.SECOND);
            SimpleDateFormat sdf24 = new SimpleDateFormat("hh:mm:ss aa");
            java.util.Date dat = cal.getTime();
            String[] day_string = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            int day = cal.get(Calendar.DAY_OF_WEEK);
            time.setText(sdf24.format(dat));
            show_day.setText(day_string[day - 1]);
        }

    }
}

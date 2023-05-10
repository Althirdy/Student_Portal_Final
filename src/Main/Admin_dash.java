package Main;

import Main.Login_register.login;
import admin_Pages.Set_subject;
import admin_Pages.Student_management;
import admin_Pages.home;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Admin_dash extends javax.swing.JFrame implements Runnable {

    int positionX, positionY;
    int hour, minute, second;

    public Admin_dash() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        Thread t = new Thread(this);
//----- Menu coloring
        Home.setBackground(new Color(0, 0, 0, 0));
        subject.setBackground(new Color(0, 0, 0, 0));
        Todo.setBackground(new Color(0, 0, 0, 0));
        logout.setBackground(new Color(0, 0, 0, 0));
        getContentPane().setBackground(new Color(255,255,255));
//---- end of menu coloring
        t.start();
        date();
//-----main
        main.add(new home());
//----Time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
             LocalDateTime now = LocalDateTime.now();  
    date.setText(dtf.format(now));

    }

    private void date() {
        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        if (hour > 0 && hour < 11) {
            greet.setText("Good Morning, Admin");
        } else if (hour > 11 && hour < 18) {
            greet.setText("Good Afternoon, Admin");
        } else {
            greet.setText("Good Evening, Admin");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground1 = new Components.PanelBackground();
        Btn_exit = new javax.swing.JLabel();
        Movable = new javax.swing.JPanel();
        panelBackground3 = new Components.PanelBackground();
        jLabel7 = new javax.swing.JLabel();
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
        button1 = new Components.GlassPane.Button();

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
            .addGap(0, 808, Short.MAX_VALUE)
        );
        MovableLayout.setVerticalGroup(
            MovableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        panelBackground3.setBackground(new java.awt.Color(34, 24, 24));
        panelBackground3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Admin");
        panelBackground3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 185, -1));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("CSD Department");
        panelBackground3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

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

        show_day.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        show_day.setForeground(new java.awt.Color(255, 255, 255));
        show_day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_day.setText("Sunday");
        panelBackground4.add(show_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        time.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        time.setForeground(new java.awt.Color(204, 204, 204));
        time.setText("04:30:25 PM");
        panelBackground4.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        date.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        date.setForeground(new java.awt.Color(204, 204, 204));
        date.setText("04:30:25 PM");
        panelBackground4.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 85, 118, -1));

        button1.setBackground(new java.awt.Color(34, 24, 24));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Notification.png"))); // NOI18N

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Movable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(greet, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBackground4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBackground3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Movable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(panelBackground4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        showForm(new home());
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        Home.setBackground(Color.decode("#0E9C36"));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        Home.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        showForm(new Student_management());
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        Todo.setBackground(Color.decode("#0E9C36"));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        Todo.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        showForm(new Set_subject());
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
            java.util.logging.Logger.getLogger(Admin_dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_dash().setVisible(true);
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
    private Components.GlassPane.Button button1;
    private javax.swing.JLabel date;
    private javax.swing.JLabel greet;
    private Components.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private Components.PanelBackground logout;
    private javax.swing.JPanel main;
    private Components.PanelBackground panelBackground1;
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

package Main;

import Components.Notification;
import Components.subject_display;
import Components.GlassPane.DefaultLayoutCallBack;
import Components.GlassPane.DefaultOption;
import Components.GlassPane.GlassPanePopup;
import Main.Login_register.login;
import Pages_component.Gwa_calc;
import Pages_component.Home;
import Pages_component.Profile;
import Pages_component.Todo;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import net.miginfocom.layout.ComponentWrapper;
import net.miginfocom.layout.LayoutCallback;

public class Student_Dash extends javax.swing.JFrame implements Runnable {

    int positionX = 0, positionY = 0;
    int hour, minute, second;
    Connection con;
    PreparedStatement pst;
    Statement smt;
    ResultSet rs;
    public static String gender;
//    --------End of Global Vars

    public Student_Dash(String fullname_data, String studentnum_data, String program_data, String sex) {
        initComponents();
        connect();
        fullname.setText(fullname_data);
        studentnum.setText(studentnum_data);
        program.setText(program_data);
        gender = sex;
        iconGender(sex);
        setBackground(new Color(0, 0, 0, 0));
//   ----------Coloring for sideBar
        Home.setBackground(new Color(0, 0, 0, 0));
        subject.setBackground(new Color(0, 0, 0, 0));
        Todo.setBackground(new Color(0, 0, 0, 0));
        calc.setBackground(new Color(0, 0, 0, 0));
        profile.setBackground(new Color(0, 0, 0, 0));
        logout.setBackground(new Color(0, 0, 0, 0));
//------------- End of Coloring
        showForm(new Home());
//----------Date Start
        Thread t = new Thread(this);
        t.start();
        date();
//----Date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        date.setText(dtf.format(now));
//         ----count todo
        countDb("todo_student_db", "student_no", studentnum.getText(), count_todo);

//--------------Glasspane
        GlassPanePopup.install(this);

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
            System.out.println("Error");
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }

    private Student_Dash() {
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground1 = new Components.PanelBackground();
        Btn_exit = new javax.swing.JLabel();
        Movable = new javax.swing.JPanel();
        panelBackground2 = new Components.PanelBackground();
        Home = new Components.PanelBackground();
        jLabel1 = new javax.swing.JLabel();
        Todo = new Components.PanelBackground();
        jLabel3 = new javax.swing.JLabel();
        subject = new Components.PanelBackground();
        jLabel2 = new javax.swing.JLabel();
        calc = new Components.PanelBackground();
        jLabel4 = new javax.swing.JLabel();
        profile = new Components.PanelBackground();
        jLabel5 = new javax.swing.JLabel();
        logout = new Components.PanelBackground();
        jLabel6 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        panelBackground3 = new Components.PanelBackground();
        fullname = new javax.swing.JLabel();
        studentnum = new javax.swing.JLabel();
        program = new javax.swing.JLabel();
        imageAvatar1 = new Components.ImageAvatar();
        panelBackground4 = new Components.PanelBackground();
        show_day = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        greet = new javax.swing.JLabel();
        panelBackground10 = new Components.PanelBackground();
        count_todo = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cmd = new Components.GlassPane.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panelBackground1.setBackground(new java.awt.Color(20, 19, 19));
        panelBackground1.setRound(30);

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
            .addGap(0, 899, Short.MAX_VALUE)
        );
        MovableLayout.setVerticalGroup(
            MovableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

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

        calc.setBackground(new java.awt.Color(14, 156, 54));
        calc.setRound(100);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Calc.png"))); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout calcLayout = new javax.swing.GroupLayout(calc);
        calc.setLayout(calcLayout);
        calcLayout.setHorizontalGroup(
            calcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        calcLayout.setVerticalGroup(
            calcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBackground2.add(calc, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 260, 50, 50));

        profile.setBackground(new java.awt.Color(14, 156, 54));
        profile.setRound(100);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Profile.png"))); // NOI18N
        jLabel5.setToolTipText("");
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

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        panelBackground2.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 330, 50, 50));

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

        body.setOpaque(false);
        body.setLayout(new java.awt.BorderLayout());

        panelBackground3.setBackground(new java.awt.Color(34, 24, 24));
        panelBackground3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullname.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        fullname.setForeground(new java.awt.Color(204, 204, 204));
        fullname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullname.setText("Martin Lawrence Monte");
        panelBackground3.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, -1));

        studentnum.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        studentnum.setForeground(new java.awt.Color(204, 204, 204));
        studentnum.setText("20221125-N");
        panelBackground3.add(studentnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 80, -1));

        program.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        program.setForeground(new java.awt.Color(204, 204, 204));
        program.setText("BSCS 1B");
        panelBackground3.add(program, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        imageAvatar1.setForeground(new java.awt.Color(255, 255, 255));
        imageAvatar1.setToolTipText("");
        imageAvatar1.setBorderSize(2);
        imageAvatar1.setDoubleBuffered(true);
        imageAvatar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/user.jpg"))); // NOI18N
        panelBackground3.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 70, 60));

        panelBackground4.setBackground(new java.awt.Color(34, 24, 24));
        panelBackground4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show_day.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        show_day.setForeground(new java.awt.Color(255, 255, 255));
        show_day.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_day.setText("Sunday");
        panelBackground4.add(show_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 12, 190, -1));

        time.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        time.setForeground(new java.awt.Color(204, 204, 204));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("04:30:25 PM");
        panelBackground4.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, -1));

        date.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        date.setForeground(new java.awt.Color(204, 204, 204));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("04:30:25 PM");
        panelBackground4.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 190, -1));

        greet.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        greet.setForeground(new java.awt.Color(204, 204, 204));

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
        panelBackground10.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 40, 46));

        jLabel24.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Total Todo");
        panelBackground10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 128, -1));

        cmd.setBackground(new java.awt.Color(34, 24, 24));
        cmd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Notification.png"))); // NOI18N
        cmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(greet, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(531, 531, 531))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackground1Layout.createSequentialGroup()
                        .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBackground3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBackground4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBackground10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addComponent(Movable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Movable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(greet, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(panelBackground3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBackground4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBackground10, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
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

    private void Btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Btn_exitMouseClicked

    private void MovableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovableMousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_MovableMousePressed

    private void MovableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovableMouseDragged
        setLocation(evt.getXOnScreen() - positionX, evt.getYOnScreen() - positionY);
    }//GEN-LAST:event_MovableMouseDragged

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        subject.setBackground(Color.decode("#0E9C36"));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        subject.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        showForm(new subject_display());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        showForm(new Todo());
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        Todo.setBackground(Color.decode("#0E9C36"));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        Todo.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        showForm(new Gwa_calc());
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        calc.setBackground(Color.decode("#0E9C36"));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        calc.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        Home.setBackground(Color.decode("#0E9C36"));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        Home.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        showForm(new Profile());
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        profile.setBackground(Color.decode("#0E9C36"));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        profile.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_jLabel5MouseExited

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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        showForm(new Home());
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        showForm(new Todo());
    }//GEN-LAST:event_jLabel23MouseClicked

    private void cmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActionPerformed

        GlassPanePopup.showPopup(new Notification(), new DefaultOption() {
            @Override
            public float opacity() {
                return 0;
            }

            @Override
            public LayoutCallback getLayoutCallBack(Component parent) {
                return new DefaultLayoutCallBack(parent) {

                    public void correctBounds(ComponentWrapper cw) {
                        if (parent.isVisible()) {
                            Point pl = parent.getLocationOnScreen();
                            Point bl = cmd.getLocationOnScreen();
                            int x = bl.x - pl.x;
                            int y = bl.y - pl.y;
                            y += (1f - getAnimate()) * 10f;
                            cw.setBounds(x - cw.getWidth() + cmd.getWidth(), y + cmd.getHeight(), cw.getWidth(), cw.getHeight());

                        } else {
                            super.correctBounds(cw);
                        }
                    }

                };
            }
        });


    }//GEN-LAST:event_cmdActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Dash().setVisible(true);
            }
        });
    }

    public void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.revalidate();
        body.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_exit;
    private Components.PanelBackground Home;
    private javax.swing.JPanel Movable;
    private Components.PanelBackground Todo;
    public static javax.swing.JPanel body;
    private Components.PanelBackground calc;
    private Components.GlassPane.Button cmd;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private Components.PanelBackground logout;
    private Components.PanelBackground panelBackground1;
    private Components.PanelBackground panelBackground10;
    private Components.PanelBackground panelBackground2;
    private Components.PanelBackground panelBackground3;
    private Components.PanelBackground panelBackground4;
    private Components.PanelBackground profile;
    public static javax.swing.JLabel program;
    private javax.swing.JLabel show_day;
    public static javax.swing.JLabel studentnum;
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

package Main.Login_register;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JTextField;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    int positionX = 0, positionY = 0;
    PreparedStatement pst;
    Connection con;
    ResultSet rs;

    public Register() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        border(firstname);
        border(lastname);
        border(studentnum);
        border(program);
        border(username);
        connect();

        pass.setBackground(new Color(0, 0, 0, 0));

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

    public void border(JTextField s) {
        s.setBackground(new Color(0, 0, 0, 0));
    }

    public String gender() {
        String gender = null;
        if (male.isSelected()) {
            gender = male.getText();
        } else if (female.isSelected()) {
            gender = female.getText();
        }

        return gender;
    }

    public String usertype() {
        String type = null;
        if (a1.isSelected()) {
            type = a1.getText();
        } else if (b1.isSelected()) {
            type = b1.getText();
        }

        return type;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboSuggestionUI1 = new Components.sub_packageForComp.ComboSuggestionUI();
        panelBackground1 = new Components.PanelBackground();
        Btn_exit = new javax.swing.JLabel();
        Movable = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        description1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        description2 = new javax.swing.JLabel();
        button1 = new Components.Button();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelBackground4 = new Components.PanelBackground();
        studentnum = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelBackground7 = new Components.PanelBackground();
        firstname = new javax.swing.JTextField();
        panelBackground20 = new Components.PanelBackground();
        lastname = new javax.swing.JTextField();
        panelBackground21 = new Components.PanelBackground();
        program = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        panelBackground6 = new Components.PanelBackground();
        pass = new javax.swing.JPasswordField();
        a1 = new javax.swing.JCheckBox();
        b1 = new javax.swing.JCheckBox();
        male = new javax.swing.JCheckBox();
        female = new javax.swing.JCheckBox();
        panelBackground8 = new Components.PanelBackground();
        username = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBackground1.setBackground(new java.awt.Color(20, 21, 28));
        panelBackground1.setRound(40);

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

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register");

        description1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        description1.setForeground(new java.awt.Color(153, 153, 153));
        description1.setText("Register now for exclusive academic features ");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("First Name *");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Last Name*");

        description2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        description2.setForeground(new java.awt.Color(153, 153, 153));
        description2.setText("and your experience.");

        button1.setBackground(new java.awt.Color(14, 156, 54));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Create Account");
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
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        jPanel1.setOpaque(false);

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Already have account? ");

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Login");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelBackground4.setBackground(new java.awt.Color(40, 40, 40));
        panelBackground4.setRound(25);

        studentnum.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        studentnum.setForeground(new java.awt.Color(204, 204, 204));
        studentnum.setToolTipText("");
        studentnum.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout panelBackground4Layout = new javax.swing.GroupLayout(panelBackground4);
        panelBackground4.setLayout(panelBackground4Layout);
        panelBackground4Layout.setHorizontalGroup(
            panelBackground4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentnum, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBackground4Layout.setVerticalGroup(
            panelBackground4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentnum, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Student No. *(if Student)");

        jLabel11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Program & Section* (if Student)");

        panelBackground7.setBackground(new java.awt.Color(40, 40, 40));
        panelBackground7.setRound(25);

        firstname.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        firstname.setForeground(new java.awt.Color(204, 204, 204));
        firstname.setToolTipText("");
        firstname.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout panelBackground7Layout = new javax.swing.GroupLayout(panelBackground7);
        panelBackground7.setLayout(panelBackground7Layout);
        panelBackground7Layout.setHorizontalGroup(
            panelBackground7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstname, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBackground7Layout.setVerticalGroup(
            panelBackground7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBackground20.setBackground(new java.awt.Color(40, 40, 40));
        panelBackground20.setRound(25);

        lastname.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lastname.setForeground(new java.awt.Color(204, 204, 204));
        lastname.setToolTipText("");
        lastname.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout panelBackground20Layout = new javax.swing.GroupLayout(panelBackground20);
        panelBackground20.setLayout(panelBackground20Layout);
        panelBackground20Layout.setHorizontalGroup(
            panelBackground20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lastname, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBackground20Layout.setVerticalGroup(
            panelBackground20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBackground21.setBackground(new java.awt.Color(40, 40, 40));
        panelBackground21.setRound(25);

        program.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        program.setForeground(new java.awt.Color(204, 204, 204));
        program.setToolTipText("");
        program.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout panelBackground21Layout = new javax.swing.GroupLayout(panelBackground21);
        panelBackground21.setLayout(panelBackground21Layout);
        panelBackground21Layout.setHorizontalGroup(
            panelBackground21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(program, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBackground21Layout.setVerticalGroup(
            panelBackground21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(program, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("password *");

        panelBackground6.setBackground(new java.awt.Color(40, 40, 40));
        panelBackground6.setRound(25);

        pass.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(204, 204, 204));
        pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout panelBackground6Layout = new javax.swing.GroupLayout(panelBackground6);
        panelBackground6.setLayout(panelBackground6Layout);
        panelBackground6Layout.setHorizontalGroup(
            panelBackground6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelBackground6Layout.setVerticalGroup(
            panelBackground6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pass)
                .addContainerGap())
        );

        a1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        a1.setForeground(new java.awt.Color(204, 204, 204));
        a1.setText("Prof");
        a1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a1MouseClicked(evt);
            }
        });

        b1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(204, 204, 204));
        b1.setText("Student");
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });

        male.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        male.setForeground(new java.awt.Color(204, 204, 204));
        male.setText("Male");
        male.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        male.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maleMouseClicked(evt);
            }
        });

        female.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        female.setForeground(new java.awt.Color(204, 204, 204));
        female.setText("Female");
        female.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        female.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                femaleMouseClicked(evt);
            }
        });

        panelBackground8.setBackground(new java.awt.Color(40, 40, 40));
        panelBackground8.setRound(25);

        username.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(204, 204, 204));
        username.setToolTipText("");
        username.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout panelBackground8Layout = new javax.swing.GroupLayout(panelBackground8);
        panelBackground8.setLayout(panelBackground8Layout);
        panelBackground8Layout.setHorizontalGroup(
            panelBackground8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBackground8Layout.setVerticalGroup(
            panelBackground8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Username");

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(Movable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBackground1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBackground1Layout.createSequentialGroup()
                                        .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(panelBackground4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(panelBackground7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelBackground1Layout.createSequentialGroup()
                                                .addComponent(male)
                                                .addGap(18, 18, 18)
                                                .addComponent(female))
                                            .addComponent(panelBackground8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panelBackground1Layout.createSequentialGroup()
                                                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(panelBackground1Layout.createSequentialGroup()
                                                        .addComponent(a1)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(b1))
                                                    .addComponent(jLabel3)
                                                    .addComponent(panelBackground20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(panelBackground21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(panelBackground6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12))
                                                .addGap(0, 65, Short.MAX_VALUE))
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(description2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(description1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelBackground1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Movable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(description1)
                .addGap(2, 2, 2)
                .addComponent(description2)
                .addGap(18, 18, 18)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelBackground7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBackground4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelBackground20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBackground21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBackground6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelBackground8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(male)
                    .addComponent(female)
                    .addComponent(a1)
                    .addComponent(b1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void a1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseClicked
        if (a1.isSelected()) {
            b1.setSelected(false);
        }
    }//GEN-LAST:event_a1MouseClicked

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        if (b1.isSelected()) {
            a1.setSelected(false);
        }
    }//GEN-LAST:event_b1MouseClicked

    private void maleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maleMouseClicked
        if (male.isSelected()) {
            female.setSelected(false);
        }
    }//GEN-LAST:event_maleMouseClicked

    private void femaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_femaleMouseClicked
        if (female.isSelected()) {
            male.setSelected(false);
        }
    }//GEN-LAST:event_femaleMouseClicked

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        String first_name = firstname.getText(),
                last_name = lastname.getText(),
                student_num = studentnum.getText(),
                program_sec = program.getText(),
                user_name = username.getText(),
                password = pass.getText();
        String fullname = first_name + " " + last_name;
        String sql = "SELECT * FROM `user_db` WHERE student_no='" + student_num + "'";
        Statement smt;
        System.out.println(sql);
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "student id is already Taken");
            } else {
                String sql3 = "Select * from `user_db` where username='" + user_name + "'";
                System.out.println("check" + sql3);
                pst = con.prepareStatement(sql3);
                rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "username is already taken");
                } else {
                    if (b1.isSelected() && !fullname.equals("") && !student_num.equals("")) {
                        String sql1 = "INSERT INTO `user_db`(`student_no`,`password`, `fullname`, `sex`, `userType`,`course_section`,`username`) VALUES (?,?,?,?,?,?,?)";

                        pst = con.prepareStatement(sql1);
                        pst.setString(1, student_num);
                        pst.setString(2, password);
                        pst.setString(3, fullname);
                        pst.setString(4, gender());
                        pst.setString(5, usertype());
                        pst.setString(6, program_sec);
                        pst.setString(7, user_name);
                        int k = pst.executeUpdate();
                        if (k == 1) {
                            studentnum.setText("");
                            firstname.setText("");
                            lastname.setText("");
                            pass.setText("");
                            program.setText("");
                            username.setText("");
                            JOptionPane.showMessageDialog(null, "You are Regeistered");
                            dispose();
                            new login().setVisible(true);
                        }
                    } else if (a1.isSelected() && !fullname.equals(" ") && student_num.equals("")) {
                        String sql2 = "INSERT INTO `user_db`(`password`, `fullname`, `sex`, `userType`,`username`) VALUES (?,?,?,?,?)";
                        pst = con.prepareStatement(sql2);
                        pst.setString(1, password);
                        pst.setString(2, fullname);
                        pst.setString(3, gender());
                        pst.setString(4, usertype());
                        pst.setString(5, user_name);
                        int k = pst.executeUpdate();
                        if (k == 1) {
                            studentnum.setText("");
                            firstname.setText("");
                            lastname.setText("");
                            pass.setText("");
                            program.setText("");
                            username.setText("");
                            JOptionPane.showMessageDialog(null, "You are Regeistered");
                            dispose();
                            new login().setVisible(true);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "Error Po");
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_exit;
    private javax.swing.JPanel Movable;
    private javax.swing.JCheckBox a1;
    private javax.swing.JCheckBox b1;
    private Components.Button button1;
    private Components.sub_packageForComp.ComboSuggestionUI comboSuggestionUI1;
    private javax.swing.JLabel description1;
    private javax.swing.JLabel description2;
    private javax.swing.JCheckBox female;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastname;
    private javax.swing.JCheckBox male;
    private Components.PanelBackground panelBackground1;
    private Components.PanelBackground panelBackground20;
    private Components.PanelBackground panelBackground21;
    private Components.PanelBackground panelBackground4;
    private Components.PanelBackground panelBackground6;
    private Components.PanelBackground panelBackground7;
    private Components.PanelBackground panelBackground8;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField program;
    private javax.swing.JTextField studentnum;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

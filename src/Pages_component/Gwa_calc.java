/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Pages_component;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Balabal
 */
public class Gwa_calc extends javax.swing.JPanel {

    int k;

    public Gwa_calc() {
        initComponents();
        hide();
    }

    public void hide() {
        JTextField grade[] = {grade_1, grade_2, grade_3, grade_4, grade_5, grade_6, grade_7, grade_8, grade_9, grade_10};
        JTextField unit[] = {unit_1, unit_2, unit_3, unit_4, unit_5, unit_6, unit_7, unit_8, unit_9, unit_10};

        for (JTextField l : grade) {
            l.hide();
        }
        for (JTextField l : unit) {
            l.hide();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        grade_1 = new javax.swing.JTextField();
        unit_1 = new javax.swing.JTextField();
        grade_2 = new javax.swing.JTextField();
        unit_2 = new javax.swing.JTextField();
        unit_3 = new javax.swing.JTextField();
        grade_3 = new javax.swing.JTextField();
        unit_4 = new javax.swing.JTextField();
        grade_4 = new javax.swing.JTextField();
        grade_6 = new javax.swing.JTextField();
        unit_6 = new javax.swing.JTextField();
        unit_7 = new javax.swing.JTextField();
        grade_7 = new javax.swing.JTextField();
        unit_8 = new javax.swing.JTextField();
        grade_8 = new javax.swing.JTextField();
        unit_9 = new javax.swing.JTextField();
        grade_9 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        grade_5 = new javax.swing.JTextField();
        unit_5 = new javax.swing.JTextField();
        grade_10 = new javax.swing.JTextField();
        unit_10 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        course = new javax.swing.JTextField();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hello there");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/hi.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Let's compute your GWA");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("How many course do you have?");

        jPanel7.setBackground(new java.awt.Color(47, 44, 44));

        jLabel36.setBackground(new java.awt.Color(47, 44, 44));
        jLabel36.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Enter");
        jLabel36.setToolTipText("");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        grade_1.setBackground(new java.awt.Color(255, 255, 255));
        grade_1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        grade_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grade_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        unit_1.setBackground(new java.awt.Color(255, 255, 255));
        unit_1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        unit_1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        grade_2.setBackground(new java.awt.Color(255, 255, 255));
        grade_2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        grade_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grade_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        unit_2.setBackground(new java.awt.Color(255, 255, 255));
        unit_2.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        unit_2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        unit_3.setBackground(new java.awt.Color(255, 255, 255));
        unit_3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        unit_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        grade_3.setBackground(new java.awt.Color(255, 255, 255));
        grade_3.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        grade_3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grade_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        unit_4.setBackground(new java.awt.Color(255, 255, 255));
        unit_4.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        unit_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        grade_4.setBackground(new java.awt.Color(255, 255, 255));
        grade_4.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        grade_4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grade_4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        grade_6.setBackground(new java.awt.Color(255, 255, 255));
        grade_6.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        grade_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grade_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        unit_6.setBackground(new java.awt.Color(255, 255, 255));
        unit_6.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        unit_6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        unit_7.setBackground(new java.awt.Color(255, 255, 255));
        unit_7.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        unit_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        grade_7.setBackground(new java.awt.Color(255, 255, 255));
        grade_7.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        grade_7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grade_7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        unit_8.setBackground(new java.awt.Color(255, 255, 255));
        unit_8.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        unit_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        grade_8.setBackground(new java.awt.Color(255, 255, 255));
        grade_8.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        grade_8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grade_8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        unit_9.setBackground(new java.awt.Color(255, 255, 255));
        unit_9.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        unit_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        grade_9.setBackground(new java.awt.Color(255, 255, 255));
        grade_9.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        grade_9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grade_9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel27.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Grade");

        jLabel28.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Grade");

        jLabel29.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Units");

        jLabel30.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Units");

        grade_5.setBackground(new java.awt.Color(255, 255, 255));
        grade_5.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        grade_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grade_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        unit_5.setBackground(new java.awt.Color(255, 255, 255));
        unit_5.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        unit_5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        grade_10.setBackground(new java.awt.Color(255, 255, 255));
        grade_10.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        grade_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        grade_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        unit_10.setBackground(new java.awt.Color(255, 255, 255));
        unit_10.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        unit_10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        unit_10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel10.setBackground(new java.awt.Color(47, 44, 44));

        jLabel39.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Clear");
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(47, 44, 44));
        jPanel12.setForeground(new java.awt.Color(47, 44, 44));

        jLabel46.setBackground(new java.awt.Color(47, 44, 44));
        jLabel46.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Compute");
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel47.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        course.setBackground(new java.awt.Color(255, 255, 255));
        course.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        course.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        course.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel29)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel28)
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel30))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(grade_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(unit_1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(grade_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(unit_6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(grade_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(unit_2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(grade_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(unit_7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(grade_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(unit_3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(grade_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(unit_8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(grade_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(unit_4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(grade_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(unit_9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(grade_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(unit_5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(grade_10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(unit_10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grade_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grade_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grade_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grade_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grade_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grade_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grade_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grade_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grade_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grade_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel36jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36jLabel8MouseClicked
        JTextField grade[] = {grade_1, grade_2, grade_3, grade_4, grade_5, grade_6, grade_7, grade_8, grade_9, grade_10};
        JTextField unit[] = {unit_1, unit_2, unit_3, unit_4, unit_5, unit_6, unit_7, unit_8, unit_9, unit_10};
        try {
            k = Integer.parseInt(course.getText());
            if (k > 0 && k <= 10) {
                for (int i = 0; i < k; i++) {
                    grade[i].show();
                    unit[i].show();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Enter Valid number 1-10");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Enter Valid number");
        }
    }//GEN-LAST:event_jLabel36jLabel8MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        hide();
        jLabel47.setText("");
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        JTextField grade[] = {grade_1, grade_2, grade_3, grade_4, grade_5, grade_6, grade_7, grade_8, grade_9, grade_10};
        JTextField unit[] = {unit_1, unit_2, unit_3, unit_4, unit_5, unit_6, unit_7, unit_8, unit_9, unit_10};
        double grade_score[] = new double[k];
        int unit_score[] = new int[k];
        double unit_grade = 0;
        double sum_unit = 0;

        try {

            for (int i = 0; i < k; i++) {
                if (Double.parseDouble(grade[i].getText()) <= 5 && Double.parseDouble(unit[i].getText()) <= 5) {
                    grade_score[i] = Double.parseDouble(grade[i].getText());
                    unit_score[i] = Integer.parseInt(unit[i].getText());
                    for (int j = 0; j < k; j++) {
                        unit_grade += (grade_score[j] * unit_score[j]);
                        sum_unit += unit_score[j];
                    }
                    double GWA = unit_grade / sum_unit;

                    jLabel47.setText(Double.toString(GWA));

                } else {
                    JOptionPane.showMessageDialog(null, "GRADE OR UNITS ERROR!");
                    jLabel47.setText("ERROR");
                    break;
                }
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Enter Valid number");
        }
    }//GEN-LAST:event_jLabel46MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField course;
    private javax.swing.JTextField grade_1;
    private javax.swing.JTextField grade_10;
    private javax.swing.JTextField grade_2;
    private javax.swing.JTextField grade_3;
    private javax.swing.JTextField grade_4;
    private javax.swing.JTextField grade_5;
    private javax.swing.JTextField grade_6;
    private javax.swing.JTextField grade_7;
    private javax.swing.JTextField grade_8;
    private javax.swing.JTextField grade_9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField unit_1;
    private javax.swing.JTextField unit_10;
    private javax.swing.JTextField unit_2;
    private javax.swing.JTextField unit_3;
    private javax.swing.JTextField unit_4;
    private javax.swing.JTextField unit_5;
    private javax.swing.JTextField unit_6;
    private javax.swing.JTextField unit_7;
    private javax.swing.JTextField unit_8;
    private javax.swing.JTextField unit_9;
    // End of variables declaration//GEN-END:variables
}

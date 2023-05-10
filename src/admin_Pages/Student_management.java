/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin_Pages;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Student_management extends javax.swing.JPanel {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    private DefaultTableModel model;

    public Student_management() {
        initComponents();
        connect();

        program_.setBackground(new Color(0, 0, 0, 0));
        section_.setBackground(new Color(0, 0, 0, 0));
        text_search.setBackground(new Color(0, 0, 0, 0));
        updateTable();
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

    public void updateTable() {
        String base = text_search.getText();
        model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        String sql = "Select * from `user_db` Where userType='Student' order by fullname";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String studentnum = rs.getString("student_no");
                String fullname = rs.getString("fullname");
                String program = rs.getString("course_section");
                String sex = rs.getString("sex");
                String parts[] = program.split(" ");

                model.addRow(new Object[]{studentnum, fullname, parts[0], parts[1], sex});

            }
        } catch (SQLException ex) {
            System.out.print(ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Components.TableDark();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        studentnum_ = new javax.swing.JLabel();
        fullname_ = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        section_ = new javax.swing.JTextField();
        program_ = new javax.swing.JTextField();
        panelBackground1 = new Components.PanelBackground();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        text_search = new javax.swing.JTextField();

        setOpaque(false);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student No.", "Fullname", "Program", "Course & sec", "Sex"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Student Management");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Full name");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Student No.");

        studentnum_.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        studentnum_.setForeground(new java.awt.Color(204, 204, 204));

        fullname_.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        fullname_.setForeground(new java.awt.Color(204, 204, 204));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Program");

        jLabel10.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Section");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Edit.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        section_.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        section_.setForeground(new java.awt.Color(204, 204, 204));
        section_.setBorder(null);

        program_.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        program_.setForeground(new java.awt.Color(204, 204, 204));
        program_.setBorder(null);

        panelBackground1.setBackground(new java.awt.Color(34, 24, 24));
        panelBackground1.setRound(30);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N

        text_search.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        text_search.setForeground(new java.awt.Color(204, 204, 204));
        text_search.setText("Student Id");
        text_search.setToolTipText("");
        text_search.setBorder(null);
        text_search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                text_searchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_searchFocusLost(evt);
            }
        });
        text_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text_searchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_search, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(text_search)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studentnum_, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(fullname_, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(program_, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(panelBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(section_, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentnum_)
                            .addComponent(fullname_)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(program_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(section_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void text_searchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_searchFocusGained
           if (text_search.getText().equals("Student Id")) {
            text_search.setText("");

        }

    }//GEN-LAST:event_text_searchFocusGained

    private void text_searchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_searchFocusLost
           if (text_search.getText().equals("")) {
            text_search.setText("Student Id");

        }
    }//GEN-LAST:event_text_searchFocusLost

    private void text_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_searchKeyTyped
        String base = text_search.getText();
        System.out.println(base);
         model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        String sql = "Select * from `user_db` Where student_no='"+base+"' order by fullname";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String studentnum = rs.getString("student_no");
                String fullname = rs.getString("fullname");
                String program = rs.getString("course_section");
                String sex = rs.getString("sex");
                String parts[] = program.split(" ");

                model.addRow(new Object[]{studentnum, fullname, parts[0], parts[1], sex});
            }
        } catch (SQLException ex) {
            System.out.print(ex);
        }
       

    }//GEN-LAST:event_text_searchKeyTyped

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.getSelectedRow();
        String studentnum =table.getModel().getValueAt(row, 0).toString();
        String fullname = table.getModel().getValueAt(row, 1).toString();
        String program = table.getModel().getValueAt(row, 2).toString();
        String section = table.getModel().getValueAt(row, 3).toString();
        fullname_.setText(fullname);
        studentnum_.setText(studentnum);
        program_.setText(program);
        section_.setText(section);
    }//GEN-LAST:event_tableMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        String base = program_.getText(),
               base1 = section_.getText();
        String studentnum= studentnum_.getText();
        String fullname = fullname_.getText();
        String sql = "Update `user_db` SET `course_section`=? where student_no='"+studentnum+"' and fullname='"+fullname+"'";
        
        try {
            pst=con.prepareStatement(sql);
            pst.setString(1, base+" "+base1);
            int k = pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(this,"UPDATED");
                updateTable();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_management.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jLabel12MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fullname_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private Components.PanelBackground panelBackground1;
    private javax.swing.JTextField program_;
    private javax.swing.JTextField section_;
    private javax.swing.JLabel studentnum_;
    private Components.TableDark table;
    private javax.swing.JTextField text_search;
    // End of variables declaration//GEN-END:variables
}

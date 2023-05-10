/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin_Pages;

import java.awt.Color;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Set_subject extends javax.swing.JPanel {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    private DefaultTableModel model;

    public Set_subject() {
        initComponents();
        combo_prog.setBackground(new Color(0, 0, 0, 0));
        connect();
        updateTable();
        updatecombo();
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
        String base = combo_prog.getSelectedItem().toString();
        model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        String sql = "Select * from `set_subject_admin` Where program='" + base + "' order by day";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String course = rs.getString("course");
                String prof = rs.getString("prof");
                String program = rs.getString("program");
                String day = rs.getString("day");
                String time = rs.getString("schedule");
                String day_time = day + " " + time;
                model.addRow(new Object[]{course, prof, program, day_time});

            }
        } catch (SQLException ex) {
            System.out.print(ex);
        }

    }

    public void updatecombo() {
        String sql = "SELECT * FROM `user_db` WHERE usertype='prof'";
        ArrayList<String> item = new ArrayList<String>();

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                if (item.contains(rs.getString("fullname"))) {

                } else {
                    item.add(rs.getString("fullname"));
                }
            }
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        for (String x : item) {
            combo_prof.addItem(x);
        }

    }
    public void delete(){
     int row = table.getSelectedRow();
        String prof = (String) table.getModel().getValueAt(row, 1);
        String course = (String) table.getModel().getValueAt(row, 0);
        
        String sql = "DELETE FROM `set_subject_admin` WHERE prof='"+prof+"' and course='"+course+"'";
        
        try {
            pst=con.prepareStatement(sql);
            int k =pst.executeUpdate();
            if(k==1){
                JOptionPane.showMessageDialog(this,"Deleted");
                updateTable();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Set_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combo_prog = new Components.ComboBoxSuggestion();
        combo_prof = new Components.ComboBoxSuggestion();
        jLabel4 = new javax.swing.JLabel();
        combo_course = new Components.ComboBoxSuggestion();
        jLabel5 = new javax.swing.JLabel();
        combo_time = new Components.ComboBoxSuggestion();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Components.TableDark();
        jLabel7 = new javax.swing.JLabel();
        combo_day = new Components.ComboBoxSuggestion();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setName(""); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(591, 500));

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 250, 250));
        jLabel1.setText("Set Course for Prof and Student");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Set_subject.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Program");

        combo_prog.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BSCS 1A", "BSCS 1B", "BSIT 1A", "BSIT 1B", "BSEMC 1A", "BSEMC 1B", "BSIS 1A", "BSIS 1B" }));
        combo_prog.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        combo_prog.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_progItemStateChanged(evt);
            }
        });
        combo_prog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_progActionPerformed(evt);
            }
        });

        combo_prof.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Prof");

        combo_course.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CSS 101 (3) Introduction To Computing", "CSS 102 (5) Fundamental Of Programming", "CSS 109 (3) Business Application Software", " ", "2ND SEM", "CSS 103 (5) Intermediate Programming", "CSS 107 (5) Web System And Technologies ", "CSS 108 (3) Technical Computer Concepts" }));
        combo_course.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        combo_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_courseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Course");

        combo_time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7:00 AM", "8:00 AM", "9:00AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM", "7:00 PM" }));
        combo_time.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        combo_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_timeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Time");

        table.setForeground(new java.awt.Color(204, 204, 204));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course", "Prof", "Program", "Schedule"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        table.setRowHeight(40);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Day");

        combo_day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));
        combo_day.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        combo_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_dayActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete1.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_prog, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_day, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_time, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(combo_prog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(combo_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(combo_prof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(combo_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(combo_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combo_progActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_progActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_progActionPerformed

    private void combo_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_timeActionPerformed

    private void combo_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_dayActionPerformed

    private void combo_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_courseActionPerformed

    private void combo_progItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_progItemStateChanged
        updateTable();
    }//GEN-LAST:event_combo_progItemStateChanged

    private void jLabel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseEntered
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete2.png")));
    }//GEN-LAST:event_jLabel9MouseEntered

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/delete1.png")));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png")));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add1.png")));    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        String program = comboSelector(combo_prog),
                course = comboSelector(combo_course),
                prof = comboSelector(combo_prof),
                day = comboSelector(combo_day),
                time = comboSelector(combo_time);
        System.out.print(prof+" "+course);
        String sql = "INSERT INTO `set_subject_admin`( `course`, `prof`, `program`, `day`, `schedule`) VALUES (?,?,?,?,?)";
        String sql1 = "Select * from `set_subject_admin` where course='" + course + "' and program='" + program + "'";

        try {

            pst = con.prepareStatement(sql1);
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Course already Added");

            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, course);
                pst.setString(2, prof);
                pst.setString(3, program);
                pst.setString(4, day);
                pst.setString(5, time);
                int k = pst.executeUpdate();
                if (k == 1) {
                    JOptionPane.showMessageDialog(null, "ADDED");
                    updateTable();
                }
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Set_subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        delete();

    }//GEN-LAST:event_jLabel9MouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       
    }//GEN-LAST:event_tableMouseClicked

    public String comboSelector(JComboBox base) {
        String base1 = base.getSelectedItem().toString();

        return base1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Components.ComboBoxSuggestion combo_course;
    private Components.ComboBoxSuggestion combo_day;
    private Components.ComboBoxSuggestion combo_prof;
    private Components.ComboBoxSuggestion combo_prog;
    private Components.ComboBoxSuggestion combo_time;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private Components.TableDark table;
    // End of variables declaration//GEN-END:variables
}

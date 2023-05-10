/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Pages_component;

import static Main.Student_Dash.program;
import static Main.Student_Dash.studentnum;
import chart.ModelPolarAreaChart;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JPanel {

    Connection con;
    PreparedStatement pst;
    Statement smt;
    ResultSet rs;
    private DefaultTableModel model;

    public Home() {
        initComponents();
        String base1 = program.getText();
        String base2 = studentnum.getText();
        connect();
        countDb("user_db", "course_section", base1, count_student);
        countDb("set_subject_admin", "program", base1, count_course);
        addItem();
        UpdateTable();
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

    
    public void UpdateTable(){
            model = (DefaultTableModel) table.getModel();
             model.setRowCount(0);
             String sql = "Select * from `user_db` Where course_section='"+program.getText()+"' order by fullname";
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                String studentnum = rs.getString("student_no");
                String fullname = rs.getString("fullname");
                String sex = rs.getString("sex");
                 model.addRow(new Object[]{studentnum, fullname, sex});    
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public int gender_count(String base) {
        int count_gender = 0;
        String sql = "SELECT COUNT(*) As gender  FROM `user_db` WHERE course_section='" + program.getText() + "' and sex='" + base + "'";

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                count_gender = rs.getInt("gender");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count_gender;
    }

    public  void addItem() {
        polarAreaChart.addItem(new ModelPolarAreaChart(Color.decode("#6E5959"), "Male", gender_count("Male")));
        polarAreaChart.addItem(new ModelPolarAreaChart(Color.decode("#6E4343"), "Female", gender_count("Female")));
        polarAreaChart.start();
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

        panelBackground2 = new Components.PanelBackground();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        count_student = new javax.swing.JLabel();
        panelBackground3 = new Components.PanelBackground();
        jLabel2 = new javax.swing.JLabel();
        count_course = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Components.TableDark();
        polarAreaChart = new chart.PolarAreaChart();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(675, 547));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBackground2.setBackground(new java.awt.Color(34, 24, 24));
        panelBackground2.setRound(30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Dots.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Total Students");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/count.png"))); // NOI18N
        jLabel5.setAutoscrolls(true);

        count_student.setFont(new java.awt.Font("Poppins SemiBold", 0, 48)); // NOI18N
        count_student.setForeground(new java.awt.Color(255, 255, 255));
        count_student.setText("45");

        javax.swing.GroupLayout panelBackground2Layout = new javax.swing.GroupLayout(panelBackground2);
        panelBackground2.setLayout(panelBackground2Layout);
        panelBackground2Layout.setHorizontalGroup(
            panelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBackground2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(panelBackground2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBackground2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBackground2Layout.createSequentialGroup()
                                .addComponent(count_student, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        panelBackground2Layout.setVerticalGroup(
            panelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground2Layout.createSequentialGroup()
                .addGroup(panelBackground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBackground2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(count_student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        add(panelBackground2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 24, -1, -1));

        panelBackground3.setBackground(new java.awt.Color(34, 24, 24));
        panelBackground3.setRound(30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Dots.png"))); // NOI18N

        count_course.setFont(new java.awt.Font("Poppins SemiBold", 0, 48)); // NOI18N
        count_course.setForeground(new java.awt.Color(255, 255, 255));
        count_course.setText("03");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/courses.png"))); // NOI18N
        jLabel8.setAutoscrolls(true);

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Total Courses");

        javax.swing.GroupLayout panelBackground3Layout = new javax.swing.GroupLayout(panelBackground3);
        panelBackground3.setLayout(panelBackground3Layout);
        panelBackground3Layout.setHorizontalGroup(
            panelBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackground3Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addGroup(panelBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBackground3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(count_course, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBackground3Layout.setVerticalGroup(
            panelBackground3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelBackground3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(count_course, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        add(panelBackground3, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 29, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Student No.", "Name", "Sex"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        table.setGridColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 221, 579, 310));
        add(polarAreaChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 280, 200));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel count_course;
    private javax.swing.JLabel count_student;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private Components.PanelBackground panelBackground2;
    private Components.PanelBackground panelBackground3;
    private chart.PolarAreaChart polarAreaChart;
    private Components.TableDark table;
    // End of variables declaration//GEN-END:variables
}

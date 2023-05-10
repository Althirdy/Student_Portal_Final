/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package admin_Pages;

import BarChart.ModelChart;
import chart.ModelPolarAreaChart;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class home extends javax.swing.JPanel {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public home() {
        initComponents();
        connect();
        BarChart();
        countDb("Student", count_student);
        countDb("Prof", count_prof);
        addItem();
        countDb("Student",count_student);
        countDb("Prof",count_prof);
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

    public void countDb(String base, JLabel base2) {
        String sql = "Select COUNT(*) as User from `user_db`where userType='" + base + "'";
        int count_Db = 0;

        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                count_Db = rs.getInt("User");
                String ct = Integer.toString(count_Db);
                if (ct.length() == 1) {
                    base2.setText("0" + ct);
                } else {
                    base2.setText(ct);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public double count_student(String base,String base2) {
        String sql = "Select COUNT(*) as User from `user_db` where "+base2+"='" + base + "'";
        double count_Db = 0;
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                count_Db = rs.getInt("User");

            }
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }

        return count_Db;
    }

    
    public void BarChart() {
        chart.addLegend("1A", Color.decode("#654DF8"));
        chart.addLegend("1B", Color.decode("#F04D19"));
        chart.addData(new ModelChart("BSCS", new double[]{count_student("BSCS 1A","course_section"), count_student("BSCS 1B","course_section")}));
        chart.addData(new ModelChart("BSIT", new double[]{count_student("BSIT 1A","course_section"), count_student("BSIT 1B","course_section")}));
        chart.addData(new ModelChart("BSEMC", new double[]{count_student("BSEMC 1A","course_section"), count_student("BSEMC 1B","course_section")}));
        chart.addData(new ModelChart("BSIS", new double[]{count_student("BSIS 1A","course_section"), count_student("BSIS 1B","course_section")}));
        chart.start();
    }

    public void addItem() {
        polarAreaChart.addItem(new ModelPolarAreaChart(Color.decode("#6E5959"), "Student",Integer.parseInt(count_student.getText())));
        polarAreaChart.addItem(new ModelPolarAreaChart(Color.decode("#6E4343"), "Prof", Integer.parseInt(count_prof.getText())));
        polarAreaChart.start();
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
        count_prof = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        polarAreaChart = new chart.PolarAreaChart();
        chart = new BarChart.Chart();

        setOpaque(false);

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

        panelBackground3.setBackground(new java.awt.Color(34, 24, 24));
        panelBackground3.setRound(30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Dots.png"))); // NOI18N

        count_prof.setFont(new java.awt.Font("Poppins SemiBold", 0, 48)); // NOI18N
        count_prof.setForeground(new java.awt.Color(255, 255, 255));
        count_prof.setText("03");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/courses.png"))); // NOI18N
        jLabel8.setAutoscrolls(true);

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Total of Prof");

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
                            .addComponent(count_prof, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(count_prof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        chart.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        chart.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelBackground2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBackground3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(polarAreaChart, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelBackground3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBackground2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(polarAreaChart, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chart, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BarChart.Chart chart;
    private javax.swing.JLabel count_prof;
    private javax.swing.JLabel count_student;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Components.PanelBackground panelBackground2;
    private Components.PanelBackground panelBackground3;
    private chart.PolarAreaChart polarAreaChart;
    // End of variables declaration//GEN-END:variables
}

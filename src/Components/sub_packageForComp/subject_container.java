/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components.sub_packageForComp;

import Components.subject_display;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Balabal
 */
public class subject_container extends javax.swing.JPanel {

  
    public subject_container(String base, String base1,String time) {
        initComponents();
        
        prof.setText("<html><p style=text-align:center;>" + base1 + "</p></html>");
        course.setText("<html><p style=width:150px; text-align: center;>" + base + "</p></html>");
        day_time.setText("<html><p style=text-align:center;>" + time + "</p></html>");
//        btnm.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                hide();
//                System.out.println(base);
//            }
//        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground1 = new Components.PanelBackground();
        btnm = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        prof = new javax.swing.JLabel();
        day_time = new javax.swing.JLabel();

        setOpaque(false);

        panelBackground1.setBackground(new java.awt.Color(34, 24, 24));
        panelBackground1.setRound(30);

        btnm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Dots.png"))); // NOI18N
        btnm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmMouseClicked(evt);
            }
        });

        course.setFont(new java.awt.Font("Poppins Medium", 0, 15)); // NOI18N
        course.setForeground(new java.awt.Color(255, 255, 255));
        course.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        prof.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        prof.setForeground(new java.awt.Color(204, 204, 204));
        prof.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        day_time.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        day_time.setForeground(new java.awt.Color(204, 204, 204));
        day_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        day_time.setText("Sunday 3:00 PM");

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackground1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnm, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBackground1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prof, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(day_time, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prof, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(day_time, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmMouseClicked
    }//GEN-LAST:event_btnmMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel btnm;
    public static javax.swing.JLabel course;
    private javax.swing.JLabel day_time;
    private Components.PanelBackground panelBackground1;
    public static javax.swing.JLabel prof;
    // End of variables declaration//GEN-END:variables
}

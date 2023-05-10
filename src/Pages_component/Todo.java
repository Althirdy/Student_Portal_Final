package Pages_component;

import Components.TodoList_container;
import static Components.TodoList_container.check;
import static Components.TodoList_container.content;
import static Main.Student_Dash.count_todo;
import static Main.Student_Dash.studentnum;
import Sub_Comp.ScrollBarCustom;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Todo extends javax.swing.JPanel {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Todo() {
        initComponents();
        connect();
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JScrollBar sb = scroll.getVerticalScrollBar();
        sb.setForeground(Color.white);
        sb.setPreferredSize(new Dimension(10, 10));
        main.setLayout(new MigLayout("wrap 1,fillx,inset 5, gapy 10", "[fill]"));
        main.removeAll();
        addItem();
        main.repaint();
        main.revalidate();

        countDb("todo_student_db", "student_no", studentnum.getText(), count_todo);

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

    public void addItem() {
        String sql = "Select * from `todo_student_db` where student_no='" + studentnum.getText() + "'";
        try {
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String content = rs.getString("message");
                main.add(new TodoList_container(content));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Todo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        main = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelBackground1 = new Components.PanelBackground();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        content_data = new javax.swing.JTextField();

        setName(""); // NOI18N
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(594, 488));

        scroll.setBackground(new java.awt.Color(20, 19, 19));
        scroll.setBorder(null);
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setOpaque(true);

        main.setBackground(new java.awt.Color(20, 19, 19));

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );

        scroll.setViewportView(main);

        jLabel1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Let's create your To-Do list");

        panelBackground1.setBackground(new java.awt.Color(36, 29, 29));
        panelBackground1.setRound(35);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add_icon.png"))); // NOI18N

        content_data.setBackground(new java.awt.Color(36, 29, 29));
        content_data.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        content_data.setForeground(new java.awt.Color(102, 102, 102));
        content_data.setText("what is your next task?");
        content_data.setToolTipText("");
        content_data.setBorder(null);
        content_data.setOpaque(true);
        content_data.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                content_dataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                content_dataFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelBackground1Layout = new javax.swing.GroupLayout(panelBackground1);
        panelBackground1.setLayout(panelBackground1Layout);
        panelBackground1Layout.setHorizontalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBackground1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(content_data, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBackground1Layout.setVerticalGroup(
            panelBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content_data)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(panelBackground1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void content_dataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_content_dataFocusLost
        content_data.setForeground(new java.awt.Color(102, 102, 102));
        String base = content_data.getText();
        if (base.equals("")) {
            content_data.setText("what is your next task?");
        }

    }//GEN-LAST:event_content_dataFocusLost

    private void content_dataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_content_dataFocusGained
        content_data.setForeground(new java.awt.Color(220, 220, 220));

        String base = content_data.getText();
        if (base.equals("what is your next task?")) {
            content_data.setText("");
        }
    }//GEN-LAST:event_content_dataFocusGained

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
      
        if(!content_data.getText().equals("") && !content_data.getText().equals("what is your next task?")){
            try {
            String sql = "Insert into `todo_student_db` (`student_no`,`message`) VALUES (?,?)";

            pst = con.prepareStatement(sql);
            pst.setString(1, studentnum.getText());
            pst.setString(2, content_data.getText());
            int k = pst.executeUpdate();
            if (k == 1) {
                content_data.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Todo.class.getName()).log(Level.SEVERE, null, ex);
        }
        main.removeAll();
        addItem();
        main.repaint();
        main.revalidate();
        countDb("todo_student_db", "student_no", studentnum.getText(), count_todo);
        }else{
            JOptionPane.showMessageDialog(this,"Please input your task");
        }
        
        
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField content_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JPanel main;
    private Components.PanelBackground panelBackground1;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}

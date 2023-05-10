package Components;

import Components.sub_packageForComp.subject_container;
import static Components.sub_packageForComp.subject_container.btnm;
import static Components.sub_packageForComp.subject_container.course;
import static Main.Student_Dash.program;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import net.miginfocom.swing.MigLayout;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class subject_display extends javax.swing.JPanel {

    PreparedStatement pst;
    Connection con;
    ResultSet rs;
    
    
    public subject_display() {
        initComponents();
        connect();
        this.setLayout(new MigLayout("wrap,fillx", "[][][]"));
//        btnm.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                System.out.println(course.getText());
//            }
//        });
        showSubject();
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
    public void showSubject(){
        String sql = "Select * from `set_subject_admin` where program='"+program.getText()+"'";
        
        try {
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
                String  subject = rs.getString("course");
                String prof = rs.getString("prof");
                String day = rs.getString("day");
                String time = rs.getString("schedule");
                String day_time = day + " "+ time;
                this.add(new subject_container(subject,prof,day_time));
                
        
            }
        } catch (SQLException ex) {
            Logger.getLogger(subject_display.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

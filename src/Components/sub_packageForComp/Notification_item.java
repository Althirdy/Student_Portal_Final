/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Components.sub_packageForComp;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Balabal
 */
public class Notification_item extends javax.swing.JPanel {

   
    
    public Notification_item(String fullname,String time,String message) {
        initComponents();
        prof_name.setText(fullname);
        date.setText(time);
        content.setText("<html><p style=width:150px; >" + message + "</p></html>");
        setOpaque(false);
        super.setBackground(this.getBackground());
    }

     public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
        createImage();
        repaint();
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        repaint();
    }

    @Override
    public void setBackground(Color color) {
        super.setBackground(color);
        createImage();
    }

    private int round = 15;
    private Icon image;
    private BufferedImage bffImage;

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        if (bffImage != null) {
            g2.drawImage(bffImage, 0, 0, null);
        } else {
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), round, round);
        }
        g2.dispose();
        super.paint(grphcs);
    }

    private void createImage() {
        if (image != null) {
            int width = getWidth();
            int height = getHeight();
            Rectangle size = getAutoSize(image);
            bffImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2_img = bffImage.createGraphics();
            g2_img.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2_img.fillRoundRect(0, 0, width, height, round, round);
            g2_img.setComposite(AlphaComposite.SrcIn);
            g2_img.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g2_img.drawImage(toImage(image), size.x, size.y, size.width, size.height, null);
            g2_img.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, 0.8f));
            g2_img.setColor(getBackground());
            g2_img.fillRect(0, 0, getWidth(), getHeight());
            g2_img.dispose();
        } else {
            bffImage = null;
        }
    }

    private Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
        if (w > image.getIconWidth()) {
            w = image.getIconWidth();
        }
        if (h > image.getIconHeight()) {
            h = image.getIconHeight();
        }
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        int x = getWidth() / 2 - (width / 2);
        int y = getHeight() / 2 - (height / 2);
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }

    private Image toImage(Icon icon) {
        return ((ImageIcon) icon).getImage();
    }

    @Override
    public void setBounds(int i, int i1, int i2, int i3) {
        super.setBounds(i, i1, i2, i3);
        createImage();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageAvatar2 = new Components.ImageAvatar();
        prof_name = new javax.swing.JLabel();
        content = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setBackground(new java.awt.Color(45, 32, 32));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 5, 3));

        imageAvatar2.setBackground(new java.awt.Color(102, 102, 102));
        imageAvatar2.setToolTipText("");
        imageAvatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/prof_icon.png"))); // NOI18N
        imageAvatar2.setOpaque(true);

        prof_name.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        prof_name.setForeground(new java.awt.Color(204, 204, 204));
        prof_name.setText("Mark Garrote");

        content.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        content.setForeground(new java.awt.Color(204, 204, 204));
        content.setText("jLabel2");
        content.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        date.setFont(new java.awt.Font("Poppins Light", 0, 11)); // NOI18N
        date.setForeground(new java.awt.Color(204, 204, 204));
        date.setText("05/04/2023 3:39PM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(prof_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(104, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prof_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date))
                    .addComponent(imageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel content;
    private javax.swing.JLabel date;
    private Components.ImageAvatar imageAvatar2;
    private javax.swing.JLabel prof_name;
    // End of variables declaration//GEN-END:variables
}

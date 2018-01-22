
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import org.imgscalr.Scalr;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author krishnapradeep
 */
public class ModelDetails extends javax.swing.JFrame {

    /**
     * Creates new form ModelDetails
     */
    public ModelDetails(String id) {
        initComponents();

/*category-listing code*/
        try {

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegift", "root", "");
            System.err.println("ok");
            Statement s = c.createStatement();

            ResultSet r = s.executeQuery("select * from category");

            while (r.next()) {
                // System.out.println(r.getString("c1")+" "+r.getString("c2")+" "+r.getString("c3"));

                b1.addItem(r.getString("category_name"));
                /* v.add(r.getString("category"));
                v.add(r.getString("prize"));
                v.add(r.getString("quantity"));
                v.add(r.getString("model"));
                v.add(r.getString("color"));
                v.add(r.getString("size"));
                de.addRow(v);*/
//                try {
//                    BufferedImage bi = ImageIO.read(new File("C:\\wamp\\www\\Eshopper\\images\\" + r.getString("IMAGE")));
//
//                    System.out.println("Height : " + bi.getHeight());
//                    System.out.println("Width : " + bi.getWidth());
//                    //---Resizing buffered image; return : bufferedimage -----
//                    bi = Scalr.resize(bi, 350, 180);
//                    image.setIcon(new ImageIcon(bi));
//
//                } catch (IOException e) {
//                }

            }

        } catch (SQLException ex) {
            System.out.println("not ok");
            Logger.getLogger(ViewModel.class.getName()).log(Level.SEVERE, null, ex);
        }




        try {

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegift", "root", "");
            System.err.println("ok");
            Statement s = c.createStatement();

            ResultSet r = s.executeQuery("select * from product where id=" + id);

            while (r.next()) {
                // System.out.println(r.getString("c1")+" "+r.getString("c2")+" "+r.getString("c3"));

                a1.setText(r.getString("productname"));
                 b1.setSelectedItem(r.getString("category"));
                c1.setText(r.getString("prize"));
                d1.setText(r.getString("quantity"));
                e1.setText(r.getString("model"));
                f1.setText(r.getString("color"));
                g1.setText(r.getString("size"));
               // de.addRow(v);
                try {
                    BufferedImage bi = ImageIO.read(new File("C:\\wamp\\www\\Eshopper\\images\\" + r.getString("IMAGE")));

                    System.out.println("Height : " + bi.getHeight());
                    System.out.println("Width : " + bi.getWidth());
                    //---Resizing buffered image; return : bufferedimage -----
                    bi = Scalr.resize(bi, 350, 180);
                    image.setIcon(new ImageIcon(bi));

                } catch (IOException e) {
                }

            }

        } catch (SQLException ex) {
            System.out.println("not ok");
            Logger.getLogger(ViewModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        b1 = new javax.swing.JComboBox<>();
        g1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        a1 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        d1 = new javax.swing.JTextField();
        e1 = new javax.swing.JTextField();
        f1 = new javax.swing.JTextField();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setForeground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setForeground(new java.awt.Color(0, 153, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1030, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Size");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 140, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Prize");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 140, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Product Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 140, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Category");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 140, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Quantity");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 140, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Model");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Color");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 140, 30));

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 150, -1));
        getContentPane().add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 90, -1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 102));
        jButton1.setText("Update");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, 110, 30));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 102, 102));
        jButton2.setText("Delete");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 110, 30));

        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 150, -1));
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 90, -1));
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 150, -1));
        getContentPane().add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 150, -1));
        getContentPane().add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 150, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mug.jpg"))); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 600, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JComboBox<String> b1;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField d1;
    private javax.swing.JTextField e1;
    private javax.swing.JTextField f1;
    private javax.swing.JTextField g1;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}

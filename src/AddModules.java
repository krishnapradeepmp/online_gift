/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.imgscalr.Scalr;

/**
 *
 * @author krishnapradeep
 */
public class AddModules extends javax.swing.JFrame {

    private int flag_image = 0;

    /**
     * Creates new form AddModules
     */
    public AddModules() {
        initComponents();
        try {

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegift", "root", "");
            System.err.println("ok");
            Statement s = c.createStatement();

            ResultSet r = s.executeQuery("select * from category");

            while (r.next()) {
                // System.out.println(r.getString("c1")+" "+r.getString("c2")+" "+r.getString("c3"));

                b.addItem(r.getString("category_name"));

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

        filechooser = new javax.swing.JFileChooser();
        jLabel2 = new javax.swing.JLabel();
        g = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        f = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        c2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        d = new javax.swing.JTextField();
        e = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        b = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("QUANTITY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 80, 23));

        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });
        getContentPane().add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 200, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("PRODUCT NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, 23));

        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 200, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("CATEGORY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 80, 23));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("PRICE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 80, 23));

        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        getContentPane().add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 200, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 204));
        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 550, 120, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("CANCEL");
        jButton2.setActionCommand("OK");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 110, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 110, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 204));
        jButton4.setText("ADD PICTURE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 230, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("SIZE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 70, 20));

        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("MODEL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 70, 20));

        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 200, 30));

        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 200, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 255));
        jLabel8.setText("COLOR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 70, 20));

        b.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        b.setForeground(new java.awt.Color(0, 153, 204));
        b.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category" }));
        b.setPreferredSize(new java.awt.Dimension(6, 20));
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 200, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("ADD MODELS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 190, 47));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/downloadd.png"))); // NOI18N
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 290, 220));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plain-Light-Blue-Background.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (a.getText().isEmpty()) {

            JOptionPane.showMessageDialog(rootPane, "Plz Enter Product Name");
        } else if (c2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Prize");
        } else if (d.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Model");
        } else if (e.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Specify Color");
        } else if (f.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Fill the 'Size' field");
        } else if (g.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Quantity");
        } else if (b.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Please Select a Category");
        } else if (flag_image == 0) {
            JOptionPane.showMessageDialog(rootPane, "Please Choose an Image File");
        } else {

            File SourceFile, myfile = null;
            SourceFile = filechooser.getSelectedFile();
            try {
                if (!Files.exists(Paths.get("C:\\wamp\\www\\Eshopper\\images\\"))) {

                    new File("C:\\wamp\\www\\Eshopper\\images\\").mkdir();
                }
                myfile = new File("C:\\wamp\\www\\Eshopper\\images\\" + a.getText() + ".jpg");
                System.out.println(myfile.getPath());
            } catch (NullPointerException ex) {
                Logger.getLogger(AddModules.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {

                if (!SourceFile.exists()) {
                    System.out.println("Sourcefile doesn't Exist");
                }
                if (!myfile.exists()) {
                    myfile.createNewFile();
                }
                FileChannel source;
                FileChannel destination;
                source = new FileInputStream(SourceFile).getChannel();
                destination = new FileOutputStream(myfile).getChannel();
                if (destination != null && source != null) {
                    destination.transferFrom(source, 0, source.size());
                }
                if (source != null) {
                    source.close();
                }
                if (destination != null) {
                    destination.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(AddModules.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {

                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegift", "root", "");
                System.err.println("ok");
                Statement s = c.createStatement();
                s.executeUpdate("insert into product(productname,category,prize,quantity,model,color,size,IMAGE)"
                        + "values('" + a.getText() + "','" + b.getSelectedItem() + "'," + c2.getText() + ",'" + g.getText() + "','" + d.getText() + "','" + e.getText() + "','" + f.getText() + "','" + myfile.getName() + "');");
                //return true;

            } catch (SQLException ex) {
                System.out.println("not ok");
                Logger.getLogger(AddModules.class.getName()).log(Level.SEVERE, null, ex);
                // return false;
            }
        }// TODO add your handling code here: // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dashboard hh = new Dashboard();
        hh.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        filechooser.setDialogTitle("Choose Your Photo");
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        filechooser.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "PNG", "JPG"));
        //filechooser.setAcceptAllFileFilterUsed(true);
        filechooser.setCurrentDirectory(new File("C:\\Users\\Public\\Pictures"));

        //below codes for select  the file
        int returnval = filechooser.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION) {
            File source = filechooser.getSelectedFile();

            try {
                BufferedImage bi = ImageIO.read(source);

                System.out.println("Height : " + bi.getHeight());
                System.out.println("Width : " + bi.getWidth());
                //---Resizing buffered image; return : bufferedimage -----
                bi = Scalr.resize(bi, 350, 180);
                pic.setIcon(new ImageIcon(bi));
                flag_image = 1;
                System.out.println(source);

            } catch (IOException e) {
            }
            this.pack();
        }        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddModules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddModules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddModules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddModules.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddModules().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JComboBox<String> b;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField d;
    private javax.swing.JTextField e;
    private javax.swing.JTextField f;
    private javax.swing.JFileChooser filechooser;
    private javax.swing.JTextField g;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel pic;
    // End of variables declaration//GEN-END:variables
}

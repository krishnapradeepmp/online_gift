
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
public class delivery extends javax.swing.JFrame {

    /**
     * Creates new form delivery
     *
     * @param id
     */
    public delivery(String id) {
        initComponents();
        try {

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegift", "root", "");
            System.err.println("ok");
            Statement s = c.createStatement();

            ResultSet r = s.executeQuery("SELECT orders.`id`, DATE_FORMAT(orders.`odate`,'%d-%m-%Y' ) AS odate, DATE_FORMAT(orders.`expecteddate`,'%d-%m-%Y' ) AS expecteddate, `remarks`, `status`, `model_id`, `quantity`, `customer_id`, `amount`,daddress,delivery_name,custom,model_id FROM `orders`,delivery WHERE delivery.order_id=orders.id AND orders.id=" + id);

            System.out.println("SELECT orders.`id`, DATE_FORMAT(orders.`odate`,'%d-%m-%Y' ) AS odate, DATE_FORMAT(orders.`expecteddate`,'%d-%m-%Y' ) AS expecteddate, `remarks`, `status`, `model_id`, `quantity`, `customer_id`, `amount`,daddress,delivery_name,custom,model_id FROM `orders`,delivery WHERE delivery.order_id=orders.id AND orders.id=" + id);

            // DefaultTableModel de = (DefaultTableModel) jTable1.getModel();
            while (r.next()) {
                // System.out.println(r.getString("c1")+" "+r.getString("c2")+" "+r.getString("c3"));
                //Vector v = new Vector();

                a3.setText(r.getString("id"));
                o3.setText(r.getString("odate"));
                ed3.setText(r.getString("expecteddate"));
                b3.setText(r.getString("quantity"));
                e3.setText(r.getString("amount"));
                c3.setText(r.getString("customer_id"));
                f3.setText(r.getString("daddress"));
                d3.setText(r.getString("delivery_name"));
                //v.add(r.getString("remarks"));
                //de.addRow(v);
                /*............image preview..*/
                System.out.println(r.getString("custom"));
                if (r.getString("custom") == null) {

                    ResultSet r2 = s.executeQuery("SELECT * FROM `product` WHERE `id`=" + r.getString("model_id"));
                    r2.next();

                    try {
                        BufferedImage bi = ImageIO.read(new File(Server_Constants.SERVER_ENDPIONT+"\\images\\" + r2.getString("IMAGE")));

                        System.out.println("Height : " + bi.getHeight());
                        System.out.println("Width : " + bi.getWidth());
                        //---Resizing buffered image; return : bufferedimage -----
                        bi = Scalr.resize(bi, 350, 180);
                        image2.setIcon(new ImageIcon(bi));

                    } catch (IOException e) {
                    }
                } else {
                    try {
                        System.out.println(Server_Constants.SERVER_ENDPIONT+"\\picture_editor\\customs\\" + r.getString("custom"));
                        BufferedImage bi = ImageIO.read(new File(Server_Constants.SERVER_ENDPIONT+"\\picture_editor\\customs\\" + r.getString("custom")));

                        System.out.println("Height : " + bi.getHeight());
                        System.out.println("Width : " + bi.getWidth());
                        //---Resizing buffered image; return : bufferedimage -----
                        bi = Scalr.resize(bi, 350, 180);
                        image2.setIcon(new ImageIcon(bi));

                    } catch (IOException e) {
                    }
                }

            }

        } catch (SQLException ex) {
            System.out.println("not ok");
            Logger.getLogger(viewOrder.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        ed3 = new javax.swing.JTextField();
        f3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        a3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        b3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        c3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        d3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        e3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        o3 = new javax.swing.JTextField();
        image2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 657));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Delivery_Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(493, 213, 127, 25);

        ed3.setEditable(false);
        ed3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed3ActionPerformed(evt);
            }
        });
        getContentPane().add(ed3);
        ed3.setBounds(779, 565, 131, 25);

        f3.setEditable(false);
        getContentPane().add(f3);
        f3.setBounds(660, 310, 183, 98);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Pack");
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 675, 103, 32);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Cancel");
        getContentPane().add(jButton2);
        jButton2.setBounds(756, 675, 103, 32);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Customer_ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(493, 121, 127, 25);

        a3.setEditable(false);
        getContentPane().add(a3);
        a3.setBounds(663, 78, 98, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("DELIVERY ADDRESS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(490, 320, 166, 24);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Order_ID");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(493, 76, 127, 25);

        b3.setEditable(false);
        getContentPane().add(b3);
        b3.setBounds(663, 123, 98, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Quantity");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(493, 166, 127, 25);

        c3.setEditable(false);
        getContentPane().add(c3);
        c3.setBounds(663, 168, 98, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Exp.Delivery_Date");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(623, 563, 127, 25);

        d3.setEditable(false);
        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });
        getContentPane().add(d3);
        d3.setBounds(663, 215, 271, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Amount");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(490, 260, 127, 25);

        e3.setEditable(false);
        getContentPane().add(e3);
        e3.setBounds(660, 260, 98, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Order Date");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(306, 565, 127, 25);

        o3.setEditable(false);
        o3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                o3ActionPerformed(evt);
            }
        });
        getContentPane().add(o3);
        o3.setBounds(459, 565, 131, 25);
        getContentPane().add(image2);
        image2.setBounds(30, 80, 400, 270);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DELIVERY DETAILS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 10, 257, 47);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plain-Light-Blue-Background.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1020, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d3ActionPerformed

    private void ed3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ed3ActionPerformed

    private void o3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_o3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_o3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a3;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField d3;
    private javax.swing.JTextField e3;
    private javax.swing.JTextField ed3;
    private javax.swing.JTextField f3;
    private javax.swing.JLabel image2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField o3;
    // End of variables declaration//GEN-END:variables
}

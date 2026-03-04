/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserDashboard;

import Pharmamed.Login;
import config.Session;
import config.config;
import javax.swing.JOptionPane;

public class Recordsale extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Recordsale.class.getName());
    public String transferId;
    String id, name, email, status;
    
    public Recordsale(String uId, String uName, String uEmail, String uStatus) {
    if (Session.getInstance().getUid() == null) {
        JOptionPane.showMessageDialog(null, "Login first!");
        new Login().setVisible(true);
        this.dispose();
    } else {
    initComponents();
    this.id = uId;
    this.name = uName;
    this.email = uEmail;
    this.status = uStatus;
}
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        change = new javax.swing.JTextField();
        medname = new javax.swing.JTextField();
        expiredate = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();
        sales = new javax.swing.JLabel();
        recordsale = new javax.swing.JLabel();
        account = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Medicine name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel3.setText("Expiry date:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel4.setText("Quantity:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jLabel6.setText("Price:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel7.setText("Change:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));
        jPanel1.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 70, -1));
        jPanel1.add(medname, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 58, 70, -1));
        jPanel1.add(expiredate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 70, -1));
        jPanel1.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 70, -1));
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 70, -1));

        add.setText("ADD TO SALES");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyblueverylight.png"))); // NOI18N
        jLabel11.setText("jLabel8");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 230, 260));

        dashboard.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dashboard.setForeground(new java.awt.Color(0, 153, 153));
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard.setText("DASHBOARD");
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });
        jPanel1.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 130, -1));

        sales.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sales.setForeground(new java.awt.Color(0, 153, 153));
        sales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sales.setText("SALES");
        sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesMouseClicked(evt);
            }
        });
        jPanel1.add(sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 130, -1));

        recordsale.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        recordsale.setForeground(new java.awt.Color(0, 153, 153));
        recordsale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recordsale.setText("RECORD SALES");
        recordsale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordsaleMouseClicked(evt);
            }
        });
        jPanel1.add(recordsale, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 130, -1));

        account.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        account.setForeground(new java.awt.Color(0, 153, 153));
        account.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        account.setText("ACCOUNT");
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
        });
        jPanel1.add(account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 130, -1));

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setForeground(new java.awt.Color(102, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/49579_1.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 300));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/49579.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 270, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void setFields(String s_id, String m_name, String m_expiry, String m_qty, String m_price, String m_change) {
    medname.setText(m_name);
    expiredate.setText(m_expiry);
    quantity.setText(m_qty);
    price.setText(m_price);
    change.setText(m_change);
    add.setText("UPDATE");
}
    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        new UserDashboard.Dashboard(id, name, email, status).setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardMouseClicked

    private void salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMouseClicked
        new UserDashboard.Sales(id, name, email, status).setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_salesMouseClicked

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked

        new UserDashboard.Account(id, name, email, status).setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_accountMouseClicked

    private void recordsaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordsaleMouseClicked
        new UserDashboard.Recordsale(id, name, email, status).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_recordsaleMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
config conf = new config();
    
    if (add.getText().equals("ADD TO SALES")) {
        String sql = "INSERT INTO tbl_sales (m_name, m_expiry, m_qty, m_price, m_change) VALUES ("
                + "'" + medname.getText() + "', '" + expiredate.getText() + "', '" + quantity.getText() + "', '" + price.getText() + "', '" + change.getText() + "')";
        conf.insertData(sql);
        javax.swing.JOptionPane.showMessageDialog(null, "Saved Successfully!");
    } else {
        String sql = "UPDATE tbl_sales SET "
                + "m_name = '" + medname.getText() + "', "
                + "m_expiry = '" + expiredate.getText() + "', "
                + "m_qty = '" + quantity.getText() + "', "
                + "m_price = '" + price.getText() + "', "
                + "m_change = '" + change.getText() + "' "
                + "WHERE s_id = '" + transferId + "'";
        conf.updateData(sql);
        javax.swing.JOptionPane.showMessageDialog(null, "Updated Successfully!");
    }
    
    new Sales(id, name, email, status).setVisible(true);
    this.dispose();
    }//GEN-LAST:event_addActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Dashboard("", "", "", "").setVisible(true);
        }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel account;
    private javax.swing.JButton add;
    private javax.swing.JTextField change;
    private javax.swing.JLabel dashboard;
    private javax.swing.JTextField expiredate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField medname;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel recordsale;
    private javax.swing.JLabel sales;
    // End of variables declaration//GEN-END:variables
}

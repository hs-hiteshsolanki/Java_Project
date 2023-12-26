/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.ConnectionProvider;

/**
 *
 * @author Admin
 */
public class stockDecrease extends javax.swing.JFrame {

    /**
     * Creates new form stockDecrease
     */
    
    int temp;
    public stockDecrease() {
        initComponents();
        stockdetail();
    }

     private void stockdetail() {
    int c;
    try {
        
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM `stock`");
            
            ResultSetMetaData rss =rs.getMetaData();
            c=rss.getColumnCount();
            
            DefaultTableModel df =(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            while(rs.next()){
               
               Vector v2 = new Vector();
               for (int i = 1; i <= c; i++) {
                   v2.add(rs.getString("blood_group"));
                   v2.add(rs.getString("units"));    
               }
               df.addRow(v2);
           
           }
    } catch (Exception e) {
    }
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(340, 130));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("STOCK (DECREASE)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 667, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Units");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 83, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Blood Group");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-", " " }));
        jComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox2KeyPressed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 110, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 80, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BBMS ICON/save.png"))); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 81, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, 667, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "blood group", "units"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, 667, 255));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 667, 10));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BBMS ICON/print.png"))); // NOI18N
        jButton2.setText("Print");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BBMS ICON/Exit application.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BBMS ICON/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String bloodg = jComboBox2.getSelectedItem().toString();
        int unit = Integer.parseInt(jTextField8.getText());
        int  div = temp -unit;
        try {
            
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            PreparedStatement pstm;
            pstm = con.prepareStatement("UPDATE `stock` SET `units`=? WHERE `blood_group`='"+bloodg+"'");
            pstm.setInt(1,div);
             pstm.executeUpdate();
             stockdetail();
             JOptionPane.showMessageDialog(null,"stock Decrease");
             } catch (Exception e) {
               JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyPressed
        
        String bloodg = jComboBox2.getSelectedItem().toString();
        
        try {
            Connection con=ConnectionProvider.getCon();
            Statement st;
            st = con.createStatement();
            
             ResultSet rs=st.executeQuery("SELECT * FROM `stock` WHERE `blood_group`='"+bloodg+"'");
             if(rs.next()){       
             temp = rs.getInt("units");
        }
            // JOptionPane.showMessageDialog(null, temp);
        } catch (SQLException ex) {
            Logger.getLogger(stockIncrease.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jComboBox2KeyPressed

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
            java.util.logging.Logger.getLogger(stockDecrease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stockDecrease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stockDecrease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stockDecrease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stockDecrease().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}

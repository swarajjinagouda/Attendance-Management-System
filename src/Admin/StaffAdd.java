/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class StaffAdd extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String pass = "root";
    private static final String url = "jdbc:mysql://localhost:3307/mini_project";
    
    public StaffAdd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldName = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextFieldID_No = new javax.swing.JTextField();
        jLabelID_No = new javax.swing.JLabel();
        jButtonCreate = new javax.swing.JButton();
        jLabelAdd_New_Staff = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jLabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 52, 340, 10));

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 80, 200, -1));

        jLabelName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelName.setText("Name");
        getContentPane().add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 83, -1, -1));

        jTextFieldID_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldID_NoActionPerformed(evt);
            }
        });
        jTextFieldID_No.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldID_NoKeyPressed(evt);
            }
        });
        getContentPane().add(jTextFieldID_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 129, 130, -1));

        jLabelID_No.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelID_No.setText("ID No.");
        getContentPane().add(jLabelID_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 132, -1, -1));

        jButtonCreate.setText("Create ");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 180, -1, -1));

        jLabelAdd_New_Staff.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        jLabelAdd_New_Staff.setText("Add New Staff");
        getContentPane().add(jLabelAdd_New_Staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 27, 330, -1));

        jButtonBack.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBack.setForeground(new java.awt.Color(255, 0, 0));
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/back-arrow.png"))); // NOI18N
        jButtonBack.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelWallpaper.setForeground(new java.awt.Color(102, 102, 255));
        jLabelWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/PNG image 3.png"))); // NOI18N
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldID_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldID_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldID_NoActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
           
        String sql = "insert into staff values(?,?)";
        
        try
       {
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           PreparedStatement st = conn.prepareStatement(sql);
           st.setString(1, jTextFieldName.getText());
           st.setInt(2, Integer.parseInt(jTextFieldID_No.getText()));
           st.executeUpdate();
           JOptionPane.showMessageDialog(null, "Staff Added Successfully","Alert",JOptionPane.INFORMATION_MESSAGE);
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
        
        new StaffInfo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
           new StaffInfo().setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextFieldID_NoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldID_NoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String sql = "insert into staff values(?,?)";
        
        try
       {
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           PreparedStatement st = conn.prepareStatement(sql);
           st.setString(1, jTextFieldName.getText());
           st.setInt(2, Integer.parseInt(jTextFieldID_No.getText()));
           st.executeUpdate();
           JOptionPane.showMessageDialog(null, "Staff Added Successfully","Alert",JOptionPane.INFORMATION_MESSAGE);
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }
        
        new StaffInfo().setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_jTextFieldID_NoKeyPressed

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
            java.util.logging.Logger.getLogger(StaffAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JLabel jLabelAdd_New_Staff;
    private javax.swing.JLabel jLabelID_No;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelWallpaper;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldID_No;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}

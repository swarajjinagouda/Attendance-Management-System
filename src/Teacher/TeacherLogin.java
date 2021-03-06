/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teacher;

import Student.StudentInterface;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Admin.LOGIN;

public class TeacherLogin extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String pass = "root";
    private static final String url = "jdbc:mysql://localhost:3307/mini_project";
    
    ResultSet rs = null;
    
    
    public TeacherLogin() {
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

        jLabelTeacher_Login = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonBack = new javax.swing.JButton();
        jLabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTeacher_Login.setBackground(new java.awt.Color(51, 0, 51));
        jLabelTeacher_Login.setFont(new java.awt.Font(".SF NS Text", 1, 18)); // NOI18N
        jLabelTeacher_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTeacher_Login.setText("Teacher Login");
        getContentPane().add(jLabelTeacher_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 33, 320, -1));

        jLabelUsername.setText("Username");
        getContentPane().add(jLabelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 94, -1, -1));

        jLabelPassword.setText("Password");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 145, -1, -1));

        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 177, -1));
        getContentPane().add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 142, 177, -1));

        jButtonLogin.setBackground(new java.awt.Color(204, 204, 255));
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 58, 320, 10));

        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Teacher/Images/back-arrow.png"))); // NOI18N
        jButtonBack.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Teacher/Images/XIE 4.jpeg"))); // NOI18N
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        String sql = "select * from teacher where t_login = ? and t_pass = ?";
        try
        {
            Connection conn = null;
            conn = DriverManager.getConnection(url, username, pass);

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, jTextFieldUsername.getText());
            st.setString(2, jPasswordFieldPassword.getText());
            rs = st.executeQuery();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"Welcome Teacher "+rs.getString("t_name"));
                String login = jTextFieldUsername.getText();
                String s2 = rs.getString("f_id");
                new TeacherInterface(login,s2).setVisible(true);
                this.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid User","Error",JOptionPane.ERROR_MESSAGE);
            }

        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new LOGIN().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTeacher_Login;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabelWallpaper;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}

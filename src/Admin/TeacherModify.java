/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.Color;
import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TeacherModify extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String pass = "root";
    private static final String url = "jdbc:mysql://localhost:3307/mini_project";
    
   ResultSet rs = null;
   
    public TeacherModify() {
        initComponents();
        
    jTableCourse.setOpaque(false);
    ((DefaultTableCellRenderer)jTableCourse.getDefaultRenderer(Object.class)).setOpaque(false);
    jTableCourse.setShowGrid(true);
    
    jScrollPane1.setOpaque(false);
    jScrollPane1.getViewport().setOpaque(false);
    
        try
        {
            Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           String sql = "select * from course";
           PreparedStatement st = conn.prepareStatement(sql);
           ResultSet rs = st.executeQuery();
           
           while(rs.next())
           {
               String Course_ID = rs.getString("course_id");
               String course_Name = rs.getString("course_name");
      
               String tbData[] = {Course_ID,course_Name};
               DefaultTableModel tblModel = (DefaultTableModel)jTableCourse.getModel();
               
               //Add data
               tblModel.addRow(tbData);
           }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        String sql1 = "select * from course";
        try
       {
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           PreparedStatement pst = conn.prepareStatement(sql1);
           rs = pst.executeQuery();
           while(rs.next())
           {
               jComboBoxCourseIdNo.addItem(rs.getString("course_id"));
           }
           
       }
        
        catch(SQLException e)
       {
           System.out.println(e);
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

        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldId_No = new javax.swing.JTextField();
        jLabelId_No = new javax.swing.JLabel();
        jLabelCourse_ID = new javax.swing.JLabel();
        jComboBoxCourseIdNo = new javax.swing.JComboBox<>();
        jTextFieldCourseId = new javax.swing.JTextField();
        jLabelAdd = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelPrevious = new javax.swing.JLabel();
        jLabelNew = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCourse = new javax.swing.JTable();
        jButtonUpdate = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(625, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelName.setText("Name");
        getContentPane().add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 136, -1, -1));

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 133, 144, -1));

        jTextFieldId_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldId_NoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldId_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 93, 145, -1));

        jLabelId_No.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelId_No.setText("ID No.");
        getContentPane().add(jLabelId_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 96, -1, -1));

        jLabelCourse_ID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCourse_ID.setText("Course ID");
        getContentPane().add(jLabelCourse_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 209, -1, -1));

        jComboBoxCourseIdNo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBoxCourseIdNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCourseIdNoActionPerformed(evt);
            }
        });
        jComboBoxCourseIdNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxCourseIdNoKeyPressed(evt);
            }
        });
        getContentPane().add(jComboBoxCourseIdNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 205, 131, -1));
        getContentPane().add(jTextFieldCourseId, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 205, 145, -1));

        jLabelAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdd.setText("Update Teacher Details");
        getContentPane().add(jLabelAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 32, 530, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 57, 540, 10));

        jLabelPrevious.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabelPrevious.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrevious.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrevious.setText("Previous");
        getContentPane().add(jLabelPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 185, 145, -1));

        jLabelNew.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabelNew.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNew.setText("New");
        getContentPane().add(jLabelNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 185, 131, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/Search.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 29, 30));

        jTableCourse.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jTableCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course_ID", "Course_Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCourse);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 350, 200));

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 244, -1, -1));

        jButtonBack.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBack.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/back-arrow.png"))); // NOI18N
        jButtonBack.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 28, -1));

        jLabelWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/PNG image 5.png"))); // NOI18N
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 770, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldId_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldId_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldId_NoActionPerformed

    private void jComboBoxCourseIdNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCourseIdNoActionPerformed

    }//GEN-LAST:event_jComboBoxCourseIdNoActionPerformed

    private void jComboBoxCourseIdNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxCourseIdNoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            String sql = "insert into teacher values(?,?,?,?,?)";

            try
            {
                Connection conn = null;
                conn = DriverManager.getConnection(url, username, pass);

                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, jTextFieldName.getText());
                st.setInt(2, Integer.parseInt(jTextFieldId_No.getText()));
                st.setString(3, (String)jComboBoxCourseIdNo.getSelectedItem());

                String teach_login = (jTextFieldId_No.getText()+"."+ jTextFieldName.getText().toLowerCase() + "@teacher.xavier.ac.in");
                String teach_pass =  jTextFieldId_No.getText();
                st.setString(4, teach_login);
                st.setString(5, teach_pass);

                st.executeUpdate();
                JOptionPane.showMessageDialog(null, "Teacher Added Successfully","Alert",JOptionPane.INFORMATION_MESSAGE);
                new TeacherInfo().setVisible(true);
            }
            catch(SQLException e)
            {
                System.out.println(e);

                JOptionPane.showMessageDialog(null,"Falied to add Teacher","Error",JOptionPane.ERROR_MESSAGE);

            }

            //this.setVisible(false);
            //new TeacherAdd().setVisible(true);
        }
    }//GEN-LAST:event_jComboBoxCourseIdNoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql = "select * from teacher where f_id=?";
        
        try
       {
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           PreparedStatement pst = conn.prepareStatement(sql);
           pst.setString(1, jTextFieldId_No.getText());
           rs = pst.executeQuery();
           while(rs.next()){
           jTextFieldName.setText(rs.getString("t_name"));
           jTextFieldCourseId.setText(rs.getString("course_id"));
           }
           
           
       }
        
        catch(SQLException e)
       {
           System.out.println(e);
       }   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        String sql = "update teacher set t_name=?, course_id=? where f_id=?";
        
        try
       {
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           PreparedStatement pst = conn.prepareStatement(sql);
           //pst.setInt(3, parseInt(jTextFieldId_No.getText()));
          pst.setString(3, jTextFieldId_No.getText());
           pst.setString(1, jTextFieldName.getText());
           if((jComboBoxCourseIdNo.getSelectedItem()).equals("Select")){
               pst.setString(2, jTextFieldCourseId.getText());
           }
           else
           {
               pst.setString(2, (String)jComboBoxCourseIdNo.getSelectedItem());
           }
           
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Update Successful");
           new TeacherInfo().setVisible(true);
           this.setVisible(false);    
       }
        
        catch(SQLException e)
       {
           System.out.println(e);
           JOptionPane.showMessageDialog(null, "Update Failed","Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new TeacherInfo().setVisible(true);
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
            java.util.logging.Logger.getLogger(TeacherModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherModify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxCourseIdNo;
    private javax.swing.JLabel jLabelAdd;
    private javax.swing.JLabel jLabelCourse_ID;
    private javax.swing.JLabel jLabelId_No;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNew;
    private javax.swing.JLabel jLabelPrevious;
    private javax.swing.JLabel jLabelWallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableCourse;
    private javax.swing.JTextField jTextFieldCourseId;
    private javax.swing.JTextField jTextFieldId_No;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}

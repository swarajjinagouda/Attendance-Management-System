/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TeacherAdd extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String pass = "root";
    private static final String url = "jdbc:mysql://localhost:3307/mini_project";
    ResultSet rs = null;
    
    public TeacherAdd() {
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAdd = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldName = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextFieldId_No = new javax.swing.JTextField();
        jLabelId_No = new javax.swing.JLabel();
        jLabelCourse_ID = new javax.swing.JLabel();
        jButtonCreate = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jComboBoxCourseIdNo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCourse = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelAdd.setText("Add New Teacher");
        getContentPane().add(jLabelAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 51, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 76, 340, 10));

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 104, 200, -1));

        jLabelName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelName.setText("Name");
        getContentPane().add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 107, -1, -1));

        jTextFieldId_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldId_NoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldId_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 144, 130, -1));

        jLabelId_No.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelId_No.setText("ID No.");
        getContentPane().add(jLabelId_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 147, -1, -1));

        jLabelCourse_ID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabelCourse_ID.setText("Course ID");
        getContentPane().add(jLabelCourse_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jButtonCreate.setText("Create ");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/back-arrow.png"))); // NOI18N
        jButtonBack.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        getContentPane().add(jComboBoxCourseIdNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 184, 131, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 350, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/PNG image 3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 750, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jTextFieldId_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldId_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldId_NoActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
           new TeacherInfo().setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
           
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
        //new TeacherInfo2().setVisible(true);
           //this.setVisible(false);
        
      
    
        
      
        
    }//GEN-LAST:event_jButtonCreateActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JComboBox<String> jComboBoxCourseIdNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAdd;
    private javax.swing.JLabel jLabelCourse_ID;
    private javax.swing.JLabel jLabelId_No;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableCourse;
    private javax.swing.JTextField jTextFieldId_No;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}

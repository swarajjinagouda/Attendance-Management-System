/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Admin.StudentInfo;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class BatchRegistration extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String pass = "root";
    private static final String url = "jdbc:mysql://localhost:3307/mini_project";
    
   ResultSet rs = null;
   String s;
   
    public BatchRegistration() {
        initComponents();
        
    jTableCourse1.setOpaque(false);
    ((DefaultTableCellRenderer)jTableCourse1.getDefaultRenderer(Object.class)).setOpaque(false);
    jTableCourse1.setShowGrid(true);
    jScrollPane2.setOpaque(false);
    jScrollPane2.getViewport().setOpaque(false);
    
    jTableTeacher.setOpaque(false);
    ((DefaultTableCellRenderer)jTableTeacher.getDefaultRenderer(Object.class)).setOpaque(false);
    jTableTeacher.setShowGrid(true);
    
    jScrollPane3.setOpaque(false);
    jScrollPane3.getViewport().setOpaque(false);
    
    
    
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
               DefaultTableModel tblModel = (DefaultTableModel)jTableCourse1.getModel();
               
               //Add data
               tblModel.addRow(tbData);
           }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
         
        try
        {
            Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           String sql = "select * from teacher";
           PreparedStatement st = conn.prepareStatement(sql);
           ResultSet rs = st.executeQuery();
           
           while(rs.next())
           {
               String Teacher_ID = rs.getString("f_id");
               String Teacher_Name = rs.getString("t_name");
      
               String tbData[] = {Teacher_ID,Teacher_Name};
               DefaultTableModel tblModel = (DefaultTableModel)jTableTeacher.getModel();
               
               //Add data
               tblModel.addRow(tbData);
           }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        
        
        
      
        
        try
       {
           String sql2 = "select * from teacher";
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           PreparedStatement pst = conn.prepareStatement(sql2);
           rs = pst.executeQuery();
           while(rs.next())
           {
               jComboBoxTeacherID.addItem(rs.getString("f_id"));
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCourse = new javax.swing.JTable();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabelBatchRegistration = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelBatchCode = new javax.swing.JLabel();
        jLabelTeacherID = new javax.swing.JLabel();
        jLabelCourseID = new javax.swing.JLabel();
        jLabelBatchDays = new javax.swing.JLabel();
        jLabelBatchTimings = new javax.swing.JLabel();
        jTextFieldBatchCode = new javax.swing.JTextField();
        jTextFieldBatchDays = new javax.swing.JTextField();
        jTextFieldBatchTimings = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCourse1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTeacher = new javax.swing.JTable();
        jButtonCreate = new javax.swing.JButton();
        jComboBoxTeacherID = new javax.swing.JComboBox<>();
        jTextFieldCourseID = new javax.swing.JTextField();
        jLabelCoursesAvailable = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelTeachers = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButtonBack = new javax.swing.JButton();
        jLabelWallpaper = new javax.swing.JLabel();

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

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(675, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBatchRegistration.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelBatchRegistration.setForeground(new java.awt.Color(0, 204, 51));
        jLabelBatchRegistration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBatchRegistration.setText("Batch Registration");
        getContentPane().add(jLabelBatchRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 31, 265, 25));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 63, 265, 11));

        jLabelBatchCode.setForeground(new java.awt.Color(0, 204, 51));
        jLabelBatchCode.setText("Batch Code:");
        getContentPane().add(jLabelBatchCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 95, -1, -1));

        jLabelTeacherID.setForeground(new java.awt.Color(0, 204, 51));
        jLabelTeacherID.setText("Teacher ID:");
        getContentPane().add(jLabelTeacherID, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 141, -1, -1));

        jLabelCourseID.setForeground(new java.awt.Color(0, 204, 51));
        jLabelCourseID.setText("Course ID:");
        getContentPane().add(jLabelCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 187, -1, -1));

        jLabelBatchDays.setForeground(new java.awt.Color(0, 204, 51));
        jLabelBatchDays.setText("Batch Days:");
        getContentPane().add(jLabelBatchDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 233, -1, -1));

        jLabelBatchTimings.setForeground(new java.awt.Color(0, 204, 51));
        jLabelBatchTimings.setText("Batch Timings:");
        getContentPane().add(jLabelBatchTimings, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 279, -1, -1));

        jTextFieldBatchCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBatchCodeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBatchCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 92, 150, -1));
        getContentPane().add(jTextFieldBatchDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 150, -1));

        jTextFieldBatchTimings.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldBatchTimings.setText("HH:MM-HH:MM(am/pm)");
        jTextFieldBatchTimings.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldBatchTimingsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldBatchTimingsFocusLost(evt);
            }
        });
        jTextFieldBatchTimings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBatchTimingsActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBatchTimings, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 276, 151, -1));

        jTableCourse1.setForeground(new java.awt.Color(0, 204, 51));
        jTableCourse1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCourse1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTableCourse1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 320, 200));

        jTableTeacher.setForeground(new java.awt.Color(0, 204, 51));
        jTableTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher ID", "Teacher Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTeacher.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(jTableTeacher);
        if (jTableTeacher.getColumnModel().getColumnCount() > 0) {
            jTableTeacher.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 320, 200));

        jButtonCreate.setText("Create");
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 334, -1, -1));

        jComboBoxTeacherID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBoxTeacherID.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxTeacherIDPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(jComboBoxTeacherID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 138, 150, -1));

        jTextFieldCourseID.setEditable(false);
        getContentPane().add(jTextFieldCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 150, -1));

        jLabelCoursesAvailable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelCoursesAvailable.setForeground(new java.awt.Color(0, 255, 0));
        jLabelCoursesAvailable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCoursesAvailable.setText("Courses Available");
        getContentPane().add(jLabelCoursesAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 160, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 160, 20));

        jLabelTeachers.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelTeachers.setForeground(new java.awt.Color(0, 255, 0));
        jLabelTeachers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTeachers.setText("Teachers");
        getContentPane().add(jLabelTeachers, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 80, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 80, 10));

        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/back-arrow.png"))); // NOI18N
        jButtonBack.setPreferredSize(new java.awt.Dimension(30, 30));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabelWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/Batch.jpg"))); // NOI18N
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 730, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBatchCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBatchCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBatchCodeActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
          
        String sql = "insert into batch values(?,?,?,?,?)";
        
        try
       {
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           PreparedStatement st = conn.prepareStatement(sql);
           st.setString(1, jTextFieldBatchCode.getText());
           st.setString(2, (String)jComboBoxTeacherID.getSelectedItem());
           st.setString(3, jTextFieldCourseID.getText());
           st.setString(4, jTextFieldBatchDays.getText());
           st.setString(5, jTextFieldBatchTimings.getText());
          
           st.executeUpdate();
           JOptionPane.showMessageDialog(null, "Batch Created Successfully","Alert",JOptionPane.INFORMATION_MESSAGE);
           
           new BatchInfo().setVisible(true);
           this.setVisible(false);

       }
       catch(SQLException e)
       {
           System.out.println(e);
           JOptionPane.showMessageDialog(null, "Failed To Register the Batch","ERROR",JOptionPane.ERROR_MESSAGE);
           new BatchRegistration().setVisible(true);
       }
    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jComboBoxTeacherIDPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxTeacherIDPopupMenuWillBecomeInvisible
        String tmp = (String)jComboBoxTeacherID.getSelectedItem();
        String sql2 = "select * from teacher where f_id = ?";
        try
        {
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           PreparedStatement st = conn.prepareStatement(sql2);
           st.setString(1, tmp);
           rs = st.executeQuery();
           if(rs.next())
           {
               String add = rs.getString("course_id");
               jTextFieldCourseID.setText(add);
           }
           
        }
        catch(Exception e)
        {
            System.out.println(e);
            //JOptionPane.showMessageDialog(null, "Failed To Register the Batch","ERROR",JOptionPane.ERROR_MESSAGE);     
        }
    }//GEN-LAST:event_jComboBoxTeacherIDPopupMenuWillBecomeInvisible

    private void jTextFieldBatchTimingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBatchTimingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBatchTimingsActionPerformed

    private void jTextFieldBatchTimingsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBatchTimingsFocusGained
        if(jTextFieldBatchTimings.getText().equals("HH:MM-HH:MM(am/pm)"))
        {
            jTextFieldBatchTimings.setText("");
            jTextFieldBatchTimings.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextFieldBatchTimingsFocusGained

    private void jTextFieldBatchTimingsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBatchTimingsFocusLost
        if(jTextFieldBatchTimings.getText().equals(""))
        {
            jTextFieldBatchTimings.setText("HH:MM-HH:MM(am/pm)");
            jTextFieldBatchTimings.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextFieldBatchTimingsFocusLost

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new BatchInfo().setVisible(true);
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
            java.util.logging.Logger.getLogger(BatchRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BatchRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BatchRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BatchRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BatchRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBoxTeacherID;
    private javax.swing.JLabel jLabelBatchCode;
    private javax.swing.JLabel jLabelBatchDays;
    private javax.swing.JLabel jLabelBatchRegistration;
    private javax.swing.JLabel jLabelBatchTimings;
    private javax.swing.JLabel jLabelCourseID;
    private javax.swing.JLabel jLabelCoursesAvailable;
    private javax.swing.JLabel jLabelTeacherID;
    private javax.swing.JLabel jLabelTeachers;
    private javax.swing.JLabel jLabelWallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableCourse;
    private javax.swing.JTable jTableCourse1;
    private javax.swing.JTable jTableTeacher;
    private javax.swing.JTextField jTextFieldBatchCode;
    private javax.swing.JTextField jTextFieldBatchDays;
    private javax.swing.JTextField jTextFieldBatchTimings;
    private javax.swing.JTextField jTextFieldCourseID;
    // End of variables declaration//GEN-END:variables
}

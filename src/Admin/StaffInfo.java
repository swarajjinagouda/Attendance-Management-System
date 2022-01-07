/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class StaffInfo extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String pass = "root";
    private static final String url = "jdbc:mysql://localhost:3307/mini_project";
    
    public StaffInfo() {
        initComponents();
    
    jTableStaff.setOpaque(false);
    ((DefaultTableCellRenderer)jTableStaff.getDefaultRenderer(Object.class)).setOpaque(false);
    jTableStaff.setShowGrid(true);
    
    jScrollPane1.setOpaque(false);
    jScrollPane1.getViewport().setOpaque(false);
    
    try
        {
            Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           String sql = "select * from staff";
           PreparedStatement st = conn.prepareStatement(sql);
           ResultSet rs = st.executeQuery();
           
           while(rs.next())
           {
               String Name = rs.getString("s_name");
               String ID = String.valueOf(rs.getInt("s_id"));
               
         
               String tbData[] = {Name,ID};
               DefaultTableModel tb2Model = (DefaultTableModel)jTableStaff.getModel();
               
               //Add data
               tb2Model.addRow(tbData);
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

        jButtonShow = new javax.swing.JButton();
        jLabelStaff = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStaff = new javax.swing.JTable();
        jLabelXIE = new javax.swing.JLabel();
        jButtonStudents = new javax.swing.JButton();
        jButtonTeachers = new javax.swing.JButton();
        jButtonStaff = new javax.swing.JButton();
        jButtonCourses = new javax.swing.JButton();
        jButtonBatch = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();
        jLabelWallpaper2 = new javax.swing.JLabel();
        jLabelWallpaper = new javax.swing.JLabel();

        jButtonShow.setText("Show Data");
        jButtonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(808, 547));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelStaff.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelStaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelStaff.setText("STAFF MEMBERS");
        getContentPane().add(jLabelStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 560, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 560, 10));

        jButtonAdd.setText("+");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, -1, -1));

        jScrollPane1.setOpaque(false);

        jTableStaff.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTableStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableStaff.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTableStaff);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 500, 160));

        jLabelXIE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelXIE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/IMG_9761.PNG"))); // NOI18N
        jLabelXIE.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(jLabelXIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 81));

        jButtonStudents.setBackground(new java.awt.Color(204, 204, 255));
        jButtonStudents.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonStudents.setForeground(new java.awt.Color(0, 102, 102));
        jButtonStudents.setText("Students");
        jButtonStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStudentsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, -1));

        jButtonTeachers.setBackground(new java.awt.Color(204, 204, 255));
        jButtonTeachers.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonTeachers.setForeground(new java.awt.Color(0, 102, 102));
        jButtonTeachers.setText("Teachers");
        jButtonTeachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTeachersActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTeachers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, -1));

        jButtonStaff.setBackground(new java.awt.Color(204, 204, 255));
        jButtonStaff.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonStaff.setForeground(new java.awt.Color(0, 102, 102));
        jButtonStaff.setText("Staff");
        jButtonStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStaffActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, -1));

        jButtonCourses.setBackground(new java.awt.Color(204, 204, 255));
        jButtonCourses.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonCourses.setForeground(new java.awt.Color(0, 102, 102));
        jButtonCourses.setText("Courses");
        jButtonCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCoursesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCourses, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 200, -1));

        jButtonBatch.setBackground(new java.awt.Color(204, 204, 255));
        jButtonBatch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonBatch.setForeground(new java.awt.Color(0, 102, 102));
        jButtonBatch.setText("Batches");
        jButtonBatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatchActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 200, -1));

        jButtonLogOut.setBackground(new java.awt.Color(204, 204, 255));
        jButtonLogOut.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButtonLogOut.setForeground(new java.awt.Color(0, 102, 102));
        jButtonLogOut.setText("Log Out");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 445, 200, -1));

        jLabelWallpaper2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelWallpaper2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/8.jpeg"))); // NOI18N
        getContentPane().add(jLabelWallpaper2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 500));

        jLabelWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/PNG image 2.png"))); // NOI18N
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, -4, 590, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
           new StaffAdd().setVisible(true);
           this.setVisible(false);
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowActionPerformed
        
        
    }//GEN-LAST:event_jButtonShowActionPerformed

    private void jButtonStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStudentsActionPerformed
        new StudentInfo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonStudentsActionPerformed

    private void jButtonTeachersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTeachersActionPerformed
        new TeacherInfo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonTeachersActionPerformed

    private void jButtonStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStaffActionPerformed
        new StaffInfo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonStaffActionPerformed

    private void jButtonCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCoursesActionPerformed
        new CourseInfo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCoursesActionPerformed

    private void jButtonBatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatchActionPerformed
        new BatchInfo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBatchActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        new SignIn().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(StaffInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBatch;
    private javax.swing.JButton jButtonCourses;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonShow;
    private javax.swing.JButton jButtonStaff;
    private javax.swing.JButton jButtonStudents;
    private javax.swing.JButton jButtonTeachers;
    private javax.swing.JLabel jLabelStaff;
    private javax.swing.JLabel jLabelWallpaper;
    private javax.swing.JLabel jLabelWallpaper2;
    private javax.swing.JLabel jLabelXIE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableStaff;
    // End of variables declaration//GEN-END:variables
}

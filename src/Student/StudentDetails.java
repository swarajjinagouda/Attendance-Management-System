package Student;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class StudentDetails extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String pass = "root";
    private static final String url = "jdbc:mysql://localhost:3307/mini_project";
    
   ResultSet rs = null;
   String s;
   String s1;
    public StudentDetails(String login,String stud) {
        initComponents();
        this.s = login;
        this.s1 = stud;
        //stud = jLabelStudent_ID.getText();
        try
        {
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           String sql = "select * from student where student_login = ?";
           PreparedStatement st = conn.prepareStatement(sql);
           
           st.setString(1,s);
           ResultSet rs = st.executeQuery();
           
           while(rs.next())
           {
               jLabelName.setText(rs.getString("f_name")+" "+rs.getString("m_name")+" "+rs.getString("l_name"));
               jLabelStudent_ID.setText(rs.getString("stud_id"));
               jLabelEmail_ID.setText(rs.getString("email_id"));
               jLabelDOB.setText(rs.getString(6));
               jLabelPh_No.setText(rs.getString(10));
               jLabelAddress.setText(rs.getString(9));
               jLabelBranch.setText(rs.getString(12));
               jLabelDateOfAdmission.setText(rs.getString(11));
               jLabelBatch.setText(rs.getString(13));
               
               
               
                         
             
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

        jLabel12 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonLogOut = new javax.swing.JButton();
        jButtonReport = new javax.swing.JButton();
        jButtonDetails = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelStudent_ID = new javax.swing.JLabel();
        jLabelEmail_ID = new javax.swing.JLabel();
        jLabelDOB = new javax.swing.JLabel();
        jLabelPh_No = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelBranch = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelDateOfAdmission = new javax.swing.JLabel();
        jLabelBatchCode = new javax.swing.JLabel();
        jLabelBatch = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student/Images/IMG_9761.PNG"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dashboard");
        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jButtonLogOut.setText("Log Out");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        jButtonReport.setText("Report");
        jButtonReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportActionPerformed(evt);
            }
        });

        jButtonDetails.setText("Details");
        jButtonDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(89, 89, 89)
                .addComponent(jButtonReport)
                .addGap(35, 35, 35)
                .addComponent(jButtonDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(jButtonLogOut)
                .addContainerGap())
        );

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jDesktopPane1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 111, 543, 10));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Student Info");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Name :");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 134, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Student ID :");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 175, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Email ID :");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 216, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Date of Birth :");
        jDesktopPane1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 257, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Ph No. :");
        jDesktopPane1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 298, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Address :");
        jDesktopPane1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 339, -1, -1));
        jDesktopPane1.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 134, 459, 16));
        jDesktopPane1.add(jLabelStudent_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 175, 459, 16));
        jDesktopPane1.add(jLabelEmail_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 216, 459, 16));
        jDesktopPane1.add(jLabelDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 257, 459, 16));
        jDesktopPane1.add(jLabelPh_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 298, 459, 16));
        jDesktopPane1.add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 339, 529, 16));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Branch :");
        jDesktopPane1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 380, -1, -1));
        jDesktopPane1.add(jLabelBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 380, 250, 16));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("Date of Admission :");
        jDesktopPane1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 422, -1, -1));
        jDesktopPane1.add(jLabelDateOfAdmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 422, 180, 16));

        jLabelBatchCode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelBatchCode.setText("Batch Code:");
        jDesktopPane1.add(jLabelBatchCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 464, -1, -1));
        jDesktopPane1.add(jLabelBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 464, 237, 16));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
         new StudentLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jButtonReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportActionPerformed
        new StudentReport(s,s1).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonReportActionPerformed

    private void jButtonDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDetailsActionPerformed

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
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDetails(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetails;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonReport;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelBatch;
    private javax.swing.JLabel jLabelBatchCode;
    private javax.swing.JLabel jLabelBranch;
    private javax.swing.JLabel jLabelDOB;
    private javax.swing.JLabel jLabelDateOfAdmission;
    private javax.swing.JLabel jLabelEmail_ID;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPh_No;
    private javax.swing.JLabel jLabelStudent_ID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

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
public class StudentModify extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String pass = "root";
    private static final String url = "jdbc:mysql://localhost:3307/mini_project";
    
     ResultSet rs = null;
     ResultSet rs1 = null;
    public StudentModify() {
        initComponents();
        
        try
       {
           String sql2 = "select * from batch";
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           PreparedStatement pst = conn.prepareStatement(sql2);
           rs = pst.executeQuery();
           while(rs.next())
           {
               jComboBoxBatchCode.addItem(rs.getString("batch_code"));
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

        jLabelAdd = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelStudent_ID = new javax.swing.JLabel();
        jTextFieldStudent_Id = new javax.swing.JTextField();
        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabelMiddleName = new javax.swing.JLabel();
        jTextFieldFatherName = new javax.swing.JTextField();
        jLabelDOB = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelEmailId = new javax.swing.JLabel();
        jTextFieldEmailId = new javax.swing.JTextField();
        jLabelAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jLabelPh_No = new javax.swing.JLabel();
        jTextFieldPh_No = new javax.swing.JTextField();
        jLabelDateOfAdmission = new javax.swing.JLabel();
        jLabelBranch = new javax.swing.JLabel();
        jLabelMother_Name = new javax.swing.JLabel();
        jTextFieldMotherName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelBatchCode = new javax.swing.JLabel();
        jComboBoxBatchCode = new javax.swing.JComboBox<>();
        jLabelFacultyID = new javax.swing.JLabel();
        jTextFieldFacultyID = new javax.swing.JTextField();
        jLabelFacultyName = new javax.swing.JLabel();
        jTextFieldBatchDays = new javax.swing.JTextField();
        jLabelCourseID = new javax.swing.JLabel();
        jTextFieldCourseID = new javax.swing.JTextField();
        jLabelCourseName = new javax.swing.JLabel();
        jTextFieldBatchTime = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextFieldGender = new javax.swing.JTextField();
        jTextFieldBranch = new javax.swing.JTextField();
        jTextFieldBatchCode = new javax.swing.JTextField();
        jLabelPrevious = new javax.swing.JLabel();
        jLabelNew = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jTextFieldDateofAdmission = new javax.swing.JTextField();
        jTextFieldDOB = new javax.swing.JTextField();
        jTextFieldFacultyID1 = new javax.swing.JTextField();
        jTextFieldBatchDays1 = new javax.swing.JTextField();
        jTextFieldCourseID1 = new javax.swing.JTextField();
        jTextFieldBatchTime1 = new javax.swing.JTextField();
        jLabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1350, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAdd.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAdd.setText("Update Student Details");
        getContentPane().add(jLabelAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 32, 1240, -1));

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
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 57, 1250, 10));

        jLabelStudent_ID.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelStudent_ID.setText("Student ID");
        getContentPane().add(jLabelStudent_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));
        getContentPane().add(jTextFieldStudent_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 230, 30));

        jLabelFirstName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelFirstName.setText("First Name");
        getContentPane().add(jLabelFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 230, 30));

        jLabelMiddleName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelMiddleName.setText("Father's Name");
        getContentPane().add(jLabelMiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jTextFieldFatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFatherNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 230, 30));

        jLabelDOB.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelDOB.setText("DOB");
        getContentPane().add(jLabelDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 60, -1));

        jLabelGender.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelGender.setText("Gender");
        getContentPane().add(jLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, -1, -1));

        jLabelEmailId.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelEmailId.setText("Email ID");
        getContentPane().add(jLabelEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jTextFieldEmailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailIdActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEmailId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 250, 30));

        jLabelAddress.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelAddress.setText("Address");
        getContentPane().add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 255, -1));

        jLabelPh_No.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelPh_No.setText("Ph.No ");
        getContentPane().add(jLabelPh_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, -1, -1));
        getContentPane().add(jTextFieldPh_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 255, 30));

        jLabelDateOfAdmission.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelDateOfAdmission.setText("Date of Admission");
        getContentPane().add(jLabelDateOfAdmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        jLabelBranch.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelBranch.setText("Branch");
        getContentPane().add(jLabelBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, -1, -1));

        jLabelMother_Name.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelMother_Name.setText("Mother's Name");
        getContentPane().add(jLabelMother_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        jTextFieldMotherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMotherNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldMotherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 231, 32));

        jLabelLastName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelLastName.setText("Last Name");
        getContentPane().add(jLabelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 80, -1));

        jTextFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 230, 32));

        jLabelBatchCode.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelBatchCode.setText("Batch Code");
        getContentPane().add(jLabelBatchCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 230, -1, 20));

        jComboBoxBatchCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBoxBatchCode.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxBatchCodePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxBatchCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBatchCodeActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxBatchCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 230, 140, 30));

        jLabelFacultyID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelFacultyID.setText("Faculty ID");
        getContentPane().add(jLabelFacultyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, -1, 20));

        jTextFieldFacultyID.setEditable(false);
        getContentPane().add(jTextFieldFacultyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, 180, -1));

        jLabelFacultyName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelFacultyName.setText("Batch Days");
        getContentPane().add(jLabelFacultyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, -1, 20));

        jTextFieldBatchDays.setEditable(false);
        jTextFieldBatchDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBatchDaysActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBatchDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 350, 180, -1));

        jLabelCourseID.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelCourseID.setText("Course ID");
        getContentPane().add(jLabelCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, -1, 20));

        jTextFieldCourseID.setEditable(false);
        getContentPane().add(jTextFieldCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 180, -1));

        jLabelCourseName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabelCourseName.setText("Batch Time");
        getContentPane().add(jLabelCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 450, -1, 20));

        jTextFieldBatchTime.setEditable(false);
        jTextFieldBatchTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBatchTimeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBatchTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 460, 190, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/Search.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 29, 30));
        getContentPane().add(jTextFieldGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 230, 30));
        getContentPane().add(jTextFieldBranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 160, 30));
        getContentPane().add(jTextFieldBatchCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 230, 170, 30));

        jLabelPrevious.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabelPrevious.setForeground(new java.awt.Color(51, 51, 51));
        jLabelPrevious.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrevious.setText("Previous");
        getContentPane().add(jLabelPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 210, 170, -1));

        jLabelNew.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabelNew.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNew.setText("New");
        getContentPane().add(jLabelNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 210, 140, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 190, 120, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Assigned Batch");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 170, 120, 20));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Student Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 120, 20));

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 100, 40));

        jTextFieldDateofAdmission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateofAdmissionActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDateofAdmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 230, 30));
        getContentPane().add(jTextFieldDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 230, 30));

        jTextFieldFacultyID1.setEditable(false);
        getContentPane().add(jTextFieldFacultyID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 290, 140, -1));

        jTextFieldBatchDays1.setEditable(false);
        jTextFieldBatchDays1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBatchDays1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBatchDays1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 350, 150, -1));

        jTextFieldCourseID1.setEditable(false);
        getContentPane().add(jTextFieldCourseID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 410, 140, -1));

        jTextFieldBatchTime1.setEditable(false);
        jTextFieldBatchTime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBatchTime1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBatchTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 460, 140, -1));

        jLabelWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/Images/PNG image 6.png"))); // NOI18N
        getContentPane().add(jLabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 1330, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new StudentInfo().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstNameActionPerformed

    private void jTextFieldFatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFatherNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFatherNameActionPerformed

    private void jTextFieldEmailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailIdActionPerformed

    private void jTextFieldMotherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMotherNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMotherNameActionPerformed

    private void jTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastNameActionPerformed

    private void jComboBoxBatchCodePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxBatchCodePopupMenuWillBecomeInvisible

        String tmp = (String)jComboBoxBatchCode.getSelectedItem();
        String sql2 = "select * from batch where batch_code = ?";

        try
        {
            Connection conn = null;
            conn = DriverManager.getConnection(url, username, pass);

            PreparedStatement st = conn.prepareStatement(sql2);
            st.setString(1, tmp);
            rs = st.executeQuery();
            while(rs.next())
            {
                String add = rs.getString("f_id");
                jTextFieldFacultyID1.setText(add);

                String add3 = rs.getString("course_id");
                jTextFieldCourseID1.setText(add3);

                String add2 = rs.getString("batch_days");
                jTextFieldBatchDays1.setText(add2);

                String add4 = rs.getString("batch_time");
                jTextFieldBatchTime1.setText(add4);
            }
            if((jComboBoxBatchCode.getSelectedItem()).equals("Select"))
            {
                jTextFieldFacultyID1.setText(null);
                jTextFieldCourseID1.setText(null);
                jTextFieldBatchDays1.setText(null);
                jTextFieldBatchTime1.setText(null);
                
                
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
            //JOptionPane.showMessageDialog(null, "Failed To Register the Batch","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jComboBoxBatchCodePopupMenuWillBecomeInvisible

    private void jTextFieldBatchDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBatchDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBatchDaysActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String sql = "select * from student where stud_id=?";
        
        try
       {
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           PreparedStatement pst = conn.prepareStatement(sql);
           pst.setString(1, jTextFieldStudent_Id.getText());
           rs = pst.executeQuery();
           while(rs.next())
           {
           jTextFieldFirstName.setText(rs.getString("f_name"));
           jTextFieldLastName.setText(rs.getString("l_name"));
           jTextFieldFatherName.setText(rs.getString("m_name"));
           jTextFieldMotherName.setText(rs.getString("s_mother"));
           jTextFieldDOB.setText(rs.getString("DOB"));
           jTextFieldGender.setText(rs.getString("Gender"));
           jTextFieldEmailId.setText(rs.getString("email_id"));
           jTextFieldDateofAdmission.setText(rs.getString("stud_admission"));
           jTextAreaAddress.setText(rs.getString("Address"));
           jTextFieldBranch.setText(rs.getString("stud_branch"));
           jTextFieldPh_No.setText(rs.getString("Ph_No"));
           jTextFieldBatchCode.setText(rs.getString("batch_code"));
           }
           
           
       }
       
        
        catch(SQLException e)
       {
           System.out.println(e);
       }   
        try
       {
           String sql1 = "select * from batch where batch_code=?";
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           PreparedStatement pst1 = conn.prepareStatement(sql1);
           pst1.setString(1, jTextFieldBatchCode.getText());
           rs1 = pst1.executeQuery();
           while(rs1.next())
           {
           jTextFieldFacultyID.setText(rs1.getString("f_id"));
           jTextFieldBatchDays.setText(rs1.getString("batch_days"));
           jTextFieldCourseID.setText(rs1.getString("course_id"));
           jTextFieldBatchTime.setText(rs1.getString("batch_time"));
           }
       }
        
        catch(SQLException e)
       {
           System.out.println(e);
       } 
        
        
        
        /*String sql = "select * from teacher where f_id=?";

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
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldDateofAdmissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateofAdmissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateofAdmissionActionPerformed

    private void jTextFieldBatchTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBatchTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBatchTimeActionPerformed

    private void jTextFieldBatchDays1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBatchDays1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBatchDays1ActionPerformed

    private void jTextFieldBatchTime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBatchTime1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBatchTime1ActionPerformed

    private void jComboBoxBatchCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBatchCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBatchCodeActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        
        String sql = "update student set f_name=?,m_name=?,l_name=?,s_mother=?,DOB=?,Gender=?,email_id=?,Address=?,Ph_No=?,stud_admission=?,stud_branch=?,batch_code=? where stud_id=?";
        
        try
       {
           Connection conn = null;
           conn = DriverManager.getConnection(url, username, pass);
           
           PreparedStatement pst = conn.prepareStatement(sql);
           pst.setString(13, jTextFieldStudent_Id.getText());
 
           pst.setString(1, jTextFieldFirstName.getText());
           pst.setString(2, jTextFieldFatherName.getText());
           pst.setString(3, jTextFieldLastName.getText());
           pst.setString(4, jTextFieldMotherName.getText());
           pst.setString(5, jTextFieldDOB.getText());
           pst.setString(6, jTextFieldGender.getText());
           pst.setString(7, jTextFieldEmailId.getText());
           pst.setString(8, jTextAreaAddress.getText());
           pst.setString(9, jTextFieldPh_No.getText());
           pst.setString(10, jTextFieldDateofAdmission.getText());
           pst.setString(11, jTextFieldBranch.getText());
           
          
           if((jComboBoxBatchCode.getSelectedItem()).equals("Select")){
               pst.setString(12, jTextFieldBatchCode.getText());
           }
           else
           {
               pst.setString(12, (String)jComboBoxBatchCode.getSelectedItem());
           }
           
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null,"Update Successful");
           new StudentInfo().setVisible(true);
           this.setVisible(false);    
       }
        
        catch(SQLException e)
       {
           System.out.println(e);
           JOptionPane.showMessageDialog(null, "Update Failed","Error",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(StudentModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentModify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentModify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxBatchCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAdd;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelBatchCode;
    private javax.swing.JLabel jLabelBranch;
    private javax.swing.JLabel jLabelCourseID;
    private javax.swing.JLabel jLabelCourseName;
    private javax.swing.JLabel jLabelDOB;
    private javax.swing.JLabel jLabelDateOfAdmission;
    private javax.swing.JLabel jLabelEmailId;
    private javax.swing.JLabel jLabelFacultyID;
    private javax.swing.JLabel jLabelFacultyName;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelMiddleName;
    private javax.swing.JLabel jLabelMother_Name;
    private javax.swing.JLabel jLabelNew;
    private javax.swing.JLabel jLabelPh_No;
    private javax.swing.JLabel jLabelPrevious;
    private javax.swing.JLabel jLabelStudent_ID;
    private javax.swing.JLabel jLabelWallpaper;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldBatchCode;
    private javax.swing.JTextField jTextFieldBatchDays;
    private javax.swing.JTextField jTextFieldBatchDays1;
    private javax.swing.JTextField jTextFieldBatchTime;
    private javax.swing.JTextField jTextFieldBatchTime1;
    private javax.swing.JTextField jTextFieldBranch;
    private javax.swing.JTextField jTextFieldCourseID;
    private javax.swing.JTextField jTextFieldCourseID1;
    private javax.swing.JTextField jTextFieldDOB;
    private javax.swing.JTextField jTextFieldDateofAdmission;
    private javax.swing.JTextField jTextFieldEmailId;
    private javax.swing.JTextField jTextFieldFacultyID;
    private javax.swing.JTextField jTextFieldFacultyID1;
    private javax.swing.JTextField jTextFieldFatherName;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldMotherName;
    private javax.swing.JTextField jTextFieldPh_No;
    private javax.swing.JTextField jTextFieldStudent_Id;
    // End of variables declaration//GEN-END:variables
}

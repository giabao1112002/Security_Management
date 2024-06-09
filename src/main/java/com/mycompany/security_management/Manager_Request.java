/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.security_management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Manager_Request extends javax.swing.JFrame {

    String id_leave;
    String id_over;
    String id_Staff;
    String Manager_id;
    Connection con = DBContext.connect();
    PreparedStatement st; // Declare the PreparedStatement variable.
    ResultSet rs; // Declare the ResultSet variable

    /**
     * Creates new form Manager_Request
     */
    public Manager_Request() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        loadAll();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);  // Change made here

    }

    public Manager_Request(String Manager_Id) {
        this.Manager_id = Manager_Id;
        initComponents();
        loadAll();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);  // Change made here

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_RequestStatusLeave = new javax.swing.JTable();
        jButton_decLeave = new javax.swing.JButton();
        jButton_approveLeave = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton_Logout = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_RequestStatusOver = new javax.swing.JTable();
        jButton_approveOver = new javax.swing.JButton();
        jButton_decOver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel18.setText("Leave Request:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Request OverView");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jTable_RequestStatusLeave.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Id Staff", "Date", "Reason", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_RequestStatusLeave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_RequestStatusLeaveMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_RequestStatusLeave);

        jButton_decLeave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_decLeave.setText("Declined");
        jButton_decLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_decLeaveActionPerformed(evt);
            }
        });

        jButton_approveLeave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_approveLeave.setText("Approved");
        jButton_approveLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_approveLeaveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Leave Request");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_approveLeave)
                .addGap(72, 72, 72)
                .addComponent(jButton_decLeave)
                .addGap(367, 367, 367))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_approveLeave)
                    .addComponent(jButton_decLeave))
                .addContainerGap())
        );

        jButton_Logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Logout.setText("Log out");
        jButton_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogoutActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jTable_RequestStatusOver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Id Staff", "Date", "Shift", "Area", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_RequestStatusOver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_RequestStatusOverMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable_RequestStatusOver);

        jButton_approveOver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_approveOver.setText("Approved");
        jButton_approveOver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_approveOverActionPerformed(evt);
            }
        });

        jButton_decOver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_decOver.setText("Declined");
        jButton_decOver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_decOverActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Overtime Request");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jButton_approveOver)
                        .addGap(74, 74, 74)
                        .addComponent(jButton_decOver))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_approveOver)
                    .addComponent(jButton_decOver))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Logout))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogoutActionPerformed
        this.setVisible(false);
        new LoginManager().setVisible(true);
    }//GEN-LAST:event_jButton_LogoutActionPerformed

    private void jButton_approveLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_approveLeaveActionPerformed

        try {
            st = con.prepareStatement("UPDATE `security_management`.`leave_records` SET `status` = 'Approved' WHERE (`id_leave` =? );");
            st.setString(1, id_leave);
            int k = st.executeUpdate();
            if (k > 0) {
                JOptionPane.showMessageDialog(null, "Update successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadAll();
            } else {
                // Show a panel if the insertion fails
                JOptionPane.showMessageDialog(null, "Failed to update. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            st = con.prepareStatement("UPDATE `security_management`.`security` SET `Leave` = `Leave`+'1' WHERE (`idSecurity` = ?);");
            st.setString(1, id_Staff);
            int n = st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Security_Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_approveLeaveActionPerformed

    private void jButton_approveOverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_approveOverActionPerformed
        try {
            st = con.prepareStatement("UPDATE `security_management`.`overtime_records` SET `status` = 'Approved' WHERE (`id_overtime` = ?);");
            st.setString(1, id_over);
            int k = st.executeUpdate();
            if (k > 0) {
                JOptionPane.showMessageDialog(null, "Update successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadAll();

            } else {
                // Show a panel if the insertion fails
                JOptionPane.showMessageDialog(null, "Failed to update. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            st = con.prepareStatement("UPDATE `security_management`.`security` SET `Over` = `Over`+'1' WHERE (`idSecurity` = ?);");
            st.setString(1, id_Staff);
            int n = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Security_Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_approveOverActionPerformed

    private void jTable_RequestStatusLeaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_RequestStatusLeaveMouseClicked
        int row = jTable_RequestStatusLeave.getSelectedRow(); // Get the selected row index
        id_leave = jTable_RequestStatusLeave.getValueAt(row, 0).toString();
        id_Staff = jTable_RequestStatusLeave.getValueAt(row, 1).toString();
    }//GEN-LAST:event_jTable_RequestStatusLeaveMouseClicked

    private void jTable_RequestStatusOverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_RequestStatusOverMouseClicked
        int row = jTable_RequestStatusOver.getSelectedRow(); // Get the selected row index
        id_over = jTable_RequestStatusOver.getValueAt(row, 0).toString();
        id_Staff = jTable_RequestStatusOver.getValueAt(row, 1).toString();

    }//GEN-LAST:event_jTable_RequestStatusOverMouseClicked

    private void jButton_decOverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_decOverActionPerformed
        try {
            st = con.prepareStatement("UPDATE `security_management`.`overtime_records` SET `status` = 'Declined' WHERE (`id_overtime` =? );");
            st.setString(1, id_over);
            int k = st.executeUpdate();
            if (k > 0) {
                JOptionPane.showMessageDialog(null, "Update successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadAll();

            } else {
                // Show a panel if the insertion fails
                JOptionPane.showMessageDialog(null, "Failed to update. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Security_Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_decOverActionPerformed

    private void jButton_decLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_decLeaveActionPerformed
        try {
            st = con.prepareStatement("UPDATE `security_management`.`leave_records` SET `status` = 'Declined' WHERE (`id_leave` =? );");
            st.setString(1, id_leave);
            int k = st.executeUpdate();
            if (k > 0) {
                JOptionPane.showMessageDialog(null, "Update successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                loadAll();

            } else {
                // Show a panel if the insertion fails
                JOptionPane.showMessageDialog(null, "Failed to update. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Security_Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_decLeaveActionPerformed
    public void loadOver() {
        try {
            st = con.prepareStatement(" SELECT * FROM security_management.overtime_records;");
            rs = st.executeQuery();
            DefaultTableModel leaveTable = (DefaultTableModel) jTable_RequestStatusOver.getModel();
            leaveTable.setRowCount(0);
            while (rs.next()) {
                String no = rs.getString(1);
                String idStaff = rs.getString(2);
                String date = rs.getString(3);
                String shift = rs.getString(4);
                String area = rs.getString(5);
                String status = rs.getString(6);
                String[] row = {no, idStaff, date, shift, area, status};
                leaveTable.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Security_Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadLeave() {
        try {
            st = con.prepareStatement(" SELECT * FROM security_management.leave_records;");
            rs = st.executeQuery();
            DefaultTableModel leaveTable = (DefaultTableModel) jTable_RequestStatusLeave.getModel();
            leaveTable.setRowCount(0);
            while (rs.next()) {
                String no = rs.getString(1);
                String idStaff = rs.getString(2);
                String date = rs.getString(3);
                String reason = rs.getString(4);
                String status = rs.getString(5);
                String[] row = {no, idStaff, date, reason, status};
                leaveTable.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Security_Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void loadAll() {
        loadOver();
        loadLeave();
    }

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
            java.util.logging.Logger.getLogger(Manager_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager_Request().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Logout;
    private javax.swing.JButton jButton_approveLeave;
    private javax.swing.JButton jButton_approveOver;
    private javax.swing.JButton jButton_decLeave;
    private javax.swing.JButton jButton_decOver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable_RequestStatusLeave;
    private javax.swing.JTable jTable_RequestStatusOver;
    // End of variables declaration//GEN-END:variables
}
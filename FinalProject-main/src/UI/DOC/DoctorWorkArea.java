/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.DOC;
import DBUTIL.DBUTIL;
import UI.LoginScreen;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import MODEL.Doctor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Niharika
 */
public class DoctorWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form DoctorWorkArea
     */
    ResultSet resultSet = null;
    DBUTIL dbconn= new DBUTIL();
    Vector originalTableModel;
    public DoctorWorkArea() {
        initComponents();
        originalTableModel = (Vector) ((DefaultTableModel) tblViewPatients.getModel()).getDataVector().clone();
        populateTable();
        
        
    }
    
     private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblViewPatients.getModel();
        Connection conn = dbconn.getConnection();
        model.setRowCount(0);
        
         
                  String selectSql = "SELECT PAT_ID,PAT_NAME,AGE,GENDER FROM patients";

      Statement stmt;
       try {
            stmt = conn.createStatement();
       
            resultSet = stmt.executeQuery(selectSql);

             while (resultSet.next()) {
            
            Object[] row = new Object[4];
            row[0]=resultSet.getInt(1);
            row[1] = resultSet.getString(2);
            row[2] = resultSet.getInt(3);
            row[3]=resultSet.getString(4);
            
            
            model.addRow(row);
             }
             
            
             conn.close();
             
       }
       catch (SQLException ex) {
            Logger.getLogger(DoctorWorkArea.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewPatients = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tblViewPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Age", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewPatients);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 220, 490, 163);

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel1.setText("              PATIENT DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(163, 20, 360, 55);

        btnLogout.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout);
        btnLogout.setBounds(620, 30, 110, 24);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/DOC/DOCTOR LOGIN PAGE (2).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 790, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
    this.hide();
        LoginScreen frame = new  LoginScreen();
        frame.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorWorkArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblViewPatients;
    // End of variables declaration//GEN-END:variables
}

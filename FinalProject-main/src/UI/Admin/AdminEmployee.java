/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Admin;

import DBUTIL.DBUTIL;
import MODEL.Validations;
import UI.LoginScreen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishikagurram
 */
public class AdminEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AdminEmployee
     */
      Validations validations;
    Vector originalTableModel;
    Random rand = new Random();
    ResultSet resultSet1, resultSet2,resultSet3 = null;
    DBUTIL dbconn= new DBUTIL();
    public AdminEmployee() {
        initComponents();
        validations = new Validations();
        UpdateComboxes();
        populateTable();
                

        
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboPlasmaCenter = new javax.swing.JComboBox<>();
        lblbank = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblEmployeeName1 = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JTextField();
        lblEmployeeName2 = new javax.swing.JLabel();
        lblEmployeeName3 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        valName = new javax.swing.JLabel();
        valPassword = new javax.swing.JLabel();
        valPC = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        ComboPlasmaCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPlasmaCenterActionPerformed(evt);
            }
        });
        getContentPane().add(ComboPlasmaCenter);
        ComboPlasmaCenter.setBounds(270, 380, 140, 31);

        lblbank.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblbank.setText("PLASMA CENTER");
        getContentPane().add(lblbank);
        lblbank.setBounds(70, 380, 160, 21);

        btnBack.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(480, 20, 110, 27);

        btnAdd.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnAdd.setText("CREATE EMPLOYEE");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(50, 520, 220, 27);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setText("PLASMA CENTER EMPLOYEES ");
        getContentPane().add(lblTitle);
        lblTitle.setBounds(50, 20, 410, 29);

        lblEmployeeName1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblEmployeeName1.setText("PASSWORD");
        getContentPane().add(lblEmployeeName1);
        lblEmployeeName1.setBounds(110, 430, 110, 20);

        txtEmpID.setEditable(false);
        getContentPane().add(txtEmpID);
        txtEmpID.setBounds(260, 280, 160, 31);

        lblEmployeeName2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblEmployeeName2.setText("EMPLOYEE ID: ");
        getContentPane().add(lblEmployeeName2);
        lblEmployeeName2.setBounds(100, 290, 160, 21);

        lblEmployeeName3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        lblEmployeeName3.setText("NAME");
        getContentPane().add(lblEmployeeName3);
        lblEmployeeName3.setBounds(160, 340, 90, 21);

        txtEmpName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmpName);
        txtEmpName.setBounds(260, 330, 160, 31);

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(270, 420, 140, 30);

        valName.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valName);
        valName.setBounds(450, 330, 180, 20);

        valPassword.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valPassword);
        valPassword.setBounds(440, 430, 170, 20);

        valPC.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valPC);
        valPC.setBounds(430, 380, 180, 20);

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "User ID", "Plasma Center "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        tblEmployee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblEmployeeKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);
        if (tblEmployee.getColumnModel().getColumnCount() > 0) {
            tblEmployee.getColumnModel().getColumn(1).setHeaderValue("Employee Name");
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 60, 452, 170);

        btnDelete.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(350, 520, 170, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Admin/ADMIN BG.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-5, 0, 690, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.hide();
        AdminWorkArea frame = new AdminWorkArea();
        frame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        var valid = true;
        
        
        if (!this.validations.ValidateName(txtEmpName.getText()) ) {
            valName.setText("Name is Invalid");
            valid = false;
        }

        

        String pass_word = String.valueOf(txtPassword.getPassword());
        if (!this.validations.ValidatePassword(pass_word) ) {
            valPassword.setText("Should be 4-12 character long");
            valid = false;
        }
        
        String emp_name = txtEmpName.getText(); 
            //int user_id = Integer.valueOf(txtUsername.getText()); 
            int user_id = rand.nextInt(1,1000);
            String password = txtPassword.getText(); 
            
            //int emp_id = Integer.valueOf(txtEmpID.getText());
            int emp_id = rand.nextInt(1,1000);
            
            
            
            String spc_id = (String) ComboPlasmaCenter.getSelectedItem();
            int pc_id = Integer.valueOf(spc_id);
            
            
            int x = 2; 
            //validate username and password
            Connection conn = dbconn.getConnection();
        //do validation here.
       
        //check if the id already exists
       
     String INSERLOGINSSQL = "insert into logins(user_id, pass_word,role_id) values(?,?,?) ";
     String INSERTEMPLOYEESQL = "insert into emppc(emp_id,pc_id,employee_name, user_id) values(?,?,?,?)";

        PreparedStatement stmt1, stmt2; 
        try
        {
            stmt1 = conn.prepareStatement(INSERLOGINSSQL);
            stmt2 = conn.prepareStatement(INSERTEMPLOYEESQL);
            
            stmt1.setInt(1,user_id); 
            stmt1.setString(2,password); 
            stmt1.setInt(3,3);//role_id is set to =3// for plasma center admin
            
            stmt2.setInt(1,emp_id); 
            // get hos_id or pc_id from combo box
            stmt2.setInt(2,pc_id); 
            
            stmt2.setString(3, emp_name);
            stmt2.setInt(4,user_id);
            
            stmt1.executeUpdate(); 
            stmt2.executeUpdate(); 
            
          }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }



        JOptionPane.showMessageDialog(this,"Employee Created");
        JOptionPane.showMessageDialog(this,"Your UserID is  "+user_id);

     populateTable();
   
  //stop
   txtEmpName.setText("");
   txtEmpID.setText("");
   //txtUsername.setText("");
   txtPassword.setText("");
        
  
            
            
            
    }//GEN-LAST:event_btnAddActionPerformed

    private void ComboPlasmaCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPlasmaCenterActionPerformed
        // TODO add your handling code here:
        Object plasma = ComboPlasmaCenter.getSelectedItem();
        

        if (plasma  == null || plasma .toString().equals("")) {
            valPC.setText("Please Select Plasma Center");
            ComboPlasmaCenter.removeAllItems();
           valPC.setText(null);
        } else {
            ComboPlasmaCenter.setSelectedItem("");
        }
    }//GEN-LAST:event_ComboPlasmaCenterActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Connection conn = dbconn.getConnection();
         int SelectedRowIndex=tblEmployee.getSelectedRow();
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to delete");
            
        return;
        }
        DefaultTableModel model =(DefaultTableModel) tblEmployee.getModel();
         int EMP_ID=(int) model.getValueAt(SelectedRowIndex, 0);
       
         conn = dbconn.getConnection();
          String selectSql = "Delete from emppc  where EMP_ID=?";
     PreparedStatement stmt;
      try {
             
             stmt=conn.prepareStatement(selectSql);
             
                 stmt.setInt(1, EMP_ID);
                                   
              stmt.executeUpdate();
          conn.close();
          } catch (SQLException ex) {
              Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
          }
    
         
        JOptionPane.showMessageDialog(this, "Plasma Center Employee Deleted");
        populateTable();
        setTextNull();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblEmployeeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblEmployeeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEmployeeKeyPressed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblEmployee.getModel();

        // set data to textfield when raw is selected

        String emp_id = tblModel.getValueAt(tblEmployee.getSelectedRow(),0).toString();
        String emp_name = tblModel.getValueAt(tblEmployee.getSelectedRow(),1).toString();
        //String hos_id = tblModel.getValueAt(tblPlasma.getSelectedRow(),2).toString();
        String pc_id = tblModel.getValueAt(tblEmployee.getSelectedRow(),2).toString();
        
        

        txtEmpID.setText(String.valueOf(emp_id));
        txtEmpName.setText(emp_name);
         ComboPlasmaCenter.getSelectedItem();
       
        setValidationNull();
    }//GEN-LAST:event_tblEmployeeMouseClicked

    private void txtEmpNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpNameKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateName(txtEmpName.getText()) ) {
            valName.setText("Name is required");
        }
        else {
            valName.setText(null);
        }
    }//GEN-LAST:event_txtEmpNameKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        String password = String.valueOf(txtPassword.getPassword());
        if (!this.validations.ValidatePassword(password) ) {
            valPassword.setText("Should be 4-12 character long");
        } else {
            valPassword.setText(null);
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

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
            java.util.logging.Logger.getLogger(AdminEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminEmployee().setVisible(true);
            }
        });
    }
    private void UpdateComboxes()
{
    
    Connection conn = dbconn.getConnection();
        
        String SELECTSQL2 = "SELECT PC_ID FROM PLASMAC";

        PreparedStatement stmt2; 
        try
        {
            
            stmt2 = conn.prepareStatement(SELECTSQL2);
            
            resultSet2 = stmt2.executeQuery(); 
            
            
            
            while(resultSet2.next())
            {
                ComboPlasmaCenter.addItem(resultSet2.getString(1));
            }
       
             
            
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
}
     private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
         Connection conn = dbconn.getConnection();
        model.setRowCount(0);
        
         
                  String selectSql = "select emp_id,  employee_name,user_id,pc_id from emppc ";

      Statement stmt;
       try {
            stmt = conn.createStatement();
       
            resultSet3 = stmt.executeQuery(selectSql);

             while (resultSet3.next()) {
            
            Object[] row = new Object[4];
            row[0]=resultSet3.getInt(1);
            row[1] = resultSet3.getString(2);
            row[2]=resultSet3.getInt(3);
            row[3]=resultSet3.getInt(4);
            
            model.addRow(row);
             }
             
            
             conn.close();
             
       }
       catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void setTextNull() {
    txtEmpID.setText(null);
        txtEmpName.setText(null);
//         ComboPlasmaCenter.setSelection(null);
         
    }
    private void setValidationNull() {
        valName.setText(null);
         valPC.setText(null);
        valPassword.setText(null);
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboPlasmaCenter;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployeeName1;
    private javax.swing.JLabel lblEmployeeName2;
    private javax.swing.JLabel lblEmployeeName3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblbank;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPC;
    private javax.swing.JLabel valPassword;
    // End of variables declaration//GEN-END:variables
}

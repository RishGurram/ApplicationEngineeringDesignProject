/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.Hospital;


import DBUTIL.DBUTIL;
import MODEL.HOSPITAL;
import MODEL.Validations;
import UI.Admin.AdminHospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import java.util.Vector;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 91918
 */
public class RequestToPlasmaCenter extends javax.swing.JFrame {

    /**
     * Creates new form RequestToPlasmaCenter
     */
    DBUTIL dbconn= new DBUTIL();
    ResultSet resultSet1, resultSet2 = null;
    Random rand = new Random();
    public static int myhos_id = HOSPITAL.getHos_id();
  Validations validations;

    Vector originalTableModel;

    public RequestToPlasmaCenter() {
        initComponents();
        System.out.println("plasma req hos_id="+myhos_id);
        populateCombox(); 
        validations = new Validations();
        originalTableModel = (Vector) ((DefaultTableModel) tblHPCRequest.getModel()).getDataVector().clone();
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

        txtReqID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHPCRequest = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        comboxPatientID = new javax.swing.JComboBox<>();
        comboxStatus = new javax.swing.JComboBox<>();
        comboxBloodGroup = new javax.swing.JComboBox<>();
        valBlood = new javax.swing.JLabel();
        valPat = new javax.swing.JLabel();
        valStatus = new javax.swing.JLabel();
        valQty = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        txtReqID.setEditable(false);
        txtReqID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReqIDActionPerformed(evt);
            }
        });
        txtReqID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtReqIDKeyReleased(evt);
            }
        });
        getContentPane().add(txtReqID);
        txtReqID.setBounds(330, 300, 90, 31);

        jLabel7.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel7.setText("REQUEST ID ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(180, 310, 100, 18);

        jLabel1.setFont(new java.awt.Font("American Typewriter", 1, 24)); // NOI18N
        jLabel1.setText("REQUEST TO PLASMA CENTER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 10, 420, 55);

        tblHPCRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Req ID", "Patient ID", "Quantity", "Status", "Blood Group"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        tblHPCRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHPCRequestMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHPCRequest);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 120, 700, 133);

        jLabel3.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel3.setText("BLOOD GROUP");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(175, 360, 130, 18);

        jLabel4.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel4.setText("PATIENT ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(196, 410, 100, 18);

        jLabel5.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel5.setText("QUANTITY");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 470, 100, 18);

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantityKeyReleased(evt);
            }
        });
        getContentPane().add(txtQuantity);
        txtQuantity.setBounds(340, 460, 90, 31);

        jLabel6.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        jLabel6.setText("STATUS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(217, 510, 80, 18);

        btnAdd.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnAdd.setText("CREATE REQUEST");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(280, 560, 180, 24);

        btnUpdate.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(353, 260, 90, 24);

        btnDelete.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(480, 260, 90, 24);

        btnBack.setFont(new java.awt.Font("American Typewriter", 1, 13)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(680, 20, 72, 24);

        comboxPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxPatientIDActionPerformed(evt);
            }
        });
        getContentPane().add(comboxPatientID);
        comboxPatientID.setBounds(340, 410, 90, 31);

        comboxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Requested", "Recieved" }));
        comboxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxStatusActionPerformed(evt);
            }
        });
        getContentPane().add(comboxStatus);
        comboxStatus.setBounds(340, 510, 130, 31);

        comboxBloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O+", "O-", "AB+", "AB-", "A+", "A-", "B+", "B-" }));
        comboxBloodGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxBloodGroupActionPerformed(evt);
            }
        });
        getContentPane().add(comboxBloodGroup);
        comboxBloodGroup.setBounds(340, 350, 80, 31);

        valBlood.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valBlood);
        valBlood.setBounds(470, 350, 210, 20);

        valPat.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valPat);
        valPat.setBounds(480, 410, 210, 20);

        valStatus.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valStatus);
        valStatus.setBounds(460, 510, 210, 20);

        valQty.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        getContentPane().add(valQty);
        valQty.setBounds(460, 460, 210, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Hospital/hospital.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -40, 800, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
       
        //int patient_id =Integer.valueOf((String) comboxBloodGroup.getSelectedItem());
        
        String strPat_id = (String) comboxPatientID.getSelectedItem();
        int pat_id = Integer.valueOf(strPat_id);
        
         
        
        int quantity = Integer.parseInt(txtQuantity.getText());
        String status = (String)comboxStatus.getSelectedItem();
        // DO SOME VALIDATIONS HERE and if it doesnt match, return. 
        // code for request ID to be autogenerated. 
        
        String Blood_group = (String) comboxBloodGroup.getSelectedItem();
        
        String addReq = "insert into HPCRequest(request_id, pat_id,qty, status, blood_group) values "
                + "(?,?,?,?,?)"; 
        Connection conn = dbconn.getConnection();
        PreparedStatement stmt1 ; 
        try
        {
            stmt1 = conn.prepareStatement(addReq);
            int req_id = rand.nextInt(100); 
            stmt1. setInt(1,req_id); // this is now set to 2, later change to random number of req id
            stmt1. setInt(2,pat_id); 
            stmt1.setInt(3,quantity);
            stmt1.setString(4,status);
            stmt1.setString(5,Blood_group);
            stmt1.executeQuery();
            
            JOptionPane.showMessageDialog(this,"Registered Successfully");
            
            
            }
        catch (SQLException ex)
        {
            Logger.getLogger(RequestToPlasmaCenter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        populateTable();
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
    this.hide();
        HospitalWorkArea frame = new HospitalWorkArea();
        frame.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
     
        // TODO add your handling code here:
        Connection conn = dbconn.getConnection();
         int SelectedRowIndex=tblHPCRequest.getSelectedRow();
        if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to delete");
            
        return;
        }
        DefaultTableModel model =(DefaultTableModel) tblHPCRequest.getModel();
         int request_id=(int) model.getValueAt(SelectedRowIndex, 0);
       
         conn = dbconn.getConnection();
          String selectSql = "Delete from HPCRequest where request_id=?";
     PreparedStatement stmt;
      try {
             
             stmt=conn.prepareStatement(selectSql);
             
                 stmt.setInt(1, request_id);
                                   
              stmt.executeUpdate();
          conn.close();
          } catch (SQLException ex) {
              Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
          }
    
         
        JOptionPane.showMessageDialog(this, "Request to Plasma Center Deleted");
        populateTable();

    
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblHPCRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHPCRequestMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel) tblHPCRequest.getModel();
        String Req_id = tblModel.getValueAt(tblHPCRequest.getSelectedRow(),0).toString();
        String Blood_group = tblModel.getValueAt(tblHPCRequest.getSelectedRow(),4).toString();
        String patient_id = tblModel.getValueAt(tblHPCRequest.getSelectedRow(),1).toString();
        String quantity = tblModel.getValueAt(tblHPCRequest.getSelectedRow(),2).toString();
        String Status = tblModel.getValueAt(tblHPCRequest.getSelectedRow(),3).toString();
        
        //txtreq_ID.setText(Req_id); 
        //txtPatientID.setText(patient_id); 
        txtQuantity.setText(quantity);
        txtReqID.setText(Req_id); 
        
        
    }//GEN-LAST:event_tblHPCRequestMouseClicked

    private void comboxPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxPatientIDActionPerformed
        // TODO add your handling code here:
        Object plasma = comboxPatientID.getSelectedItem();
        

        if (plasma  == null || plasma .toString().equals("")) {
            valPat.setText("Please Select Patient");
            comboxPatientID.removeAllItems();
           valPat.setText(null);
        } else {
           comboxPatientID.setSelectedItem("");
        }
    }//GEN-LAST:event_comboxPatientIDActionPerformed

    private void comboxBloodGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxBloodGroupActionPerformed
        // TODO add your handling code here:
       Object plasma = comboxBloodGroup.getSelectedItem();
        

        if (plasma  == null || plasma .toString().equals("")) {
            valBlood.setText("Please Select Blood Group");
            comboxBloodGroup.removeAllItems();
           valBlood.setText(null);
        } else {
            comboxBloodGroup.setSelectedItem("");
        }
    }//GEN-LAST:event_comboxBloodGroupActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
       String strPat_id = (String) comboxPatientID.getSelectedItem();
        int pat_id = Integer.valueOf(strPat_id);
        
         
          int req_id = Integer.parseInt(txtReqID.getText());
        int quantity = Integer.parseInt(txtQuantity.getText());
        String status = (String)comboxStatus.getSelectedItem();
        // DO SOME VALIDATIONS HERE and if it doesnt match, return. 
        // code for request ID to be autogenerated. 
        System.out.println("I am working status 1");
        
        String Blood_group = (String) comboxBloodGroup.getSelectedItem();
         int SelectedRowIndex=tblHPCRequest.getSelectedRow();
       System.out.println("SelectedRowIndex "+SelectedRowIndex);
                  if(SelectedRowIndex<0)
        {
         JOptionPane.showMessageDialog(this, "Please select a row to Update");
            
        return;
        
        }
                  
                
           
            // validate the text from text boxes 
       //DBUTIL dbconn= new DBUTIL();
        Connection conn = dbconn.getConnection();
        //do validation here.
        //check if the id already exists
                String SELECTHOSSQL = "update HPCRequest set qty=? ,status=? where request_id=? ";
                PreparedStatement stmt; 
        try
        {
            stmt = conn.prepareStatement(SELECTHOSSQL);
            //int req_id = rand.nextInt(100);
             
            stmt.setInt(1,quantity); 
            stmt.setString(2,status);
              
            
         
            stmt.setInt(3,req_id);
            stmt.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        // to display in the text boxes          
        DefaultTableModel tblModel = (DefaultTableModel) tblHPCRequest.getModel();
        tblModel.setValueAt(req_id,tblHPCRequest.getSelectedRow(), 1);      
       tblModel.setValueAt(quantity,tblHPCRequest.getSelectedRow(), 2);
       tblModel.setValueAt(status,tblHPCRequest.getSelectedRow(), 3);
      // tblModel.setValueAt(hos_id,tblPlasma.getSelectedRow(), 2);
//       tblModel.setValueAt(address,tblPlasma.getSelectedRow(), 2);
//       tblModel.setValueAt(mobile,tblPlasma.getSelectedRow(), 3);
       
        

  JOptionPane.showMessageDialog(this,"Request to Plasma Center updated!!");

       populateTable(); 
    txtQuantity.setText("");
   comboxStatus.setSelectedItem("");
       
   
  //stop
      
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateQuantity(txtQuantity.getText()) ) {
            valQty.setText("Quantity is Invalid");
        }
        else {
            valQty.setText(null);
        }
    }//GEN-LAST:event_txtQuantityKeyReleased

    private void comboxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxStatusActionPerformed
        // TODO add your handling code here:
         Object plasma = comboxStatus.getSelectedItem();
        

        if (plasma  == null || plasma .toString().equals("")) {
            valStatus.setText("Please Select Patient");
            comboxStatus.removeAllItems();
           valStatus.setText(null);
        } else {
           comboxStatus.setSelectedItem("");
        }
    }//GEN-LAST:event_comboxStatusActionPerformed

    private void txtReqIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReqIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReqIDActionPerformed

    private void txtReqIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReqIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReqIDKeyReleased

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
            java.util.logging.Logger.getLogger(RequestToPlasmaCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequestToPlasmaCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequestToPlasmaCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequestToPlasmaCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequestToPlasmaCenter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboxBloodGroup;
    private javax.swing.JComboBox<String> comboxPatientID;
    private javax.swing.JComboBox<String> comboxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHPCRequest;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtReqID;
    private javax.swing.JLabel valBlood;
    private javax.swing.JLabel valPat;
    private javax.swing.JLabel valQty;
    private javax.swing.JLabel valStatus;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblHPCRequest.getModel();
        Connection conn = dbconn.getConnection();
        model.setRowCount(0);
        
         
     String selectSql = "select h.request_id, h.pat_id,h.qty,h.status, h.blood_group from hpcrequest h join patients p on h.pat_id = p.pat_id join doctors d on p.doc_id = d.doc_id where hos_id=?";
     

      PreparedStatement stmt;
       try {
            stmt = conn.prepareStatement(selectSql);
            stmt.setInt(1,myhos_id);
       
            resultSet1 = stmt.executeQuery();

             while (resultSet1.next()) {
            
            Object[] row = new Object[5];
            row[0] = resultSet1.getInt(1);
            row[1]=resultSet1.getInt(2);
            row[2] = resultSet1.getInt(3);
            row[3]=resultSet1.getString(4);
            row[4]=resultSet1.getString(5);
            
            
            model.addRow(row);
             }
             
            
             conn.close();
             
       }
       catch (SQLException ex) {
            Logger.getLogger(RequestToPlasmaCenter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    private void populateCombox() {
        Connection conn = dbconn.getConnection();
        String SELECTSQL1 = "select pat_id from patients "
                + "join doctors on patients.doc_id = doctors.doc_id where hos_id =? ";
        
        PreparedStatement stmt1; 
        try
        {
            stmt1 = conn.prepareStatement(SELECTSQL1);
            stmt1.setInt(1,myhos_id); // later set this to hos_id
            
            resultSet1 = stmt1.executeQuery();
                    
            while(resultSet1.next())
            {
                comboxPatientID.addItem(resultSet1.getString(1));
            }
            
          }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminHospital.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
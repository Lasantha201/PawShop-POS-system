package pawshopf;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;

public class manageCategory extends javax.swing.JFrame {
    
    // Database connection credentials and URL
    private static final String username ="root";
    private static final String password ="";
    private static final String dataconn = "jdbc:mysql://localhost:3306/paw_shop";
    
    Connection sqlconn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private int categoryIdValue;
    
    
    public manageCategory() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        categoryID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cDescription = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        cName = new javax.swing.JTextField();
        sbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Paws Shop");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText(" Manage Category");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 400, 80));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Category ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Category Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Description");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        categoryID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        categoryID.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        categoryID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryIDActionPerformed(evt);
            }
        });
        jPanel1.add(categoryID, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 190, 30));

        cDescription.setColumns(20);
        cDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cDescription.setRows(5);
        cDescription.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jScrollPane1.setViewportView(cDescription);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 150, 270, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 90, -1));

        jButton2.setBackground(new java.awt.Color(0, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 90, -1));

        jButton3.setBackground(new java.awt.Color(0, 255, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 255, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 90, -1));

        jLabel6.setBackground(new java.awt.Color(255, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Enter only Category ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, -1, -1));

        table1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "categoryID", "cName", "cDescription"
            }
        ));
        jScrollPane2.setViewportView(table1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 300));

        cName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cName.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel1.add(cName, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 190, 30));

        sbtn.setBackground(new java.awt.Color(0, 255, 204));
        sbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sbtn.setText("Search");
        sbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbtnActionPerformed(evt);
            }
        });
        jPanel1.add(sbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Enter Only Category ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, -1, 20));

        jButton8.setBackground(new java.awt.Color(0, 255, 204));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton8.setText("Grid View");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 980, 410));

        jButton5.setBackground(new java.awt.Color(0, 255, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("Previous");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

        jButton6.setBackground(new java.awt.Color(0, 255, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("Close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 540, 100, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\final project petshop\\icon\\icons8-control-50.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\final project petshop\\icon\\artwork-7141131_1280.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //back to the progresspage
        processPage pp = new processPage();
        pp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        dispose(); //close manageCategory page
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //clear all input
        categoryID.setText(" ");
        cName.setText(" ");
        cDescription.setText(" ");

    }//GEN-LAST:event_jButton2ActionPerformed
    
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //save data into category table 
        try {
            // Database connection part
            Class.forName("com.mysql.jdbc.Driver");// Load JDBC driver
            sqlconn = DriverManager.getConnection(dataconn, username, password);
            pst = sqlconn.prepareStatement("INSERT INTO category(categoryID, cName, cDescription) VALUES (?,?,?)");
            
            // Set the parameters for the SQL statement
            pst.setString(1, categoryID.getText());
            pst.setString(2, cName.getText());
            pst.setString(3, cDescription.getText());
            
            pst.executeUpdate();
            
                JOptionPane.showMessageDialog(this, "Record added Successfull!");
                
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this,"Record added UnSuccessfull!"+ e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void categoryIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryIDActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Delete data from category
        try{
            // Database connection part
            Class.forName("com.mysql.jdbc.Driver");// Load JDBC driver
            sqlconn = DriverManager.getConnection(dataconn, username, password);
            pst = sqlconn.prepareStatement("DELETE FROM category WHERE categoryID = ?");
            
            // Set the parameters for the SQL statement
            pst.setString(1, categoryID.getText());
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Product Delete Successfull!");
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(this,"Product Delete UnSuccessfull!" + e.getMessage());
        }
           
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //update category
        try {
             // Database connection part
            Class.forName("com.mysql.jdbc.Driver");// Load JDBC driver
            sqlconn = DriverManager.getConnection(dataconn, username, password);
            pst = sqlconn.prepareStatement("UPDATE category SET cName=?, cDescription=? WHERE categoryID=?");
            
            // Set the parameters for the SQL statement
            pst.setString(1, cName.getText());
            pst.setString(2, cDescription.getText());
            pst.setString(3, categoryID.getText());
            
            pst.executeUpdate();
            
                JOptionPane.showMessageDialog(this, "Record Updated Successfull!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbtnActionPerformed
        //search category
         try {
            // Database connection part
            Class.forName("com.mysql.jdbc.Driver");// Load JDBC driver
            sqlconn = DriverManager.getConnection(dataconn, username, password);
            pst = sqlconn.prepareStatement("SELECT * FROM category WHERE categoryID=?");
            
            // Set the parameters for the SQL statement
            pst.setString(1, categoryID.getText());
            
            rs = pst.executeQuery();
            
            if(rs.next() == false){
                JOptionPane.showMessageDialog(this, "Record Not Found!");
                categoryID.setText("");
                cName.setText("");
                cDescription.setText("");
                
            }else{
                cName.setText(rs.getString("cName"));
                cDescription.setText(rs.getString("cDescription"));
            }
            
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Record Not Found!" + e.getMessage());
        }
    }//GEN-LAST:event_sbtnActionPerformed
    
    private boolean isDataVisible = false; // condition for grid view button
    
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //For All columns and  raws views
        if (isDataVisible){
            DefaultTableModel tblModel = (DefaultTableModel) table1.getModel();
            tblModel.setRowCount(0);
            isDataVisible = false;
        }else {
            
             try {
                
                 //database connection part
                Class.forName("com.mysql.jdbc.Driver");
                sqlconn = DriverManager.getConnection(dataconn, username, password);
                pst = sqlconn.prepareStatement("SELECT * FROM category");
                rs = pst.executeQuery();

                DefaultTableModel tblModel = (DefaultTableModel) table1.getModel();
                tblModel.setRowCount(0);

                 while (rs.next()) {

                    String categoryID = rs.getString("categoryID");
                    String cName = rs.getString("cName");
                    String cDescription = rs.getString("cDescription");

                    String tbdata[] = {categoryID, cName, cDescription};
                    tblModel.addRow(tbdata);
                    }
                 isDataVisible = true; 
                 } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Failed: " + ex.getMessage());
        }
               
    }//GEN-LAST:event_jButton8ActionPerformed
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
            java.util.logging.Logger.getLogger(manageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageCategory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cDescription;
    private javax.swing.JTextField cName;
    private javax.swing.JTextField categoryID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton sbtn;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}

package pawshopf;

import java.util.logging.Level;
import java.util.logging.Logger;


public class loadingPage extends javax.swing.JFrame {

    Object loadingPage;

    /**
     * Creates new form loadingPage
     */
    public loadingPage() {
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
        pgrb = new javax.swing.JProgressBar();
        please_txt = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Paws Shop");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText(" The Paws Shop");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 360, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\final project petshop\\icon\\pexels-mathew-coulton-2358287-4445456 (2).jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 800, 340));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        jLabel4.setText("Your ultimate pet supply Heaven...");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        pgrb.setBackground(new java.awt.Color(255, 255, 255));
        pgrb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pgrb.setForeground(new java.awt.Color(0, 0, 0));
        pgrb.setBorder(null);
        pgrb.setStringPainted(true);
        getContentPane().add(pgrb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 610, 30));

        please_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        please_txt.setText("Please Wait...");
        getContentPane().add(please_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 130, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\final project petshop\\icon\\icons8-petshop-68.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 70, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\final project petshop\\icon\\artwork-7141131_1280.png")); // NOI18N
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorMoved

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
            java.util.logging.Logger.getLogger(loadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loadingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //for visible loading page
        final loadingPage lp = new loadingPage();
        lp.setVisible(true);
        
        secondPage sp = new secondPage();
        
        //process for the progress bar
        for(int i =0; i<=100; i++){
            try {
                Thread.sleep(50);
                
                //process for the text changing with progress bar
                switch(i){
                    
                    case 25:
                        lp.please_txt.setText("Loading...");
                        break;
                    case 50:
                        lp.please_txt.setText("Stay Tuned...");
                        break;
                    case 75:
                        lp.please_txt.setText("Please Wait...");
                        break;
                }
                
                lp.pgrb.setValue(i);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(loadingPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //visible for second page
        new loadingPage().setVisible(false);
        sp.setVisible(true);
        lp.dispose();    
                   
    }     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar pgrb;
    private javax.swing.JLabel please_txt;
    // End of variables declaration//GEN-END:variables
}

                

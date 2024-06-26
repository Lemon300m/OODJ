/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lecturer;

/**
 *
 * @author shong
 */
public class Lecturer extends javax.swing.JFrame {

    /**
     * Creates new form form
     */
    public Lecturer() {
        initComponents();
        tpnumTxt.setText("LP74543");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        viewSuperviseesBtn = new javax.swing.JButton();
        viewPresentationBtn = new javax.swing.JButton();
        viewSecondMarkerBtn = new javax.swing.JButton();
        viewReportBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tpnumTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Lecturer Homepage");

        viewSuperviseesBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        viewSuperviseesBtn.setText("View Assigned Supervisees");
        viewSuperviseesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSuperviseesBtnActionPerformed(evt);
            }
        });

        viewPresentationBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        viewPresentationBtn.setText("View Presentation Requests");
        viewPresentationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPresentationBtnActionPerformed(evt);
            }
        });

        viewSecondMarkerBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        viewSecondMarkerBtn.setText("Give Remark");
        viewSecondMarkerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSecondMarkerBtnActionPerformed(evt);
            }
        });

        viewReportBtn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        viewReportBtn.setText("View Report");
        viewReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("TP Number:");

        tpnumTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tpnumTxt.setText("tpNum");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addComponent(tpnumTxt))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewPresentationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewSecondMarkerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewSuperviseesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(271, 386, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tpnumTxt))
                .addGap(18, 18, 18)
                .addComponent(viewSuperviseesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(viewPresentationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewSecondMarkerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(537, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getTpnumTxt(String tpnum) {
        return tpnumTxt.getText();
    }
    
    private void viewSuperviseesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSuperviseesBtnActionPerformed
        // TODO add your handling code here:
        String tpNumber = tpnumTxt.getText();
        ViewAssignedSupervisees vas = new ViewAssignedSupervisees(tpNumber);
        vas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewSuperviseesBtnActionPerformed

    private void viewPresentationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPresentationBtnActionPerformed
        // TODO add your handling code here:
        String tpNumber = tpnumTxt.getText();
        ViewPresentationRequest vPR = new ViewPresentationRequest(tpNumber);
        vPR.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewPresentationBtnActionPerformed

    private void viewSecondMarkerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSecondMarkerBtnActionPerformed
        // TODO add your handling code here:
        String tpNumber = tpnumTxt.getText();
        GiveRemarks GR = new GiveRemarks(tpNumber);
        GR.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewSecondMarkerBtnActionPerformed

    private void viewReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportBtnActionPerformed
        // TODO add your handling code here:
        String tpNumber = tpnumTxt.getText();
        ViewReport vR = new ViewReport(tpNumber);
        vR.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewReportBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
            
        Lecturer lecturer = new Lecturer();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tpnumTxt;
    private javax.swing.JButton viewPresentationBtn;
    private javax.swing.JButton viewReportBtn;
    private javax.swing.JButton viewSecondMarkerBtn;
    private javax.swing.JButton viewSuperviseesBtn;
    // End of variables declaration//GEN-END:variables
}

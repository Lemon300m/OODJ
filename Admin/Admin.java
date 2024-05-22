
import pack.ADMIN.PROFILE_EDITS;

public class Admin extends javax.swing.JFrame {

 
    public Admin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        titleLogin = new javax.swing.JLabel();
        btn2Admin = new javax.swing.JButton();
        btn1Admin = new javax.swing.JButton();
        btn2Admin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setToolTipText("");

        titleLogin.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 1, 24)); // NOI18N
        titleLogin.setForeground(new java.awt.Color(0, 0, 0));
        titleLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLogin.setText("ADMIN PAGE");

        btn2Admin.setBackground(new java.awt.Color(153, 255, 255));
        btn2Admin.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 12)); // NOI18N
        btn2Admin.setForeground(new java.awt.Color(0, 0, 0));
        btn2Admin.setText("PROJECT ALLOTMENT");
        btn2Admin.setBorder(null);
        btn2Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2AdminActionPerformed(evt);
            }
        });

        btn1Admin.setBackground(new java.awt.Color(153, 255, 255));
        btn1Admin.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 12)); // NOI18N
        btn1Admin.setForeground(new java.awt.Color(0, 0, 0));
        btn1Admin.setText("PROFILES");
        btn1Admin.setBorder(null);
        btn1Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1AdminActionPerformed(evt);
            }
        });

        btn2Admin1.setBackground(new java.awt.Color(153, 255, 255));
        btn2Admin1.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 12)); // NOI18N
        btn2Admin1.setForeground(new java.awt.Color(0, 0, 0));
        btn2Admin1.setText("STUDENT/LECTURER DETAILS");
        btn2Admin1.setBorder(null);
        btn2Admin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2Admin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn1Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn2Admin1))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(titleLogin)
                .addGap(50, 50, 50)
                .addComponent(btn1Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn2Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn2Admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void btn2AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2AdminActionPerformed
        
    }//GEN-LAST:event_btn2AdminActionPerformed

    private void btn1AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1AdminActionPerformed
        PROFILE_EDITS profile_edits = new PROFILE_EDITS();
        profile_edits.setVisible(true);

    }//GEN-LAST:event_btn1AdminActionPerformed

    private void btn2Admin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2Admin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2Admin1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1Admin;
    private javax.swing.JButton btn2Admin;
    private javax.swing.JButton btn2Admin1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel titleLogin;
    // End of variables declaration//GEN-END:variables
}



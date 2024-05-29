


public class Admin extends javax.swing.JFrame {

 
    public Admin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn2Admin2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        titleLogin = new javax.swing.JLabel();
        btn1Admin = new javax.swing.JButton();
        btn2Admin3 = new javax.swing.JButton();
        btn1Admin1 = new javax.swing.JButton();
        btn1Admin2 = new javax.swing.JButton();
        btn1Admin3 = new javax.swing.JButton();

        btn2Admin2.setBackground(new java.awt.Color(153, 255, 255));
        btn2Admin2.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 12)); // NOI18N
        btn2Admin2.setForeground(new java.awt.Color(0, 0, 0));
        btn2Admin2.setText("STUDENT/LECTURER DETAILS");
        btn2Admin2.setBorder(null);
        btn2Admin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2Admin2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setToolTipText("");

        titleLogin.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 1, 24)); // NOI18N
        titleLogin.setForeground(new java.awt.Color(0, 0, 0));
        titleLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLogin.setText("ADMIN PAGE");

        btn1Admin.setBackground(new java.awt.Color(255, 255, 255));
        btn1Admin.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 12)); // NOI18N
        btn1Admin.setForeground(new java.awt.Color(0, 0, 0));
        btn1Admin.setText("User");
        btn1Admin.setBorder(null);
        btn1Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1AdminActionPerformed(evt);
            }
        });

        btn2Admin3.setBackground(new java.awt.Color(255, 255, 255));
        btn2Admin3.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 12)); // NOI18N
        btn2Admin3.setForeground(new java.awt.Color(0, 0, 0));
        btn2Admin3.setText("Intake Assignment");
        btn2Admin3.setBorder(null);
        btn2Admin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2Admin3ActionPerformed(evt);
            }
        });

        btn1Admin1.setBackground(new java.awt.Color(153, 255, 255));
        btn1Admin1.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 12)); // NOI18N
        btn1Admin1.setForeground(new java.awt.Color(0, 0, 0));
        btn1Admin1.setText("Back");
        btn1Admin1.setBorder(null);
        btn1Admin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1Admin1ActionPerformed(evt);
            }
        });

        btn1Admin2.setBackground(new java.awt.Color(255, 255, 255));
        btn1Admin2.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 12)); // NOI18N
        btn1Admin2.setForeground(new java.awt.Color(0, 0, 0));
        btn1Admin2.setText("Add Intake");
        btn1Admin2.setBorder(null);
        btn1Admin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1Admin2ActionPerformed(evt);
            }
        });

        btn1Admin3.setBackground(new java.awt.Color(255, 255, 255));
        btn1Admin3.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 12)); // NOI18N
        btn1Admin3.setForeground(new java.awt.Color(0, 0, 0));
        btn1Admin3.setText("Add Student");
        btn1Admin3.setBorder(null);
        btn1Admin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1Admin3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(titleLogin))
                    .addComponent(btn1Admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn1Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1Admin3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2Admin3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1Admin2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn1Admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(titleLogin)
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn2Admin3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1Admin3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1Admin2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
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

    
    
    
    private void btn1AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1AdminActionPerformed
        PROFILE_EDITS profile_edits = new PROFILE_EDITS();
        profile_edits.setVisible(true);

    }//GEN-LAST:event_btn1AdminActionPerformed

    private void btn2Admin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2Admin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2Admin2ActionPerformed

    private void btn2Admin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2Admin3ActionPerformed
        // TODO add your handling code here:
        IntakeAssingment intakeassignment = new IntakeAssingment();
        intakeassignment.setVisible(true);
    }//GEN-LAST:event_btn2Admin3ActionPerformed

    private void btn1Admin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1Admin1ActionPerformed
        // TODO add your handling code here:
        this.dispose();

        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btn1Admin1ActionPerformed

    private void btn1Admin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1Admin2ActionPerformed
        // TODO add your handling code here:
        this.dispose();

        newintake ni = new newintake();
        ni.setVisible(true);
    }//GEN-LAST:event_btn1Admin2ActionPerformed

    private void btn1Admin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1Admin3ActionPerformed
        // TODO add your handling code here:
        addstudent as = new addstudent();
        as.setVisible(true);
    }//GEN-LAST:event_btn1Admin3ActionPerformed

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
    private javax.swing.JButton btn1Admin1;
    private javax.swing.JButton btn1Admin2;
    private javax.swing.JButton btn1Admin3;
    private javax.swing.JButton btn2Admin2;
    private javax.swing.JButton btn2Admin3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel titleLogin;
    // End of variables declaration//GEN-END:variables
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class REGISTER extends javax.swing.JFrame {

    public REGISTER() {
        initComponents();
    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        titleLogin = new javax.swing.JLabel();
        btn1REGISTER = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        tf1REGISTER = new javax.swing.JTextField();
        tf2REGISTER = new javax.swing.JTextField();
        lb2Login = new javax.swing.JLabel();
        lb3Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setToolTipText("");

        titleLogin.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 1, 24)); // NOI18N
        titleLogin.setForeground(new java.awt.Color(0, 0, 0));
        titleLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLogin.setText("REGISTER");

        btn1REGISTER.setBackground(new java.awt.Color(153, 255, 255));
        btn1REGISTER.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 12)); // NOI18N
        btn1REGISTER.setForeground(new java.awt.Color(0, 0, 0));
        btn1REGISTER.setText("REGISTER");
        btn1REGISTER.setBorder(null);
        btn1REGISTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1REGISTERActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(153, 255, 255));
        jComboBox1.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Lecturer", "Students" }));
        jComboBox1.setBorder(null);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tf1REGISTER.setBackground(new java.awt.Color(153, 255, 255));
        tf1REGISTER.setForeground(new java.awt.Color(0, 0, 0));
        tf1REGISTER.setBorder(null);
        tf1REGISTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1REGISTERActionPerformed(evt);
            }
        });

        tf2REGISTER.setBackground(new java.awt.Color(153, 255, 255));
        tf2REGISTER.setForeground(new java.awt.Color(0, 0, 0));
        tf2REGISTER.setBorder(null);
        tf2REGISTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2REGISTERActionPerformed(evt);
            }
        });

        lb2Login.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 1, 18)); // NOI18N
        lb2Login.setForeground(new java.awt.Color(0, 0, 0));
        lb2Login.setText("Username :");

        lb3Login.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 1, 18)); // NOI18N
        lb3Login.setForeground(new java.awt.Color(0, 0, 0));
        lb3Login.setText("Password :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb2Login)
                    .addComponent(lb3Login))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titleLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf1REGISTER)
                    .addComponent(tf2REGISTER, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1REGISTER, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(354, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(titleLogin)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf1REGISTER, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2Login))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf2REGISTER, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb3Login))
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btn1REGISTER, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1REGISTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1REGISTERActionPerformed
        String username  = tf1REGISTER.getText();
        String password = tf2REGISTER.getText();
        String identity = (String)jComboBox1.getSelectedItem();
        String filename = "C:\\Users\\deracho\\OneDrive\\Documents\\users.txt";
        if (!username.isEmpty() && !password.isEmpty())
        {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true)))
            {
                writer.write(username + "," + password + "," + identity);
                JOptionPane.showMessageDialog(this, "User added.");

            }
            catch (IOException e) 
            {
                System.err.println("Error appending to the file: " + e.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Error.");   
        }
    }//GEN-LAST:event_btn1REGISTERActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void tf1REGISTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1REGISTERActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_tf1REGISTERActionPerformed

    private void tf2REGISTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2REGISTERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2REGISTERActionPerformed

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
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1REGISTER;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lb2Login;
    private javax.swing.JLabel lb3Login;
    private javax.swing.JTextField tf1REGISTER;
    private javax.swing.JTextField tf2REGISTER;
    private javax.swing.JLabel titleLogin;
    // End of variables declaration//GEN-END:variables
}

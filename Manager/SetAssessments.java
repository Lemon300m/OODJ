
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
//import javax.swing.JTextField;
//import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PogOwl
 */
public class SetAssessments extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public SetAssessments() {
        initComponents();
        lblSelected.setVisible(false);
        lblChosen.setVisible(false);
        btnSelect.setVisible(false);
    }
    Functions fnc = new Functions();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnClose = new javax.swing.JButton();
        rbIntake = new javax.swing.JRadioButton();
        rbIndividual = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lblSelected = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtProjectName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        lblChosen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbIntake);
        rbIntake.setText("Intake");
        rbIntake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIntakeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbIndividual);
        rbIndividual.setText("Individual");
        rbIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIndividualActionPerformed(evt);
            }
        });

        jLabel3.setText("Select Assessment Type:");

        lblSelected.setText("Selected Intake:");

        btnSelect.setText("Select Intake");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        jLabel1.setText("Set Project Name:");

        txtProjectName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProjectNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProjectNameFocusLost(evt);
            }
        });

        jLabel2.setText("Set Project Category:");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Internship", "Investigation", "Reports", "CP1",
            "CP2","RMCP","FYP"}));

lblChosen.setText("jLabel4");

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
        .addGap(42, 42, 42)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel2)
            .addComponent(jLabel1)
            .addComponent(jLabel3)
            .addComponent(lblSelected))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rbIntake)
                .addGap(18, 18, 18)
                .addComponent(rbIndividual))
            .addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblChosen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSelect)))
        .addContainerGap(102, Short.MAX_VALUE))
    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnClose)
        .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbIntake)
                .addComponent(rbIndividual)
                .addComponent(jLabel3))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblSelected)
                .addComponent(btnSelect)
                .addComponent(lblChosen))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
            .addComponent(btnClose)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
    public void addPlaceholderStyle(JTextField txtProjectName) {
        Font font = txtProjectName.getFont();
        font = font.deriveFont(Font.ITALIC);
        txtProjectName.setFont(font);
        txtProjectName.setForeground(Color.gray);
    }
    public void removePlaceholderStyle(JTextField txtProjectName) {
        Font font = txtProjectName.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        txtProjectName.setFont(font);
        txtProjectName.setForeground(Color.black);
    }
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ManagerOption().setVisible(true);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtProjectNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProjectNameFocusGained
        if (txtProjectName.getText().equals("Enter Project Name")) {
            txtProjectName.setText(null);
            txtProjectName.requestFocus();
            removePlaceholderStyle(txtProjectName);
        }
    }//GEN-LAST:event_txtProjectNameFocusGained

    private void txtProjectNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProjectNameFocusLost
        if (txtProjectName.getText().length() == 0) {
            addPlaceholderStyle(txtProjectName);
            txtProjectName.setText("Enter Project Name");
        }
    }//GEN-LAST:event_txtProjectNameFocusLost

    private void rbIntakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIntakeActionPerformed
        lblSelected.setText("Selected Intake:");
        lblSelected.setVisible(true);
        lblChosen.setText("Not selected");
        lblChosen.setVisible(true);
        btnSelect.setText("Select Intake");
        btnSelect.setVisible(true);
    }//GEN-LAST:event_rbIntakeActionPerformed

    private void rbIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIndividualActionPerformed
        lblSelected.setText("Selected Individual:");
        lblSelected.setVisible(true);
        lblChosen.setText("Not yet implemented");
        lblChosen.setVisible(true);
        btnSelect.setText("Select Individual");
        btnSelect.setVisible(true);
    }//GEN-LAST:event_rbIndividualActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        if(rbIntake.isSelected()){
            JFrame tableFrame = new JFrame("Choose an Intake");
            tableFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            DefaultTableModel tableModel = new DefaultTableModel();
            tableModel.addColumn("Intake Code");
            JTable table = new JTable(tableModel);
            try {
                String relativePath = "Intakes.txt"; // Replace with actual relative path if different
                String filePath = fnc.getFileLocation(relativePath);
                fnc.readTextFileToTable(filePath, table);
            } catch (IOException e) {
                e.printStackTrace();
            }
            table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
                @Override
                public void valueChanged(ListSelectionEvent event){
                    if(!event.getValueIsAdjusting()){
                        int selectedRow = table.getSelectedRow();
                        if(selectedRow != -1){
                            String selectedValue = table.getValueAt(selectedRow,0).toString();
                            lblChosen.setText(selectedValue);
                            tableFrame.dispose();
                        }
                    }
                }
            });
            JScrollPane scrollPane = new JScrollPane(table);
            tableFrame.add(scrollPane);
            tableFrame.setSize(300,200);
            tableFrame.setLocationRelativeTo(null);
            // Display the table window
            tableFrame.setVisible(true);
        }else if(rbIndividual.isSelected()){
            JOptionPane.showMessageDialog(this,"Individual");
        }
    }//GEN-LAST:event_btnSelectActionPerformed

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
            java.util.logging.Logger.getLogger(SetAssessments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetAssessments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetAssessments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetAssessments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetAssessments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSelect;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblChosen;
    private javax.swing.JLabel lblSelected;
    private javax.swing.JRadioButton rbIndividual;
    private javax.swing.JRadioButton rbIntake;
    private javax.swing.JTextField txtProjectName;
    // End of variables declaration//GEN-END:variables
}
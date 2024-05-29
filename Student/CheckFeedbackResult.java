/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class CheckFeedbackResult extends javax.swing.JFrame {
    String AssessmentFile = "AssessmentType.txt" ;
    FileUtil af = new FileUtil();
    File Afile = new File(af.getFileLocation(AssessmentFile));
    String RemarkFile = "Remark.txt";
    FileUtil rf = new FileUtil();
    File Rfile = new File(rf.getFileLocation(RemarkFile));
    StudentMain studentMain = new StudentMain();
    private String TpNumber;
    private String Intake;

    /**
     * Creates new form CheckFeedbackResult
     */
    public CheckFeedbackResult(String TpNumber,String Intake) {
        this.TpNumber = TpNumber;
        this.Intake = Intake;
        RemarkTable.setDefaultEditor(Object.class, null);
        initComponents();
        try {
            BufferedReader br = new BufferedReader(new FileReader(Afile));
            br.readLine();
            
            Object[] tableLines = br.lines().toArray();
            
            
            for(int i =0; i<tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow  = line.split("@");
                for (int j = 0; j < dataRow.length; j++) {
                   dataRow[j] = dataRow[j].trim();
            
                }
                if (dataRow[0].equals(TpNumber)){
                    AssessmentForFbResult.addItem(dataRow[2]);
                    
                } else if (dataRow[1].equals(Intake)){
                    AssessmentForFbResult.addItem(dataRow[2]);
                }
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Student_UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private CheckFeedbackResult() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AssessmentForFbResult = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        RemarkTable = new javax.swing.JTable();
        CheckResultBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Assessment Selected:");

        RemarkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {" ", null, null, null}
            },
            new String [] {
                "Name", "Feedback 1", "Feedback 2", "Result"
            }
        ));
        jScrollPane1.setViewportView(RemarkTable);

        CheckResultBtn.setText("Check Feedback and Result");
        CheckResultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckResultBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Check Feedback And Result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckResultBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AssessmentForFbResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackBtn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AssessmentForFbResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckResultBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(BackBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckResultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckResultBtnActionPerformed
        // TODO add your handling code here:
        boolean found = false;
        String selectedAssessment = (String) AssessmentForFbResult.getSelectedItem();
        List<String[]> lines = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel)RemarkTable.getModel();
        try (BufferedReader reader = new BufferedReader(new FileReader(Rfile))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line.split(" @ "));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Student_UI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Student_UI.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < lines.size(); i++) {
            String[] parts = lines.get(i);

            if (parts[0].equals(studentMain.getReportId(selectedAssessment,TpNumber))) {
                String[] row = {selectedAssessment,parts[1],parts[2],parts[5]};
                model.removeRow(0);
                model.addRow(row);
                found = true;
            }  
            }
        if(!found){
             JOptionPane.showMessageDialog(null, "The selected report has not been submitted.", "Error", JOptionPane.ERROR_MESSAGE);
             model.setValueAt("-",0,1);
             model.setValueAt("-",0,2);
             model.setValueAt("-",0,3);
             return;
            }
        for(int counter =0; counter<model.getRowCount(); counter++ ){
                    if (model.getValueAt(counter,1).equals("")){
                        model.setValueAt("Not given", counter, 1);
                    }
        }
        for(int counter =0; counter<model.getRowCount(); counter++ ){
                    if (model.getValueAt(counter,2).equals("")){
                        model.setValueAt("Not given", counter, 2);
                    }
        }
        for(int counter =0; counter<model.getRowCount(); counter++ ){
                    if (model.getValueAt(counter,3).equals("")){
                        model.setValueAt("Not given", counter, 3);
                    }
        }
    }//GEN-LAST:event_CheckResultBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        studentMain.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CheckFeedbackResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckFeedbackResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckFeedbackResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckFeedbackResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckFeedbackResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AssessmentForFbResult;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CheckResultBtn;
    private javax.swing.JTable RemarkTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

import java.io.IOException;
import javax.swing.*;
import java.util.Arrays;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
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
    private JTable table;
    private DefaultTableModel tableModel;
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnClose = new javax.swing.JButton();
        rbIntake = new javax.swing.JRadioButton();
        rbIndividual = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lblSelected = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        cbCat = new javax.swing.JComboBox<>();
        lblChosen = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        cbCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Internship", "Investigation Reports", "CP1",
            "CP2","RMCP","FYP"}));

lblChosen.setText("|");

btnCheck.setText("<html>Check given<br>Assessment<br>Types</html>");
btnCheck.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCheckActionPerformed(evt);
    }
    });

    jLabel1.setText("Set Category:");

    btnAdd.setText("Add Assessment Type");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAddActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(99, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(lblSelected)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1)))
                            .addGap(18, 18, 18))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbIntake)
                                .addGap(18, 18, 18)
                                .addComponent(rbIndividual))
                            .addComponent(cbCat, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblChosen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSelect)))
                        .addComponent(btnAdd))
                    .addGap(88, 88, 88))
                .addGroup(layout.createSequentialGroup()
                    .addGap(57, 467, Short.MAX_VALUE)
                    .addComponent(btnClose)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(62, 62, 62)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbIntake)
                        .addComponent(rbIndividual)
                        .addComponent(jLabel3))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSelected)
                        .addComponent(btnSelect)
                        .addComponent(lblChosen))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(26, 26, 26)
                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btnAdd))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
            .addComponent(btnClose)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>                        

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.setVisible(false);
        new ManagerOption().setVisible(true);
    }                                        

    private void rbIntakeActionPerformed(java.awt.event.ActionEvent evt) {                                         
        lblSelected.setText("Selected Intake:");
        lblSelected.setVisible(true);
        lblChosen.setText("Not selected");
        lblChosen.setVisible(true);
        btnSelect.setText("Select Intake");
        btnSelect.setVisible(true);
    }                                        

    private void rbIndividualActionPerformed(java.awt.event.ActionEvent evt) {                                             
        lblSelected.setText("Selected Individual:");
        lblSelected.setVisible(true);
        lblChosen.setText("Not selected");
        lblChosen.setVisible(true);
        btnSelect.setText("Select Individual");
        btnSelect.setVisible(true);
    }                                            

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(rbIntake.isSelected()){
            JFrame tableFrame = new JFrame("Choose an Intake");
            tableFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            table = new JTable();
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
            JFrame tableFrame = new JFrame("Choose an individual");
            tableFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            tableModel = new DefaultTableModel();
            tableModel.addColumn("TPNumber");
            tableModel.addColumn("Name");
            table = new JTable(tableModel);
            try {
                String relativePath = "users.txt"; // Replace with actual relative path if different
                String filePath = fnc.getFileLocation(relativePath);
                //Specialized file readings
                try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
                    String line;
                    while ((line = br.readLine()) != null){
                        String[] parts = line.split(" @ ");
                        if(parts.length>= 4 && "Student".equals(parts[3])){
                            String tpNumber = parts[0];
                            String name = parts[1];
                            tableModel.addRow(new Object[]{tpNumber,name});
                        }
                    }
                }
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
        }
    }                                         

    public void call(boolean tf){
        JFrame tableFrame = new JFrame("Given Assessment Types");
        tableFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tableModel = new DefaultTableModel();
        if(rbIntake.isSelected()){
            tableModel.addColumn("Intake Code");
            tableModel.addColumn("Assessment Types");
            table = new JTable(tableModel);
            try {
                String relativePath = "AssessmentType.txt"; // Replace with actual relative path if different
                String filePath = fnc.getFileLocation(relativePath);
                //Specialized file readings
                try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
                    String line;
                    br.readLine(); //this is used to skip the header
                    while ((line = br.readLine()) != null){
                        String[] parts = line.split(" @ ");
                        if(parts.length >= 3 && lblChosen.getText().equals(parts[1])){
                            String IntakeCode = parts[1];
                            String AssessmentType = parts[2];
                            tableModel.addRow(new Object[]{IntakeCode,AssessmentType});
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            JScrollPane scrollPane = new JScrollPane(table);
            tableFrame.add(scrollPane);
            tableFrame.setSize(300,200);
            tableFrame.setLocationRelativeTo(null);
            // Display the table window
            tableFrame.setVisible(tf);
        }else if(rbIndividual.isSelected()){
            tableModel.addColumn("StudentID");
            tableModel.addColumn("Student Name");
            tableModel.addColumn("Assessment Types");
            table = new JTable(tableModel);
            String name = null;
            String intakeCode = null;
            try{
                String relativePath = "Student.txt";
                String filePath = fnc.getFileLocation(relativePath);
                try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
                    String line;
                    while ((line = br.readLine()) != null){
                        String[] parts = line.split(" @ ");
                        if(parts.length >= 3 && lblChosen.getText().equals(parts[0])){
                            name = parts[1];
                            intakeCode = parts[2];
                        }
                    }
                }
                relativePath = "AssessmentType.txt";
                filePath = fnc.getFileLocation(relativePath);
                try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
                    String line;
                    while ((line = br.readLine()) != null){
                        String[] parts = line.split(" @ ");
                        if(parts.length >= 3 && intakeCode.equals(parts[1])){
                            tableModel.addRow(new Object[]{lblChosen.getText(),name,parts[2]});
                        }else if(parts.length >= 3 && lblChosen.getText().equals(parts[0])){
                            tableModel.addRow(new Object[]{lblChosen.getText(),name,parts[2]});
                        }
                    }
                }
                
            }catch (IOException e){
                e.printStackTrace();
            }
            JScrollPane scrollPane = new JScrollPane(table);
            tableFrame.add(scrollPane);
            tableFrame.setSize(300,200);
            tableFrame.setLocationRelativeTo(null);
            // Display the table window
            tableFrame.setVisible(tf);
        }
    }
    public static void deleteLineFromFile(String filePath, String lineToDelete) {
        // List to hold file lines
        List<String> lines = new ArrayList<>();

        // Read all lines from the file
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Add lines to list except the one to be deleted
                if (!line.trim().equals(lineToDelete.trim())) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write the lines back to the file
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if((!rbIntake.isSelected() && !rbIndividual.isSelected()) || lblChosen.getText().equals("Not selected")){
            JOptionPane.showMessageDialog(this, "No ID selected.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        call(true);
    }                                        

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if((!rbIntake.isSelected() && !rbIndividual.isSelected()) || lblChosen.getText().equals("Not selected")){
            JOptionPane.showMessageDialog(this,"No ID selected","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        String relativePath = "AssessmentType.txt"; // Replace with actual relative path if different
        String filePath = fnc.getFileLocation(relativePath);
        call(false);
        int rowCount = table.getRowCount();
        Object[] data = new Object[rowCount];
        if (rbIntake.isSelected()){
            for(int i = 0; i < rowCount; i++){
                data[i] = table.getValueAt(i,1);
            }
            
            List<Object> list =  Arrays.asList(data);
            if(list.contains(cbCat.getSelectedItem())){
                JOptionPane.showMessageDialog(this,"Assessment Type had already been registered for this Intake.");
            }else{
                String newLine = " @ " + lblChosen.getText() + " @ " + cbCat.getSelectedItem();
                fnc.simpleAddLine(filePath, newLine);
                System.out.println("Written Successfully.");
            }
        }else if(rbIndividual.isSelected()){
            for(int i = 0; i <rowCount; i++){
                data[i] = table.getValueAt(i,2);
            }
            Arrays.sort(data);
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i].equals(data[i + 1])) {
                    String linetoDelete = lblChosen.getText() + " @   @ " + data[i];
                    deleteLineFromFile(filePath, linetoDelete);
                    System.out.println("Deleted duplicate");
                }
            }
            List<Object> list =  Arrays.asList(data);
            if(list.contains(cbCat.getSelectedItem())){
                JOptionPane.showMessageDialog(this,"Assessment Type had already been registered for this student.");
            }else{
                String newLine = lblChosen.getText() + " @   @ " + cbCat.getSelectedItem();
                fnc.simpleAddLine(filePath, newLine);
                System.out.println("Written Successfully.");
            }
        }
        
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

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSelect;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbCat;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblChosen;
    private javax.swing.JLabel lblSelected;
    private javax.swing.JRadioButton rbIndividual;
    private javax.swing.JRadioButton rbIntake;
    // End of variables declaration                   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import com.mycompany.assignment.ReadFile;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author deracho
 */
public class PROFILE_EDITS extends javax.swing.JFrame {

    /**
     * Creates new form PROFILE_EDITS
     */
    public PROFILE_EDITS() {
        initComponents();
        table_load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PASSWORD");

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("ADD");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("DELETE");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton46.setBackground(new java.awt.Color(204, 255, 255));
        jButton46.setForeground(new java.awt.Color(0, 0, 0));
        jButton46.setText("SHOW DETAILS");
        jButton46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ROLE");

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("CONFIRM CHANGE");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Project Manager", "Lecturer" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 255, 255));
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("<-----Back");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            addLineToFile();
        } catch (IOException ex) {
            Logger.getLogger(PROFILE_EDITS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        deleteSelectedRow();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        setSelectedRowContentToTextField();
        
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String relativePath = "users.txt";
        String filePath = System.getProperty("user.dir") + File.separator + relativePath;
        
        
        int fileLine = jTable1.getSelectedRow() + 2; 
        
        String updatedUsername = jTextField1.getText();
        String updatedPassword = jTextField2.getText();
        String updatedRole = jComboBox2.getSelectedItem().toString();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            model.setValueAt(updatedUsername, selectedRow, 1);
            model.setValueAt(updatedPassword, selectedRow, 2);
            model.setValueAt(updatedRole, selectedRow, 3);
        }
        String TPnumber = (String) model.getValueAt(selectedRow, 0);
        String updatedLine = TPnumber + " / " + updatedUsername + " / " + updatedPassword + " / " + updatedRole;
        
        try {
            updateLine(TPnumber,updatedLine);
            fnc.modifySpecificLine(filePath, fileLine, updatedLine);
            
        } catch (IOException ex) {
            Logger.getLogger(PROFILE_EDITS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        
        
        this.dispose();
        
    }//GEN-LAST:event_jButton6ActionPerformed
    
    
    Functions fnc = new Functions();
    
    private void writeToFile(List<String[]> lines, String filePath) {
    try (PrintWriter writer = new PrintWriter(filePath)) {
        for (String[] parts : lines) {
            String line = String.join(" @ ", parts);
            writer.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    
    private void updateLine(String TPnumber, String updatedLine) throws IOException {
        List<String[]> lines = new ArrayList<>();
        try 
        {
            lines = ReadFile.readFile();
        } catch (IOException e) {
        }

        boolean found = false;
        String[] updatedParts = null;
        
        for (int i = 1; i < lines.size(); i++) {
            String[] parts = lines.get(i);
            System.out.println("TPnumber: " + TPnumber);
            System.out.println("Line from file: " + parts[0]);
            if (parts[0].startsWith(TPnumber + " / ")) {
                updatedParts = updatedLine.split(" / ");
                lines.set(i, updatedParts);
                found = true;
                break;
            }
        }
        

    
    }
    
    
    
    private void table_load()
    {
        try{
        String relativePath = "users.txt"; // Replace with actual relative path if different
        String filePath = fnc.getFileLocation(relativePath);
        
        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String firstLine = br.readLine().trim();
        String[] columnsName = firstLine.split(",");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setColumnIdentifiers(columnsName);
        
         model.setRowCount(0);
    
        Object[] tableLines = br.lines().toArray();
        
        for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("@");
                model.addRow(dataRow);
            }
        
        
        }
        catch (IOException ex) {
            
        }
        
    }
    
    
    public boolean isUsernameExists(String usernameToCheck) 
    {
        try 
        {
            String filePath = "C:\\Users\\deracho\\OneDrive\\Documents\\NetBeansProjects\\Assignment\\users.txt";
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) 
            {
                String[] parts = line.split("@");
                if (parts.length >=2)
                {
                    String existingUsername = parts[1].trim(); // Assuming username is in the second column
                    if (existingUsername.equals(usernameToCheck)) {
                        br.close();
                        return true; // Username exists
                    }
                }
            }
            br.close();
        } 
            catch (IOException e) 
        {
        // Handle exception
        }
        return false; // Username does not exist
    }
    
    
    
    
    public void addLineToFile() throws IOException 
    {
        
        String name = jTextField1.getText();
        String password = jTextField2.getText();
        String role = (String) jComboBox2.getSelectedItem();
        String usernameToCheck = jTextField1.getText();

        String filePath = "C:\\Users\\deracho\\OneDrive\\Documents\\NetBeansProjects\\Assignment\\users.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String lastTP = "";
        String line;

        while ((line = br.readLine()) != null) 
        {
            String[] parts = line.split("@");
            lastTP = parts[0].trim(); 
        }
        br.close();


        String nextTpNumber = "";
        if (!lastTP.isEmpty()) {
            int lastNumber = Integer.parseInt(lastTP.substring(2)); 
            nextTpNumber = "TP" + String.format("%04d", lastNumber + 1); 
        } 
        else 
        {
            nextTpNumber = "TP0001"; 
        }


        boolean isExist = isUsernameExists(usernameToCheck);
        if (isExist != false)
        {
            JOptionPane.showMessageDialog(this, "This Username already exist");
        }
        else
        {
            try {

                FileWriter fw = new FileWriter(filePath, true); 
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write(nextTpNumber + " @ " + name + " @ " + password + " @ " + role);
                bw.newLine(); 
                bw.close();
                fw.close();

                table_load();
                
                
                
                if ("Student".equals(role)) 
                {
                    updateStudentFile(nextTpNumber, name, ""); // Pass an empty string for Intake initially
                }
            } 
            catch (IOException ex) 
            {
                // Handle exception
            }

        }

    }
    
    private void updateStudentFile(String tpNumber, String name, String intake) throws IOException
    {
        String studentFilePath = "C:\\Users\\deracho\\OneDrive\\Documents\\NetBeansProjects\\Assignment\\Student.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(studentFilePath, true))) {
            bw.write(tpNumber + " @ " + name + " @ " + intake);
            bw.newLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    
        
    }
    
    
    public void deleteSelectedRow() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        boolean deletionSuccessful = false; // Declare and initialize deletionSuccessful


        if (selectedRow != -1)
        {
            String userNameToDelete  = (String) model.getValueAt(selectedRow, 0);
            System.out.println(userNameToDelete);

            // Assuming TP number is in the first column
             // Remove row from the table
            try {
                Path filePath = Paths.get("C:\\Users\\deracho\\OneDrive\\Documents\\NetBeansProjects\\Assignment\\users.txt");
                List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
                
                List<String> updatedLines = new ArrayList<>();
                for (String line : lines) {
                    if (!line.startsWith(userNameToDelete)) {
                    updatedLines.add(line);
                    }                
                }
                
                System.out.println("Lines to be written back to the file:");
                for (String line : updatedLines) {
                    System.out.println(line);
                }
                
                Files.write(filePath, updatedLines, StandardCharsets.UTF_8, StandardOpenOption.TRUNCATE_EXISTING);
                deletionSuccessful = true;
                
               
            }catch (IOException ex){
                System.err.println("An error occurred: " + ex.getMessage());
            }
                
           
        }
        if (deletionSuccessful)
        { // Check if deletion from file was successful
            model.removeRow(selectedRow); // Remove row from table model
            model.fireTableDataChanged(); // Refresh table data (optional)
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
        }
         
    }
    
    
    
    public void setSelectedRowContentToTextField() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int selectedRow = jTable1.getSelectedRow();

    if (selectedRow != -1) {
        String username = (String) model.getValueAt(selectedRow, 1);
        String password = (String) model.getValueAt(selectedRow, 2);
        String role = (String) model.getValueAt(selectedRow, 3);

        // Assuming jTextField1, jTextField2, and jTextField3 are the text fields for username, password, and role respectively
        jTextField1.setText(username);
        jTextField2.setText(password);
        jComboBox2.setSelectedItem(role);
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
        java.util.logging.Logger.getLogger(PROFILE_EDITS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(PROFILE_EDITS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(PROFILE_EDITS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(PROFILE_EDITS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> {
        new PROFILE_EDITS().setVisible(true);
    });


   
}
    
    
   

         
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;



public class Login extends javax.swing.JFrame {

    
    public Login() {
        
        initComponents();
        
    }
    
    public static List<String[]> userList = new ArrayList<>();
    
     
    
    
    public static void main(String args[]) throws Exception {
    java.awt.EventQueue.invokeLater(() -> {
        new Login().setVisible(true);
    });
    
    String relativePath = "users.txt";
    String filePath = System.getProperty("user.dir") + File.separator + relativePath;
    
    
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
    {
        br.readLine();
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(" / ");
            userList.add(parts.clone());
        }
    }
    }       
     
     
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        titleLogin = new javax.swing.JLabel();
        lb3Login = new javax.swing.JLabel();
        lb2Login = new javax.swing.JLabel();
        NameLogin = new javax.swing.JTextField();
        PasswordLogin = new javax.swing.JTextField();
        btn1Login = new javax.swing.JButton();
        btn2Login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setToolTipText("");

        titleLogin.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 1, 24)); // NOI18N
        titleLogin.setForeground(new java.awt.Color(0, 0, 0));
        titleLogin.setText("LOGIN");

        lb3Login.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 1, 18)); // NOI18N
        lb3Login.setForeground(new java.awt.Color(0, 0, 0));
        lb3Login.setText("Password :");

        lb2Login.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 1, 18)); // NOI18N
        lb2Login.setForeground(new java.awt.Color(0, 0, 0));
        lb2Login.setText("Username :");

        NameLogin.setBackground(new java.awt.Color(153, 255, 255));
        NameLogin.setForeground(new java.awt.Color(0, 0, 0));
        NameLogin.setBorder(new javax.swing.border.MatteBorder(null));
        NameLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameLoginActionPerformed(evt);
            }
        });

        PasswordLogin.setBackground(new java.awt.Color(153, 255, 255));
        PasswordLogin.setForeground(new java.awt.Color(0, 0, 0));
        PasswordLogin.setBorder(new javax.swing.border.MatteBorder(null));
        PasswordLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordLoginActionPerformed(evt);
            }
        });

        btn1Login.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 12)); // NOI18N
        btn1Login.setForeground(new java.awt.Color(204, 204, 0));
        btn1Login.setText("Log In");
        btn1Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1LoginActionPerformed(evt);
            }
        });

        btn2Login.setFont(new java.awt.Font("UD Digi Kyokasho NK-R", 0, 12)); // NOI18N
        btn2Login.setForeground(new java.awt.Color(255, 51, 0));
        btn2Login.setText("Clear");
        btn2Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn1Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn2Login, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(titleLogin))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb2Login)
                            .addComponent(lb3Login))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(titleLogin)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2Login))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb3Login)
                    .addComponent(PasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn1Login)
                .addGap(18, 18, 18)
                .addComponent(btn2Login)
                .addContainerGap(115, Short.MAX_VALUE))
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
    
                                             
    
   
    private static boolean authenticate(String username,String password) {
        
        boolean authenticated = false;
        for (String[] user : userList) 
        {
            if (user[1].equals(username) && user[2].equals(password)) 
            {
                authenticated = true;   
                break;
            }
        }

        return authenticated;
    }
    
    private String checkIdentity(String username)
    {
	String role = null;
	for (String[] user : userList)
	{
            if(user[1].equals(username))
            {
                role = user[3];
                switch (role)
                {
                    case "Admin":
                        Admin adminForm = new Admin();
                        adminForm.setVisible(true);
                        this.dispose();
                        break;
                }
                
            }
	}
        return role;
    }
    
    
           
    
    private void btn2LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2LoginActionPerformed
        NameLogin.setText("");
        PasswordLogin.setText("");
    }//GEN-LAST:event_btn2LoginActionPerformed
    
    private void NameLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameLoginActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_NameLoginActionPerformed

    private void btn1LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1LoginActionPerformed
        String password = PasswordLogin.getText();
        String username = NameLogin.getText();
        
        boolean loginStatus = authenticate(username, password);
        if (loginStatus)
        {
           System.out.println("Login successful");
           checkIdentity(username);
        }
        else
        {
            System.out.println("Login failed");
        }
        
        
    }//GEN-LAST:event_btn1LoginActionPerformed

    private void PasswordLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordLoginActionPerformed
        // TODO add your handling code here:
       

    }//GEN-LAST:event_PasswordLoginActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField NameLogin;
    public static javax.swing.JTextField PasswordLogin;
    private javax.swing.JButton btn1Login;
    private javax.swing.JButton btn2Login;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb2Login;
    private javax.swing.JLabel lb3Login;
    private javax.swing.JLabel titleLogin;
    // End of variables declaration//GEN-END:variables
}



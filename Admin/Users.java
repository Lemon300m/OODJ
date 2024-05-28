import com.mycompany.assignment.ReadFile;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author deracho
 */
public class Users {
    private String Tpnumber;
    private String username;
    private String Password;
    private String role;
    private boolean authenticated;
    public static List<String[]> userList = new ArrayList<>();
    static {
        try {
            userList = ReadFile.readFile();
        } catch (IOException e) {
            // Properly handle the exception
        }
    }
    
    
    public Users(String Tpnumber, String username, String Password, String role) {
        this.username= username;
        this.Tpnumber = Tpnumber;
        this.role = role;
        this.Password = Password;
        
    }

   
    
    private static class ReadFile
    {
        public static List<String[]> readFile() throws IOException {
            List<String[]> userList = new ArrayList<>();
            String users = "C:\\Users\\deracho\\OneDrive\\Documents\\test1.txt";
            File file = new File(users);
            try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
                String line;
                while ((line = raf.readLine()) != null) {
                    String[] parts = line.split(",");
                    userList.add(parts);
                }
            }
            return userList;
        }
    }
    
    
    private String checkIdentity(String username)
    {
	String role = null;
	for (String[] user : userList)
	{
            if(user[0].equals(username))
            {
                role = user[2];
                switch (role)
                {
                    case "Admin":
                        Admin adminForm = new Admin();
                        adminForm.setVisible(true);
                        break;
                }
                
            }
	}
        return role;
    }
     
     
    public void login() {
        
        boolean authenticated = false;
        for (String[] user : userList) 
        {
            if (user[0].equals(username) && user[1].equals(Password)) 
            {
                authenticated = true;   
                break;
            }
        }
        
        
        
        
        if (authenticated)
        {
           System.out.println("Login successful");
           checkIdentity(username);
        }
        else
        {
            System.out.println("Login failed");
        }

        
    }
    
    
    public boolean isAuthenticated() {
        return authenticated;
    }

    // Getters and setters
    public String getTpnumber() {
        return Tpnumber;
    }

    public void setTpnumber(String Tpnumber) {
        this.Tpnumber = Tpnumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
     
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.IOException;







/**
 *
 * @author deracho
 */
public class ReadFile {

    public static List<String[]> readFile() throws IOException {
        List<String[]> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\deracho\\Downloads\\users.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" @ "); // Split using slashes ("/")
                lines.add(parts);
            }
        }
        return lines;
    }
}
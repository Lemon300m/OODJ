/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecturer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author shong
 */
public class PreprocessReport {
     public static void preprocessReportFile(String inputFilePath, String outputFilePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" @ ", -1); // Split with -1 to include empty fields
                for (int i = 0; i < data.length; i++) {
                    if (data[i].trim().isEmpty()) {
                        data[i] = "-";
                    }
                }
                writer.write(String.join(" @ ", data));
                writer.newLine();
            }
        }
    }
}


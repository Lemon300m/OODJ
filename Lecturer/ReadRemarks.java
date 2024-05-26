/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecturer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author shong
 */
public class ReadRemarks {
    
    public void writeFilteredData(String reportFilePath, String presentationRequestFilePath, String tpNumber, JTable table) throws IOException {
    try (BufferedReader reportReader = new BufferedReader(new FileReader(reportFilePath));
         BufferedReader presentationReader = new BufferedReader(new FileReader(presentationRequestFilePath));
         BufferedWriter writer = new BufferedWriter(new FileWriter("Filtered_Presentation_Request.txt"))) {

        Set<String> matchingReportIDs = new HashSet<>();

        // Read ReportTxt to extract SupervisorID associated with each TPnumber
        String reportLine;
        while ((reportLine = reportReader.readLine()) != null) {
            String[] reportData = reportLine.split(" @ ");
            if (reportData.length >= 7 && (reportData[5].trim().equals(tpNumber) || reportData[6].trim().equals(tpNumber))) {
                matchingReportIDs.add(reportData[0]); // Save the ReportID
            }
        }

        // Read the first line of PresentationRequestTxt to set table column headers
        String firstLine = presentationReader.readLine();
        if (firstLine != null) {
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setColumnIdentifiers(columnsName);
        }

        // Match ReportID against the stored ReportIDs and write matching rows to the new file
         String presentationLine;
        while ((presentationLine = presentationReader.readLine()) != null) {
            String[] requestData = presentationLine.split(" @ ");
            if (requestData.length >= 3 && matchingReportIDs.contains(requestData[0])) {
                // Fill empty Result1, Result2, Result fields with 0
                for (int i = 3; i <= 5; i++) {
                    if (requestData[i].trim().isEmpty()) {
                        requestData[i] = "0";
                    }
                }
                // Write the modified line to the new file
                writer.write(String.join(" @ ", requestData));
                writer.newLine();
                // Add entire row to the table
                ((DefaultTableModel) table.getModel()).addRow(requestData);
            }
        }
    }
}
    
    
     //Please dont ask me how this work, it just works
    //Please dont ask me how this work, it just works
    //Please dont ask me how this work, it just works
    public static void modifySpecificLine(String filePath, int lineNumber, String newData) throws IOException{
        File file = new File(filePath);
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")){
            long startPosition = findLineStart(raf, lineNumber);
            long endPosition = findLineEnd(raf, lineNumber);
            raf.seek(endPosition);
            byte[] remainingFile = new byte[(int) (raf.length() - endPosition)];
            raf.readFully(remainingFile);
            
            raf.seek(startPosition);
            raf.writeBytes(newData);
            
            raf.writeBytes(System.lineSeparator());
            raf.write(remainingFile);
            
            raf.setLength(startPosition + newData.length() + System.lineSeparator().length()+ remainingFile.length);
            
        }
    }
    private static long findLineStart(RandomAccessFile raf, int lineNumber) throws IOException{
        raf.seek(0);
        int linesCounted = 0;
        long position = 0;
        while (linesCounted < lineNumber - 1) {
            String line = raf.readLine();
            if (line == null) {
                return -1; // line number out of range
            }
            linesCounted++;
            position = raf.getFilePointer();
        }

        return position;
    }
    private static long findLineEnd(RandomAccessFile raf, int lineNumber) throws IOException {
        long startPosition = findLineStart(raf, lineNumber);
        if (startPosition == -1) {
            return -1; // line number out of range
        }

        raf.seek(startPosition);
        raf.readLine(); // read the line to find the end position
        return raf.getFilePointer();
    }
    //END OF PAIN
    //END OF PAIN
    //END OF PAIN
    public static String getFileLocation(String filename){
        return System.getProperty("user.dir") + File.separator + filename;
    }
} 


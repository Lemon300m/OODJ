
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PogOwl
 */
public class Functions {
    public void readTextFileToTable(String filePath, JTable table) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String firstLine = br.readLine().trim();
        String line;
        String[] columnsName = firstLine.split(",");
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setColumnIdentifiers(columnsName);
        while((line = br.readLine())!= null){
            String[] data = line.split(" @ ");
            model.addRow(data);
        }
        br.close();
    }
    public String[] readSingleLine(String filename, String searchID){
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
              String line = scanner.nextLine();
              if (line.contains(searchID)) {
                scanner.close();
                return line.split(" @ ", -1);
              }
            }
            scanner.close();
            return null; 
          } catch (FileNotFoundException e) {
            System.err.println("Error: File not found: " + filename);
          } catch (Exception e) {
            System.err.println("Error: Error reading file: " + filename);
      }
      return null;
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
    public void simpleAddLine(String filePath, String line) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getFileLocation(String filename){
        return System.getProperty("user.dir") + File.separator + filename;
    }
    public static class UneditableTableModel extends DefaultTableModel {
        public UneditableTableModel(Object[] columnNames, int rowCount) {
            super(columnNames, rowCount);
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            // All cells are uneditable
            return false;
        }
    }
}

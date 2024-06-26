


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PogOwl
 */
public class Functions  {
    public void readTextFileToTable(String filePath, JTable table) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        reader.readLine(); //This is used to skip the header of the text file
        while((line = reader.readLine())!= null){
            String[] data = line.split(" / ");
            model.addRow(data);
        }
        reader.close();
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

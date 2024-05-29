/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

import java.io.File;

/**
 *
 * @author user
 */
public class FileUtil {
    public String getFileLocation(String relativePath) {
        // Your logic to convert relative path to absolute path
        File file = new File(relativePath);
        return file.getAbsolutePath();
    }
    
    
}

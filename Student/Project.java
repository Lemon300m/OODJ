/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Project {
     private String ReportID;
     private String Date;
     private String AssessmentType;
     private String StudentID;
     private String Status;
     private String SupervisorID;
     private String SecondMarkerID;
     String filePath = "C:\\Users\\user\\Desktop\\JAVA Assignment\\Report.txt" ;
     File file =new File(filePath);
    
    public Project(String ReportID, String Date, String AssessmentType, String StudentID, String Status,String SupervisorID,String SecondMarkerID){
        this.ReportID = ReportID;
        this.Date = Date;
        this.AssessmentType = AssessmentType;
        this.Status = Status;
        this.SupervisorID = SupervisorID;
        this.SecondMarkerID = SecondMarkerID;
    }
    
    public String getReportID(){
        return ReportID;
    }
    
    public String getDate(){
        return Date;
    }
    public String getAssessmentTyoe(){
        return AssessmentType;
    }
    
    public String getStatus(){
        return Status;
    }
    
    public String getSupervisorID(){
        return SupervisorID;
    }
    
    public String getSecondMarkerID(){
        return SecondMarkerID;
    }
    
    public void setReportID(String ReportID){
        this.ReportID =ReportID;
    }
    
    public void setDate(String Date){
        this.Date =Date;
    }
    public void setAssessmentType(String AssessmentType){
        this.AssessmentType =AssessmentType;
    }
    
    @Override
    public String toString() {
        return ReportID+Date+AssessmentType+Status+SupervisorID+SecondMarkerID;
    }
}

        
        
    


    
    


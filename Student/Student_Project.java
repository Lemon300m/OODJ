/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student;

/**
 *
 * @author user
 */
public class Student_Project extends Project {
    private String Submission_Link;
    
    public Student_Project(String ReportID, String Date, String AssessmentType, String StudentID, String Status,String SupervisorID,String SecondMarkerID,String Submission_Link){
        super(ReportID,Date,AssessmentType,StudentID,Status,SupervisorID,SecondMarkerID);
        this.Submission_Link = Submission_Link;
        
    }
    
    /*@Override
     public String getPN(){
       return super.getPN();
    }
     
    @Override
     public String getPT(){
       return super.getPT();
    }
     
    @Override
    public String getPD(){
       return super.getPD();
    }
    
    @Override
    public String getDL(){
        return super.getDL();
    }
    
    @Override
    public String getSI(){
        return super.getSI();
    }*/
    
    @Override
    public String getStatus(){
        return super.getStatus();
    }
    
    public String getSubmissionLink(){
        return Submission_Link;
    }
    
    
    
    public void setSubmissionLink(String Submission_Link){
        this.Submission_Link =Submission_Link;
    }
    
    
 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author user
 */
public class Student {
    private String TpNumber;
    private String Name;
    private String Intake;
    
    
    public String getTpNumber(){
        return TpNumber;
    }
    
    public String getIntake(){
        return Intake;
    }
    
    public void setTpNumber (String TpNumber){
        this.TpNumber = TpNumber;
    }
    
    public void setIntake(String Intake){
        this.Intake = Intake;
    }
    
    public Student (String TpNumber,String Name, String Intake){
        this.TpNumber = TpNumber;
        this.Name = Name;
        this.Intake = Intake;
    }
}

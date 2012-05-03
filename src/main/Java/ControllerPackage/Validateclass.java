/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerPackage;

import Student.StudentDetails;

/**
 *
 * @author Vanaja
 */
public class Validateclass {
    
    public boolean checkFields(String subject, String marks)
    {
        if("".equals(subject.trim()) || subject==null || "".equals(marks.trim()) || marks==null )
            return false;
        return true;
    }
    
    public boolean checkMarks(int marks)
    {
        if( marks > 100 || marks < 0 )
            return false;
        return true;
    }
    
    public boolean is_int(String marks)
    {
        for (int i = 0 ; i < marks.length() ; i++) { 
              if((marks.charAt(i) < 48 ) || (marks.charAt(i) > 57)) 
                     return false ;
               } 
               return true;
    }
           
    public StudentDetails setDetails( String studentName,String grade,String subject,int marks)
    {
        StudentDetails sd=new StudentDetails();
        sd.setStudentName(studentName);
        sd.setSubject(subject);
        sd.setGrade(grade);
        sd.setMarks(marks);
        return sd;
    }
}

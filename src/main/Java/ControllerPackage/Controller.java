/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerPackage;

import Student.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vanaja
 */
@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String studentName;
        String grade;
        String subject;
        String marks;
        
        studentName=request.getParameter("studentName");
        grade=request.getParameter("grade");
        subject=request.getParameter("subject");
        marks=request.getParameter("marks");
        
        Validateclass v=new Validateclass();
        
        boolean result1=v.checkFields(subject,marks);   
         
        if(result1){
            
            boolean result2=v.is_int(marks);
            if(result2){
                
                int marks1=Integer.parseInt(marks);
                boolean result3=v.checkMarks(marks1);
                if(result3){
                    
                    StudentDetails sd=v.setDetails(studentName,grade,subject,marks1);
                    request.setAttribute("Student",sd);
                    RequestDispatcher dispatcher = request.getRequestDispatcher("response.jsp");
                    dispatcher.forward(request,response); 
                    
                    if( marks1 > 80)
                            System.out.println("Very wel done "+studentName);
                }
                else
                    response.sendRedirect("error2.jsp");
                
            }
            else
               response.sendRedirect("error3.jsp"); 
            
        }
        else
            response.sendRedirect("error.jsp");
        
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import DA.ServiceDA;
import domain.Service;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.Part;
import java.time.LocalDateTime;

/**
 *
 * @author tanya
 */
@MultipartConfig
public class addServiceServlet extends HttpServlet {

    private ServiceDA serviceda;
    
    public void init() throws ServletException{
        serviceda = new ServiceDA();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String serviceName=request.getParameter("serviceName");
        String serviceDesc=request.getParameter("serviceDesc");
        String serviceIncluded=request.getParameter("serviceIncluded");
        String serviceDetails=request.getParameter("serviceDetails");
        String prepTime = request.getParameter("servicePrepTime1");
        float servicePrice = Float.parseFloat(request.getParameter("serviceCost"));
        
        System.out.println(serviceName);
        Service service = new Service(serviceName,serviceDesc,serviceIncluded,serviceDetails,prepTime,LocalDateTime.now(),servicePrice);
        
        int check = serviceda.createRecord(service);
        
        if(check>0){
            out.println("added successfully");
        }
        else{
            out.println("faile");
        }
        
//Part part = request.getPart("img");
        //String filename = part.getSubmittedFileName();
        //out.println(filename);
        

        
        try{
            //Service service = new Service(serviceName, serviceDesc,serviceIncluded,serviceDetails, servicePrepTime, LocalDateTime.now(),servicePrice);
        }catch(Exception ex){
            
        }
        
    }



}

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
import java.time.LocalDateTime;

/**
 *
 * @author tanya
 */
public class updateServiceServlet extends HttpServlet {
    
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
        
        Service service = new Service(serviceName,serviceDesc,serviceIncluded,serviceDetails,prepTime,LocalDateTime.now(),servicePrice);

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

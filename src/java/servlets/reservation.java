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
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


import DA.ReserveDA;
import DA.CustDA;
import domain.Reservation;
import domain.Customer;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpSession;
/**
 *
 * @author tanya
 */
@WebServlet(name = "reservation", urlPatterns = {"/reservation"})
public class reservation extends HttpServlet {

    private ReserveDA reserve;
    private CustDA cust;
    
    public void init() throws ServletException{
        reserve = new ReserveDA();
        cust = new CustDA();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.sendRedirect("reserveJSP");
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
                
        HttpSession session = request.getSession();
        String serviceID = (String)session.getAttribute("serviceID");
        
        out.println(serviceID);
        
        String id="";
        
        String address1=request.getParameter("address1");
        String address2=request.getParameter("address2");
        String address3=request.getParameter("address3");
        String dateTime=request.getParameter("datetime");
        
        try{
            Customer c = cust.retrieveRecord("CT22-0001-4323");
            
            id=Reservation.generateID(c);
            
            out.print(id + "<br>");
            out.print(dateTime+ "<br>");
        }catch(Exception ex){
            out.println(ex.getMessage());
        }finally{
            out.close();
        }
    }


}

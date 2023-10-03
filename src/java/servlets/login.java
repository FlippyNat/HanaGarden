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

import DA.CustDA;
import DA.ReserveDA;
/**
 *
 * @author tanya
 */
public class login extends HttpServlet {

    private CustDA custda;
    
        public void init() throws ServletException{
        
        custda = new CustDA();
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
        
        String uname = request.getParameter("name");
        String password = request.getParameter("password");
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

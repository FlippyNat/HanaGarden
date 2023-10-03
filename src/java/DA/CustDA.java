/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA;
import java.sql.*;
import javax.swing.*;
import domain.Customer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author tanya
 */
public class CustDA {
    private String host="jdbc:derby://localhost:1527/hanadb";
    private String user = "nbuser";
    private String password = "nbuser";
    private String table="customer";
    private Connection conn;
    private PreparedStatement stmt;   
    
    public CustDA(){
        createConnection();
    }

    public Customer retrieveRecord(String custID){
        String retrieveQuery="select * from " + table + " where custid= ?";
        
        Customer customer=null;
        try{
            stmt=conn.prepareStatement(retrieveQuery);
            stmt.setString(1, custID);
            
            ResultSet dt=stmt.executeQuery();
            
            if(dt.next()){
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                LocalDateTime dateTime = LocalDateTime.parse(dt.getString("custregisterdate"), formatter);
 
                customer=new Customer(custID, dt.getString("custname"), dt.getString("custemail"), dt.getString("custphoneno"), dt.getString("custpass"),dateTime,dt.getString("custaddress"));
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        return customer;
    }
    
    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("***TRACE: Connection established.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }       
}

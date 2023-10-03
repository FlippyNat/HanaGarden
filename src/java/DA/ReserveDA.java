/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA;
import java.sql.*;
import javax.swing.*;
import domain.Reservation;

import domain.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author tanya
 */
public class ReserveDA {
    private String host="jdbc:derby://localhost:1527/hanadb";
    private String user = "nbuser";
    private String password = "nbuser";
    private String table="reservation";
    private Connection conn;
    private PreparedStatement stmt;    
    
    CustDA cust = new CustDA();
    ServiceDA serv = new ServiceDA();
    public ReserveDA(){
        createConnection();

    }
    
    public int createRecord(Reservation reservation){
        String createQuery= "insert into " + table + " values (? , ? , ? , ? , ? , ?)";
        int check = 0;
        
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String datetime = reservation.getReserveDate().format(formatter);
            stmt=conn.prepareStatement(createQuery);
            stmt.setString(1,reservation.getReserveID());
            stmt.setString(2, reservation.getStatus());
            stmt.setTimestamp(3, Timestamp.valueOf(datetime));
            stmt.setString(4, reservation.getCustomer().getCustomerID());
            stmt.setString(5, reservation.getService().getServiceID());
            stmt.setString(6, reservation.getStaff().getstaffId());
            
            int dr = stmt.executeUpdate();
            
            if(dr>0){
                check =1;
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return check;
    }
    
    public Reservation retrieveRecord(String reserveID){
        String retrieveQuery = "Select * from " + table + "where reserveID = ?";
        Reservation reserve= null;
        try{
            stmt=conn.prepareStatement(retrieveQuery);
            stmt.setString(1,reserveID);
            
            ResultSet dt = stmt.executeQuery();
            
            if(dt.next()){
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                LocalDateTime dateTime = LocalDateTime.parse(dt.getString("reservedate"), formatter);
                reserve = new Reservation(dt.getString("reservestatus"), dateTime, cust.retrieveRecord(dt.getString("custid")), serv.retrieveRecord(dt.getString("serviceid")));
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        return reserve;
    }
    
    public int updateRecord(String reserveId, String reserveStatus, LocalDateTime reserveDate, Staff staff, Service service){
        String updateQuery="update " + table + " set reservestatus = ? , reservedate = ? , serviceid = ? , staffid = ? where reserveid = ?";
        int check = 0;
        
        try{
            stmt=conn.prepareStatement(updateQuery);
            stmt.setString(1, reserveStatus);
            stmt.setTimestamp(2, Timestamp.valueOf(reserveDate));
            stmt.setString(3, service.getServiceID());
            stmt.setString(4, staff.getstaffId());
            stmt.setString(5, reserveId);
            
            int dr = stmt.executeUpdate();
            
            if(dr>0){
                check=1;
            }
            
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return check;
        
    }
             
    public int retrieveRowCount(String custID){
        String rowQuery="select count(*) from " + table + " where custid = ?";
        int count=0;
        try{
            stmt=conn.prepareStatement(rowQuery);
            stmt.setString(1, custID);
            ResultSet dt=stmt.executeQuery();
            
            dt.next();
            count=dt.getInt(1);
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return count;
    }
    
    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("***TRACE: Connection established.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }   
    
//    public static void main(String[] args){
//        CustDA b = new CustDA();
//        ServiceDA c = new ServiceDA();
//        ReserveDA e = new ReserveDA();
//        Customer customer =  b.retrieveRecord("CT22-0001-4323");
//        Service service = c.retrieveRecord("Sa22-0000-9915");
//        Reservation a = new Reservation("pending",LocalDateTime.now(),customer,service);
//        e.createRecord(a);
//        
//        
//    }
}






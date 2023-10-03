/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DA;
import java.sql.*;
import java.util.*;
import domain.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tanya
 */
public class ServiceDA {
    private String host="jdbc:derby://localhost:1527/hanadb";
    private String user = "nbuser";
    private String password = "nbuser";
    private String table="Service";
    private Connection conn;
    private PreparedStatement stmt;  
    
    public ServiceDA(){
        createConnection();
    }
    
    public int createRecord(Service service){
        String createQuery="insert into " + table + " values( ? , ? , ? , ? , ? , ? , ? , ? )";
        createConnection();
        int check = 0;
        
        try{
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String datetime = service.getCreatedDate().format(formatter);
            stmt=conn.prepareStatement(createQuery);
            stmt.setString(1,service.getServiceID());
            stmt.setString(2,service.getServiceName());
            stmt.setString(3,service.getServiceDesc());
            stmt.setString(4,service.getServiceIncluded());
            stmt.setString(5,service.getServiceDetails());
            stmt.setString(6,service.getServicePrepTime());
            stmt.setTimestamp(7,Timestamp.valueOf(datetime));
            stmt.setFloat(8,service.getServicePrice());
            
            int dr=stmt.executeUpdate();
            
            if (dr>0){
                check=1;
            }
            
        }catch(SQLException ex){
           System.out.println(ex);
        }
        return check;
    }
    
    
    
    public Service retrieveRecord(String serviceID){
        String retrieveQuery="select * from " + table + " where serviceid= ?";
        
        Service service=null;
        
        try{
            stmt=conn.prepareStatement(retrieveQuery);
            stmt.setString(1, serviceID);
            
            ResultSet dr = stmt.executeQuery();
            
            if(dr.next()){
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime dateTime = dr.getTimestamp("servicecreatedate").toLocalDateTime();
                
                service=new Service(serviceID, dr.getString("servicename"),dr.getString("servicedesc"),dr.getString("serviceincluded"),dr.getString("servicedetails"),dr.getString("servicepreptime"),dateTime,dr.getFloat("serviceprice"));
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return service;
    }
    
    public int updateRecord(String serviceID, String serviceName, String serviceDesc, String serviceIncluded, String serviceDetail, String servicelPrepTime, LocalDateTime createdDate, float servicePrice){
        String updateQuery = "update " + table + " set servicename = ? , serviceprice = ? , servicedesc = ? , serviceincluded = ? , servicedetails = ? , servicepreptime = ? , servicecreatedate = ? where serviceid = ? ";
        
        int check=0;
        
        try{
            
            stmt = conn.prepareStatement(updateQuery);
            stmt.setString(1,serviceName);
            stmt.setFloat(2, servicePrice);
            stmt.setString(3, serviceDesc);
            stmt.setString(4, serviceIncluded);
            stmt.setString(5, serviceDetail);
            stmt.setString(6, servicelPrepTime);
            Timestamp time = Timestamp.valueOf(createdDate);
            stmt.setTimestamp(7, time);
            stmt.setString(8, serviceID);
            
            int dr = stmt.executeUpdate();
            
            if(dr>0){
                check=1;
            }
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return check;
    }
   
    
    public ArrayList<Service> retrieveServiceRecord(){
        String retrieveQuery="select * from " + table;
        
        ArrayList<Service> serviceRecord = new ArrayList<Service>();
        
        try{
            Statement a=conn.createStatement();
            
            ResultSet dr = a.executeQuery(retrieveQuery);

            while(dr.next()){
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime dateTime = dr.getTimestamp("servicecreatedate").toLocalDateTime();
                Service service=new Service(dr.getString("serviceID"),dr.getString("servicename"),dr.getString("servicedesc"),dr.getString("serviceincluded"),dr.getString("servicedetails"),dr.getString("servicepreptime"),dateTime,dr.getFloat("serviceprice"));

                serviceRecord.add(service);
            }
            
        }catch(Exception ex){
           System.out.println(ex);
        }
        
        return serviceRecord;
    }
    
    public int retrieveServiceCount(){
        String query="Select count(*) from " + table ;
        int count = 0;
        
        try{
            stmt=conn.prepareStatement(query);
            ResultSet dt = stmt.executeQuery();
            
            dt.next();
            count=dt.getInt(1);
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return count;
    }
    
    public int deleteRecord(String serviceID){
        String deleteQuery="delete from "+table+" where serviceid= ?";
        int check = 0;
        
        try{
            stmt=conn.prepareStatement(deleteQuery);
            
            stmt.setString(1, serviceID);
            
            int dr=stmt.executeUpdate();
            
            if (dr>0){
                check =1;
            }
            
        }catch(SQLException ex){
            
        }
        return check;
    }
    
   
    private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("***TRACE: Connection established.");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public static void main(String[] args){

    }
}

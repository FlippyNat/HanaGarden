/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import domain.Customer;
import DA.ReserveDA;
import java.time.LocalDateTime;  
import java.util.Random;
 
/**
 *
 * @author tanya
 */
public class Reservation {
    private String reserveID;
    private LocalDateTime reserveDate;
    private String status;
    private Customer customer;
    private Staff staff;
    private Service service;
    
    public Reservation(){
        
    }
    
    public Reservation(String status, LocalDateTime reserveDate, Customer customer, Service service){
        this.reserveID=generateID(customer);
        this.reserveDate=reserveDate;
        this.customer=customer;
        this.service=service;
        this.status=status;
    }
    
    public Reservation(String status, LocalDateTime reserveDate, Customer customer, Staff staff, Service service){
        this.reserveID=generateID(customer);
        this.reserveDate=reserveDate;
        this.customer=customer;
        this.staff=staff;
        this.service=service;
        this.status=status;
    }
    
    public String getReserveID(){
        return reserveID;
    }
    
    public void setReserveID(String reserveID){
        this.reserveID=reserveID;
    }
    
    public LocalDateTime getReserveDate(){
        return reserveDate;
    }
    
    public void setReserveDate(LocalDateTime reserveDate){
        this.reserveDate=reserveDate;
    }
    
    public Customer getCustomer(){
        return customer;
    }
    
    public void setCustomer(Customer customer){
        this.customer=customer;
    }
    
    public Staff getStaff(){
        return staff;
    }
    
    public void setStaff(Staff staff){
        this.staff=staff;
    }
    
    public Service getService(){
        return service;
    }
    
    public void setService(Service service){
        this.service=service;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status=status;
    }
    
    public static String generateID(Customer customer){
        String ID="";
        
        ReserveDA reserve=new ReserveDA();
        
        Random rand = new Random();
        try{
            int sequence=reserve.retrieveRowCount(customer.getCustomerID());
            int random=rand.nextInt(9999);
            String yr = String.valueOf(customer.getRegisterDate()).substring(2,4);
            ID=String.format("R%s%s-%04d-%04d", customer.getName().charAt(0), yr, sequence, random);
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return ID;
    }
    
    public static void main (String[] args){
        
        ReserveDA da = new ReserveDA();
        
        int count = da.retrieveRowCount("CT22-0001-4323");
        
        System.out.println(count);
    }
    
    
}

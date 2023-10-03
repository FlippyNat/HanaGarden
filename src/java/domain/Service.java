/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import java.util.*;
import java.time.LocalDateTime;

import DA.*;
/**
 *
 * @author tanya
 */
public class Service {
    private String serviceID;
    private String serviceName;
    private String serviceDesc;
    private String serviceIncluded;
    private String serviceDetails;
    private String servicePrepTime;
    private LocalDateTime createdDate;
    private float servicePrice;
    
    public Service(){
        
    }
    
    public Service(String serviceName, String serviceDesc, String serviceIncluded, String serviceDetails, String servicePrepTime, LocalDateTime createdDate, float servicePrice){
        
        this.serviceName=serviceName;
        this.serviceDesc=serviceDesc;
        this.serviceIncluded=serviceIncluded;
        this.serviceDetails=serviceDetails;
        this.servicePrepTime=servicePrepTime;
        this.servicePrice=servicePrice;
        this.createdDate=createdDate;

        serviceID=generateID(serviceName,createdDate);
        
    }
    
    public Service(String serviceID, String serviceName, String serviceDesc, String serviceIncluded, String serviceDetails, String servicePrepTime, LocalDateTime createdDate, float servicePrice){
        
        this.serviceID=serviceID;
        this.serviceName=serviceName;
        this.serviceDesc=serviceDesc;
        this.serviceIncluded=serviceIncluded;
        this.serviceDetails=serviceDetails;
        this.servicePrepTime=servicePrepTime;
        this.servicePrice=servicePrice;
        this.createdDate=createdDate;

    }
    
    public String getServiceID(){
        return serviceID;
    }
    
    public void setServiceID(String serviceID){
        this.serviceID=serviceID;
    }
    
    public String getServiceName(){
        return serviceName;
    }
    
    public void setServiceName(String serviceName){
        this.serviceName=serviceName;
    }
    
    public String getServiceDesc(){
        return serviceDesc;
    }
    
    public void setServiceDesc(String serviceDesc){
        this.serviceDesc=serviceDesc;
    }
    
    public String getServiceIncluded(){
        return serviceIncluded;
    }
    
    public void setServiceIncluded(String serviceIncluded){
        this.serviceIncluded=serviceIncluded;
    }
    
    public String getServiceDetails(){
        return serviceDetails;
    }
    
    public void setServiceDetails(String serviceDetails){
        this.serviceDetails=serviceDetails;
    }
    
    public String getServicePrepTime(){
        return servicePrepTime;
    }
    
    public void setServicePrepTime(String servicePrepTime){
        this.servicePrepTime=servicePrepTime;
    }
            
    public float getServicePrice(){
        return servicePrice;
    }
    
    public void setServicePrice(float servicePrice){
        this.servicePrice=servicePrice;
    }
    
    public LocalDateTime getCreatedDate(){
        return createdDate;
    }
    
    public void setCreatedDate(LocalDateTime createdDate){
        this.createdDate=createdDate;
    }
        
    public String generateID(String serviceName,LocalDateTime createdDate){
        String ID = "";
        ServiceDA serviceda = new ServiceDA();
        Random rand = new Random();
        
        
        int count = serviceda.retrieveServiceCount();
        int random=rand.nextInt(9999);
        String yr = String.valueOf(createdDate).substring(2,4);
        
        ID = String.format("S%s%s-%04d-%04d",Character.toUpperCase(serviceName.charAt(0)),yr,count,random);
        
        return ID;
    }
    
    public static void main(String[] args){
        
    }
}


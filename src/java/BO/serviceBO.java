/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;
import java.util.*;

import DA.*;
import domain.*;
/**
 *
 * @author tanya
 */
public class serviceBO {
    private ServiceDA service;
    
    public serviceBO(){
        service=new ServiceDA();
    }
    
    public void createService(Service services){
        service.createRecord(services);
    }
    
    public ArrayList<Service> retrieveServiceRecord(){
        ArrayList<Service> serviceRecord = new ArrayList<Service>();
        
        serviceRecord=service.retrieveServiceRecord();
        
        return serviceRecord;
        
    }
}

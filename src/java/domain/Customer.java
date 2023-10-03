/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.time.LocalDateTime;

/**
 *
 * @author tanya
 */
public class Customer extends User{
	private String address;
        private String customerID;
        
	//Constructors
	public Customer(){

	}

	public Customer(String customerID,String name,String email,String phoneNo,String password,LocalDateTime registerDate,String address){
		super(name,email,phoneNo,password,registerDate);
                this.customerID=customerID;
		this.address = address;
		
	}

	//Setters and getters
	public void setAddress(String address){
		this.address = address;
	}
        
        public void setCustomerID(String customerID){
		this.customerID = customerID;
	}

	public String getAddress(){
		return address;
	}
        
        public String getCustomerID(){
		return customerID;
	}
    
}

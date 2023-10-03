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
public class User {
    private String name;
    private String email;
    private String phoneNo;
    private String password;
    private LocalDateTime registerDate;

	//Constructors
	public User(){

	}

	public User(String name,String email,String phoneNo,String password,LocalDateTime registerDate){
		this.name = name;
                this.email=email;
                this.phoneNo=phoneNo;
                this.password = password;
                this.registerDate=registerDate;
		
	}

	//Setters & Getters
	public void setName(String name){
		this.name = name;
	}
        
        public void setEmail(String email){
		this.email = email;
	}
        
        public void setPhoneNo(String phoneNO){
		this.phoneNo = phoneNO;
	}

	public void setPassword(String password){
		this.password = password;
	}
        
        public void setRegisterDate(LocalDateTime registerDate){
		this.registerDate = registerDate;
	}


	public String getName(){
		return name;
	}
        
        public String getEmail(){
		return email;
	}
        
         public String getPhoneNo(){
		return phoneNo;
	}

	public String getPassword(){
		return password;
	}
        
        public LocalDateTime getRegisterDate(){
		return registerDate;
	}
}

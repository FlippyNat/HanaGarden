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
public class Staff extends User{
    	private String staffId;
	private String position;

	//Constructors
	public Staff(){

	}

	public Staff(String name,String email,String phoneNo,String password,LocalDateTime registerDate,String staffId,String position){
		super(name,email,phoneNo,password,registerDate);

		this.staffId = staffId;
		this.position = position;
	}

	//Setters and getters
	public void setstaffId(String staffId){
		this.staffId = staffId;
	}

	public void setPosition(String position){
		this.position = position;
	}

	public String getstaffId(){
		return staffId;
	}

	public String getPosition(){
		return position;
	}
}

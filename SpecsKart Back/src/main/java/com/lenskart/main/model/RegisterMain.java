package com.lenskart.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="RegDetails")
public class RegisterMain {

	
	private String name;
	@Id
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String email;	
	private String password;
	private long phnum;
	private String address;
	private String country;
	private String state;
	private long pin;
	

	public RegisterMain() {
		
	}
	
	public RegisterMain(String name, String email, String password, long phnum,String address,String country,String state, long pin) {
		super();
	
		this.name = name;
		this.email = email;
		this.password = password;
		this.phnum = phnum;
		this.address = address;
		this.country = country;
		this.state = state;
		this.pin = pin;
		
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhnum() {
		return phnum;
	}
	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}


	

}

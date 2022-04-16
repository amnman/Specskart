package com.lenskart.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Bookings {
	@Id 
	@GeneratedValue
	int bid;
	private String name;
	private String date;
	@ManyToOne
	@JoinColumn(name="emailid")
	Email eid;
	
	public Bookings() {
		
	}
	
	public Bookings(int bid,String name, String date, Email eid) {
		super();
		this.bid=bid;
		this.name = name;
		this.date = date;
		this.eid = eid;
	}
	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Email getEid() {
		return eid;
	}
	public void setEid(Email eid) {
		this.eid = eid;
	} 

}

package com.lenskart.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name="state")
public class State {
	@Id
	@GeneratedValue
	private long id;
	private String sname;
	@ManyToOne
	@JoinColumn(name="cid")
	private Country c;
	
	
	public Country getC() {
		return c;
	}


	public void setC(Country c) {
		this.c = c;
	}


	public  State()  {
	
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public State(long id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
	}
	
	

}

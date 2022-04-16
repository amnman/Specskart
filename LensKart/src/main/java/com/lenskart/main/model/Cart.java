package com.lenskart.main.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	private int id;
	private String spect;
	private long price;
	private String image;
	
	@ManyToOne
	@JoinColumn(name="emailid")
	Email ceid;
	
	public Cart()
	{
		
	}
	public Cart(int id, String spect, long price,String image,Email ceid) {
		super();
		this.id = id;
		this.spect = spect;
		this.price = price;
		this.image=image;
		this.ceid=ceid;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpect() {
		return spect;
	}
	public void setSpect(String spect) {
		this.spect = spect;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Email getCeid() {
		return ceid;
	}
	public void setCeid(Email ceid) {
		this.ceid = ceid;
	}
	
	


}

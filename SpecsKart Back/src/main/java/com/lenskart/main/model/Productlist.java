package com.lenskart.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productlist")
public class Productlist
{
@Id

private int id;
private String spect;
private long price;
private String image;


  public Productlist()
{
	
}



public Productlist(int id, String spect, long price,String image) {
	super();
	this.id = id;
	this.spect = spect;
	this.price = price;
	this.image=image;
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

}

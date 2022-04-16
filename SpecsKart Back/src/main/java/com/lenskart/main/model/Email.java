package com.lenskart.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="emails")
public class Email {
	@Id
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	String mail;
public Email() {
	
}
	public Email(String mail) {
		super();
		this.mail = mail;
	}

	public String getEmail() {
		return mail;
	}

	public void setEmail(String mail) {
		this.mail = mail;
	}
	

}

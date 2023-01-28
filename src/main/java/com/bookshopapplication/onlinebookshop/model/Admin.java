package com.bookshopapplication.onlinebookshop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
	@Id
	String username;
	String name;
	String email;
	String password;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String username, String name, String email, String password) {
		super();
		this.username = username;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

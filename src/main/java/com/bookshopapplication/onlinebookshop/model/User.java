package com.bookshopapplication.onlinebookshop.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	String username;
	String name;
	String email;
	String password;
	
	@ManyToMany
	@JoinTable(
	name = "user_favbooks",
	joinColumns = @JoinColumn(name="username"),
	inverseJoinColumns = @JoinColumn(name="iSBN")
			)
	List<Book>favBooks=new ArrayList<>();
	public User(String username, String name, String email, String password, List<Book> favBooks) {
		super();
		this.username = username;
		this.name = name;
		this.email = email;
		this.password = password;
		this.favBooks = favBooks;
	}
	
	public List<Book> getFavBooks() {
		return favBooks;
	}
	public void setFavBooks(List<Book> favBooks) {
		this.favBooks = favBooks;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

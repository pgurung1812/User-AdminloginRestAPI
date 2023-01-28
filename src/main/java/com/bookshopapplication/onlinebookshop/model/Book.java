package com.bookshopapplication.onlinebookshop.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
	
	@Id
	private String iSBN;
	private String title;
	private String author;
	private String publication;
	
	@ManyToMany(mappedBy = "favBooks",cascade = CascadeType.ALL)
	private List<User> user=new ArrayList<>();
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public String getiSBN() {
		return iSBN;
	}
	public void setiSBN(String iSBN) {
		this.iSBN = iSBN;
	}
	
	public List<User> getUser() {
		return user;
	}



	public void setUser(List<User> user) {
		this.user = user;
	}



	public Book(String iSBN, String title, String author, String publication, List<User> user) {
		super();
		this.iSBN = iSBN;
		this.title = title;
		this.author = author;
		this.publication = publication;
		this.user = user;
	}



	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	@Override
	public String toString() {
		return "Book [iSBN=" + iSBN + ", title=" + title + ", author=" + author + ", publication=" + publication + "]";
	}
	

}

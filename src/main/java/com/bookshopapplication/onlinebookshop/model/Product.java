package com.bookshopapplication.onlinebookshop.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	private String prodid;
	private String prodname;
	
	@ManyToMany(mappedBy = "products")
	private List<Category>categories=new ArrayList<>();
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String prodid, String prodname) {
		super();
		this.prodid = prodid;
		this.prodname = prodname;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public String getProdid() {
		return prodid;
	}
	public void setProdid(String prodid) {
		this.prodid = prodid;
	}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	
	
	

}

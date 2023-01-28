package com.bookshopapplication.onlinebookshop.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Id
	private  String cid;
	private  String categoryname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Product>products=new ArrayList<>();
	
public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String cid, String categoryname) {
		super();
		this.cid = cid;
		this.categoryname = categoryname;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	

}

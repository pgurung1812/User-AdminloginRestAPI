package com.bookshopapplication.onlinebookshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshopapplication.onlinebookshop.model.Admin;
import com.bookshopapplication.onlinebookshop.model.Book;
import com.bookshopapplication.onlinebookshop.repository.Adminrepository;
import com.bookshopapplication.onlinebookshop.repository.Bookrepository;

@Service
public class Adminservice {
	
	@Autowired
	private Adminrepository adminrepository;
	@Autowired
	private Bookrepository bookrepository;
	
	public void insertnewbook(Book book) {
		
		bookrepository.save(book);
	}
	
	public void removebook(String id) {
		bookrepository.deleteById(id);
	}
	
	public void updatebook(Book book) {
		bookrepository.save(book);
	}
	
	public List<Book> listallbook() {
		return bookrepository.findAll();
		
	}
	public void saveadmin(Admin admin) {
		adminrepository.save(admin);
	}
	

}

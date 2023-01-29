package com.bookshopapplication.onlinebookshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshopapplication.onlinebookshop.model.Book;
import com.bookshopapplication.onlinebookshop.repository.Bookrepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Bookservice {

	@Autowired
	private Bookrepository bookrepository;
	
	
	public List<Book>findallbooks(){
		
		
		return bookrepository.findAll();
	
		
	}
	
	public void Savebook(Book book) {
		bookrepository.save(book);
	}
	
	public Book findbookbyISBN(String id)
	{
		return bookrepository.findById(id).get();
	}

	public Book findbyauthor(String author) {
		// TODO Auto-generated method stub
		return bookrepository.findByAuthor(author);
	}
	
	public Book findbytitle(String title) {
		return bookrepository.findByTitle(title);
	}
	
	public void deletebyISBN(String ISBN)
	{
		bookrepository.deleteById(ISBN);
	}
	
	
	
	
	
	
	
	
	
	
	
}

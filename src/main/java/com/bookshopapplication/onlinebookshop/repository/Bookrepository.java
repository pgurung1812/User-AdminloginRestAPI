package com.bookshopapplication.onlinebookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookshopapplication.onlinebookshop.model.Book;


@Repository
public interface Bookrepository extends JpaRepository<Book, String>{
	
	public Book findByAuthor(String name);
	
	public Book findByTitle(String title);

}

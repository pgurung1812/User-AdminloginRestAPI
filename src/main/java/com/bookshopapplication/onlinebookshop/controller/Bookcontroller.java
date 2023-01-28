package com.bookshopapplication.onlinebookshop.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookshopapplication.onlinebookshop.model.Book;
import com.bookshopapplication.onlinebookshop.model.User;
import com.bookshopapplication.onlinebookshop.service.Bookservice;

@Controller
public class Bookcontroller {
	//	
	//	@RequestMapping("/allbook")
	//	public ModelAndView allbook(@ModelAttribute Book book) {
	//		ModelAndView modelAndView=new ModelAndView("booksview");
	//		modelAndView.addObject(book);
	//		
	//		
	//	}
	@Autowired
	private Bookservice bookservice;

	@RequestMapping("/allbook")
	public ModelAndView findBooks(){

		List<Book>books=bookservice.findallbooks();
		ModelAndView modelAndView=new ModelAndView("booksview");
		modelAndView.addObject("allbooks",books);


		return modelAndView;

      }
	
	@RequestMapping("/bookbyauthor")
	public ModelAndView findbookbyAuthor(@ModelAttribute Book book) {
		
		String author=book.getAuthor();
		System.out.println(author);
		Book book2=bookservice.findbyauthor(author);
		System.out.println(book2);
		
		ModelAndView modelAndView= new ModelAndView("bookauthor");
		modelAndView.addObject("book4",book2);
		
	   return modelAndView;
		
	}

	
	@RequestMapping("/addbookfav")
	public void addbooktofavlist(@ModelAttribute Book book) {
		
		String title=book.getTitle();
		
		Book favBook=bookservice.findbytitle(title);
	    System.out.println(favBook);
		
//		System.out.println(username);
//		ModelAndView modelAndView=new ModelAndView("favbook");
//		modelAndView.addObject( "favb",favBook);
		
//		return modelAndView;
//		List<Book>books=user.getFavBooks();
//		books.add(favBook);
//		user.setFavBooks(books);
	}
     @RequestMapping("/bookbyISBN")
     public ModelAndView findbookbyISBN(@ModelAttribute Book book)
     {
    	 
    	 String id=book.getiSBN();
    	 
    	 Book book3=bookservice.findbookbyISBN(id);
    	 
    	 
    	 ModelAndView modelAndView=new ModelAndView("BookbyISBN");
    	 modelAndView.addObject("bookISBN",book3);
    	 
    	 
    	 
    	 return modelAndView;
     }


}

package com.bookshopapplication.onlinebookshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookshopapplication.onlinebookshop.model.Book;
import com.bookshopapplication.onlinebookshop.repository.Bookrepository;
import com.bookshopapplication.onlinebookshop.service.Adminservice;
import com.bookshopapplication.onlinebookshop.service.Bookservice;

@Controller
public class Admincontroller {
	
	@Autowired
	private Adminservice adminservice;
	
	@Autowired
	private Bookservice bookservice;
	
	
	
	@RequestMapping("/admin")
	public String addadmin() {
		
		return "adminlogin";
	}
	
	
	@RequestMapping("/addbook")
	public void Addbook(@ModelAttribute Book book)
	{
	    bookservice.Savebook(book);
		
	}
	
	@RequestMapping("/deletebook")
	public void Deletebook(@ModelAttribute Book book)
	{
		if(bookservice.findbookbyISBN(book.getiSBN())!=null)
		{
			bookservice.deletebyISBN(book.getiSBN());
		}
	}
	
	@RequestMapping("/updatebook")
	public void Updatebook(@ModelAttribute Book book)
	{
		bookservice.Savebook(book);
	}
	
	@RequestMapping("/searchbook")
	public ModelAndView Searchbook(@ModelAttribute Book book)
	{
		Book book2=null;
		if(bookservice.findbookbyISBN(book.getiSBN())!=null)
		{
			 book2= bookservice.findbookbyISBN(book.getiSBN());
		}
		
		ModelAndView modelAndView =new ModelAndView("BookbyISBN");
		modelAndView.addObject("bookISBN",book2);
		
		return modelAndView;
		
	}
	
	@RequestMapping("/listbooks")
	public ModelAndView Listbooks(@ModelAttribute Book book)
	{
		List<Book>bookslist=new ArrayList<>();
		bookslist=bookservice.findallbooks();
		ModelAndView modelAndView=new ModelAndView("booksview");
		modelAndView.addObject("allbooks",bookslist);
	
		return modelAndView;
		
	}
	
	
	

}

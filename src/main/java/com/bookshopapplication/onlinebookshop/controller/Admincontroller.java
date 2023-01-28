package com.bookshopapplication.onlinebookshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookshopapplication.onlinebookshop.service.Adminservice;

@Controller
public class Admincontroller {
	
	@Autowired
	private Adminservice adminservice;
	
	
	@RequestMapping("/admin")
	public String addadmin() {
		
		return "adminlogin";
	}
	
	
	
	
	
	
	

}

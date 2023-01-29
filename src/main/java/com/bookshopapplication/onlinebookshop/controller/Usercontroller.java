package com.bookshopapplication.onlinebookshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookshopapplication.onlinebookshop.model.Admin;
import com.bookshopapplication.onlinebookshop.model.User;
import com.bookshopapplication.onlinebookshop.service.Adminservice;
import com.bookshopapplication.onlinebookshop.service.Userservice;

import ch.qos.logback.core.model.Model;

@Controller
public class Usercontroller {

	@Autowired
	private Userservice userservice;
	
	@Autowired
	private Adminservice adminservice;

	@RequestMapping("/Registration")
	public String register() {
		System.out.println("HI");

		return "registration";
	}

	@RequestMapping("/success")
	public String success(@ModelAttribute User user,Model model) {

		userservice.save(user);



		return "success";
	}

	@RequestMapping("/")
	public String login()
	{
		return "login";
	}

	@RequestMapping("/processing")
	public ModelAndView validate(@ModelAttribute User user ) {

		
		if(userservice.validatelogin(user))
		{
			ModelAndView modelAndView=new ModelAndView("loggedin");
			modelAndView.addObject("username",user.getUsername());

			return modelAndView;
		}
		else if(adminservice.validateAdmin(user)) {
			
			ModelAndView modelAndView=new ModelAndView("adminlogin");
			modelAndView.addObject("username",user.getUsername());

			return modelAndView;
		}

		else {

			ModelAndView modelAndView=new ModelAndView("deniedaccess");

			return modelAndView;
		}

	}









}

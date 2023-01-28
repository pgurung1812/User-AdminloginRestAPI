package com.bookshopapplication.onlinebookshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshopapplication.onlinebookshop.model.Laptop;
import com.bookshopapplication.onlinebookshop.repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	private LaptopRepository laptopRepository;
	
	public void savelaptop(Laptop laptop) {
		laptopRepository.save(laptop);
	}

}

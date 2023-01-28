package com.bookshopapplication.onlinebookshop.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshopapplication.onlinebookshop.model.User;
import com.bookshopapplication.onlinebookshop.repository.Userrepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class Userservice {
	
	@Autowired
	private Userrepository userrepository;
	
	public void save(User user) {
		
		userrepository.save(user);
		
	}
	
	public boolean validatelogin(User user) {
		
		User user3=null;
	   Optional<User> u =  userrepository.findById(user.getUsername());
	    if(u.isPresent())
	    {
	    	user3=u.get();
	    }
	    if((user3.getUsername().equals(user.getUsername())) & (user3.getPassword().equals(user.getPassword())))
	    		{
	    	      return true;
	    		}
	    else {
			return false;
		}
	}

}

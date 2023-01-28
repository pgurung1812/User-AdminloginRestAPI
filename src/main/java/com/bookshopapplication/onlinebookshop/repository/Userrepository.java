package com.bookshopapplication.onlinebookshop.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookshopapplication.onlinebookshop.model.User;

@Repository
public interface Userrepository extends JpaRepository<User, String> {
	

	

}

package com.bookshopapplication.onlinebookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookshopapplication.onlinebookshop.model.Admin;

@Repository
public interface Adminrepository  extends JpaRepository<Admin, String>{

}

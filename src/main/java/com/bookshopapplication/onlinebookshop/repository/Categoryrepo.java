package com.bookshopapplication.onlinebookshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookshopapplication.onlinebookshop.model.Category;

@Repository
public interface Categoryrepo extends JpaRepository<Category, String> {

}

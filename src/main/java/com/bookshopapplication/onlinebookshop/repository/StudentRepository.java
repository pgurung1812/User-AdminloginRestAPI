package com.bookshopapplication.onlinebookshop.repository;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.bookshopapplication.onlinebookshop.model.Book;
import com.bookshopapplication.onlinebookshop.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}

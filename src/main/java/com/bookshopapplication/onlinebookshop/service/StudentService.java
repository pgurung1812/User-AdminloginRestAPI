package com.bookshopapplication.onlinebookshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshopapplication.onlinebookshop.model.Student;
import com.bookshopapplication.onlinebookshop.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	public void savestudent(Student student)
	{
		studentRepository.save(student);
	}

}

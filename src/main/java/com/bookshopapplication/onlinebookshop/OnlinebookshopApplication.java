package com.bookshopapplication.onlinebookshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.management.loading.PrivateClassLoader;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import com.bookshopapplication.onlinebookshop.model.Address;
import com.bookshopapplication.onlinebookshop.model.Book;
import com.bookshopapplication.onlinebookshop.model.Category;
import com.bookshopapplication.onlinebookshop.model.Laptop;
import com.bookshopapplication.onlinebookshop.model.Product;
import com.bookshopapplication.onlinebookshop.model.Student;
import com.bookshopapplication.onlinebookshop.model.User;
import com.bookshopapplication.onlinebookshop.repository.Categoryrepo;
import com.bookshopapplication.onlinebookshop.repository.StudentRepository;
import com.bookshopapplication.onlinebookshop.service.Bookservice;
import com.bookshopapplication.onlinebookshop.service.LaptopService;
import com.bookshopapplication.onlinebookshop.service.StudentService;
import com.bookshopapplication.onlinebookshop.service.Userservice;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class OnlinebookshopApplication implements CommandLineRunner{

	@Autowired
	private StudentService studentService;
	@Autowired
	private Userservice userservice;
//	@Autowired
//	private StudentRepository studentRepository;
	
	@Autowired
	private Bookservice bookservice;
	@Autowired
	private LaptopService laptopService;
	
	@Autowired
	private Categoryrepo categoryrepo;
	
	public static void main(String[] args) {
		
		SpringApplication.run(OnlinebookshopApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
//	//	one to one mapping
	// TODO Auto-generated method stub
//		Student student=new Student();
//         student.setStudentName("Prasa Gurung");
//		student.setAbout("I am a nurse");
//		student.setStudentId(15);
//		
//		studentService.savestudent(student);
//		
//		Laptop laptop=new Laptop();
//		
//		laptop.setBrand("Lenovo1");
//		laptop.setModelNumber("23");
//		laptop.setLaptopId(41);
//		laptop.setStudent(student);
//		laptopService.savelaptop(laptop);
//		student.setLaptop(laptop);
//	
	// one to many

//		Student student=new Student();
//		student.setStudentName("Pa Gurung");
//		student.setAbout("I am a nurse");
//		student.setStudentId(16);
//
//		
//		Address address1=new Address();
//		address1.setAddressId(11);
//		address1.setCity("Austin");
//		address1.setCountry("USA");
//		address1.setStreet("123");
//		address1.setStudent(student);
//		
//		Address address2=new Address();
//		address2.setAddressId(21);
//		address2.setCity("Austinadd");
//		address2.setCountry("USA");
//		address2.setStreet("1234");
//		address2.setStudent(student);
//		
//		List<Address>addresses=new ArrayList<>();
//	    addresses.add(address1);
//	    addresses.add(address2);
//		student.setAddresslist(addresses);
//		studentService.savestudent(student);

	// Many to many
//		Category category=new Category();
//		category.setCid("1");
//		category.setCategoryname("electronics");
//		
//		Category category2=new Category();
//		category2.setCid("2");
//		category2.setCategoryname("latestgadget");
//		
//		List<Product>products=new ArrayList<>();
//		List<Category>categories=new ArrayList<>();
//		categories.add(category2);
//		categories.add(category);
//		
//		Product product=new Product();
//		product.setProdid("0");
//		product.setProdname("iphone");
//        product.setCategories(categories);
//		
//		
//		Product product1=new Product();
//		product1.setProdid("1");
//		product1.setProdname("iphonexs");
//		products.add(product);
//		products.add(product1);
//		
//		category.setProducts(products);
//		
//		categoryrepo.save(category);
//		categoryrepo.save(category2);
//		
	// product.setCategories(categories);

		
		//Many to Many
		//users can add multiple books to its favourite list
//		Book book=new Book();
//		book.setiSBN("58");
//		book.setAuthor("LLK1");
//		book.setPublication("Mok2");
//		book.setTitle("Hello1");
//		bookservice.Savebook(book);
//		
//		Book book1=new Book();
//		book1.setiSBN("6");
//		book1.setAuthor("LLKi");
//		book1.setPublication("Moku");
//		book1.setTitle("Helloi");
//		bookservice.Savebook(book1);
//		
//		List<Book>books=new ArrayList<>();
//		books.add(book1);
//		books.add(book);
//		User user=new User();
//		user.setEmail("HIII");
//		user.setName("SAMNN");
//		user.setPassword("k");
//		user.setUsername("how");
//		user.setFavBooks(books);
//		userservice.save(user);
//		List<User>users=new ArrayList<>();
//		users.add(user);
//     	book.setUser(users);
//        book1.setUser(users);

	}

}

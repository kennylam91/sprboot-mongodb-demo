package com.springboot.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.mongodb.dao.CustomerRepository;
import com.springboot.mongodb.model.Customer;

@SpringBootApplication
public class SpringbootMongodbApplication implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		
		// save a couple of customers
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Tim"));
		repository.save(new Customer("Jordan", "Tim"));
		
		//fetch all customers
		System.out.println("Fetch all customers by findAll()");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		System.out.println();
		System.out.println("FindbyFirstName('Alice')");
		System.out.println(repository.findByFirstName("Alice"));
		
		System.out.println("findByLastName('Tim')");
		System.out.println(repository.findByLastName("Tim"));
		

	}
	
	

	
}

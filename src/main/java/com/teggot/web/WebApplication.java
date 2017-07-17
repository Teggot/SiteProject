package com.teggot.web;

import com.teggot.web.Models.Product;
import com.teggot.web.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication implements CommandLineRunner{
	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		repository.save(new Product("Брус",
				"Обычный брус, ничего необычного",
				100,100,6,
				2000));
		repository.save(new Product("Брус",
				"Обычный брус, ничего необычного",
				100,100,4,
				1500));
		repository.save(new Product("Брус",
				"Обычный брус, ничего необычного",
				150,100,6,
				3000));
		repository.save(new Product("Брус",
				"Обычный брус, ничего необычного",
				150,100,4,
				2000));

//		System.out.println("AllFinder found with findAll():");
//		System.out.println("-------------------------------");
//		for (Product product : repository.findAll()) {
//			System.out.println(product);
//		}
//		System.out.println();
//
//		// fetch an individual customer
//		System.out.println("Customer found with findByFirstName('Alice'):");
//		System.out.println("--------------------------------");
//		for (Product product : repository.findByPrice(2000)) {
//			System.out.println(product);
//		}
//		System.out.println();
//
//		System.out.println("Customers found with findByLastName('Smith'):");
//		System.out.println("--------------------------------");
//		for (Product product : repository.findByWidth(100)) {
//			System.out.println(product);
//		}
 	}
}

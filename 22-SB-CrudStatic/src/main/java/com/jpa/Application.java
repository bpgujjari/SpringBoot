package com.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private ProductRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product p1= new Product(1, "laptop", 20000, "12-12-2022", "10-10-2030", "5-Years");		
		Product p2= new Product(2, "tv", 18000, "10-09-2022", "1-09-2028", "4-Years");		
		Product p3= new Product(3, "mobile", 12000, "01-02-2021", "02-10-2030", "1-Year");		

		
		repo.save(p1);
		repo.save(p2);
		repo.save(p3);
		
		p1.setPname("friz");
		repo.save(p1);
		
		repo.deleteById(3);
		
		
		Product p4=repo.findById(2).get();
		System.out.println(p4);
		
		List<Product>products=(List<Product>) repo.findAll();
		
		products.stream()
		.forEach(System.out::println);
			
	}
}

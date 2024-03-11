package com.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application  implements CommandLineRunner{

	
	@Autowired
	private StudentRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student s1= new Student(1, "chimtu", "java", 10000.00);
		 Student s2= new Student(2, "bhavani", "hibernate", 20000.00);
		 Student s3=new Student(3, "prasad", "springboot", 25000.00);
		 
		/* repo.save(s1);
		 repo.save(s2);
		 repo.save(s3);
		 
		 System.out.println("date inserted successfully.........");
	
	*/
		 //repo.deleteById(1);
		 
		 
		/* s2.setCourse("spring");
		 
		 repo.save(s2);
		 */
		 
		 
		//System.out.println(repo.findById(3));
		
		List<Student>stu=(List<Student>) repo.findAll();
		 	stu.stream()
		 	.forEach(System.out::println);
		 	
		 	
		 
		 
	}


}
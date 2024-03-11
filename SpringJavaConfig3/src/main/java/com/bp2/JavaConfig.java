package com.bp2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
@Bean("id1")
public Student students() {
	Student s= new Student();
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter student ids...");
	int id=sc.nextInt();
	
	System.out.println("enter student name...");
	String name=sc.next();
	
	System.out.println("enter subject name...");
	String subject=sc.next();
	System.out.println("enter subject marks..");
	int marks=sc.nextInt();
	
	
	Set<Integer>ids=Set.of(id);
	List<String>names=Arrays.asList(name);
	Map<String, Integer> subMarks= Map.of(subject, marks);
	
	
	
	
	
	s.setIds(ids);
	s.setNames(names);
	s.setMarks(subMarks);
	
	return s;	
}
}

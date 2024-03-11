package com.bp2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

@Bean("id1")
public Product getProduct()
{
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter margin id and code");
	int id=sc.nextInt();
	String code=sc.next();
	
	Margin m1= new Margin(id, code);

	System.out.println("enter model id, code , cost");
	int id1=sc.nextInt();
	String code1=sc.next();
	double cost=sc.nextDouble();
	
	Model m2=new Model(id1, code1, cost, m1);
	
	System.out.println("enter product id, name...");
	int id2=sc.nextInt();
	String name=sc.next();
	
	Product p=new Product(id2, name, m2);

return p;
}
}

package com.bp2;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean("id1")
	public Consume getConsumer()
	{
		Consume c=new Consume();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter consumer id");
		int id=sc.nextInt();
		System.out.println("enter consumer name");
		String name=sc.next();
		System.out.println("enter current reading");
		int cr=sc.nextInt();
		System.out.println("enter previous reading");
		int pr=sc.nextInt();
		
		c.setCid(id);
		c.setCname(name);
		c.setCurrent_reading(cr);
		c.setPrevious_reading(pr);
		
		
		
	return c;	
	}
}
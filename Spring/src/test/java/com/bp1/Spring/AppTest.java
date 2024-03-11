package com.bp1.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest 
{
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
		Student s =(Student)ctx.getBean("id2");
		s.print();
	
	}
}

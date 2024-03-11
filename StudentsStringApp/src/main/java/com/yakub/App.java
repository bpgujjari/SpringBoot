package com.yakub;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
		StudentMarksBean s =(StudentMarksBean)ctx.getBean("id1");
		s.print();
	
	}
}


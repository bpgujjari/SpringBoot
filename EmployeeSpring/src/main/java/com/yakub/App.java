package com.yakub;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
		EmployeeBean s =(EmployeeBean)ctx.getBean("id1");
		s.printEmpId();
		s.printList();
		s.printMap();
	
	}
}


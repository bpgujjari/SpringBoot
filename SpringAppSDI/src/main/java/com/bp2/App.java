package com.bp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	 public static void main( String[] args )
	    {
	    	ApplicationContext ct=new AnnotationConfigApplicationContext(JavaConfig.class);
	    	Employee s2= (Employee)ct.getBean("id1");
	    	s2.printEmployee();
	    }
}

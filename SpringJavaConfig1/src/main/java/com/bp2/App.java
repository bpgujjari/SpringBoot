package com.bp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	 public static void main( String[] args )
	    {
	    	ApplicationContext ct=new ClassPathXmlApplicationContext("spconfig.xml");
	    	Student s2= (Student)ct.getBean("id2");
	    	s2.print();
	    }
}

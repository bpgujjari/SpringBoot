package com.bp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	 public static void main( String[] args )
	    {
	    	ApplicationContext ct=new AnnotationConfigApplicationContext(JavaConfig.class);
	    	Consume c1=(Consume)ct.getBean("id1");
	    	c1.printBill();
	    }
}

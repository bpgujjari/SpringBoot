package com.bp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	 public static void main( String[] args )
	    {
	    	ApplicationContext ct=new AnnotationConfigApplicationContext(JavaConfig.class);
	    	Product p1=(Product)ct.getBean("id1");
	    	p1.print();
	    }
}

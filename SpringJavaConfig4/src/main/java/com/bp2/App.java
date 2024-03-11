package com.bp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	 public static void main( String[] args )
	    {
	    	ApplicationContext ct=new AnnotationConfigApplicationContext(JavaConfig.class);
	    	ProductBean p =(ProductBean) ct.getBean("id1");
	    	p.print();
	    }
}

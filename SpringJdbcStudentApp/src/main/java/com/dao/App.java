package com.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx= new ClassPathXmlApplicationContext("spconfig.xml");
    	StudentBean s=(StudentBean)ctx.getBean("id3");
    	//s.createTable();
    	//s.insertRecords();
    	//s.deleteRecord();
    	//s.updateRecord();
    	s.printOneRecord();
    	System.out.println("******");
    	s.printAllRecords();
    }
}

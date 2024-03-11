package com.dao;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ct=new ClassPathXmlApplicationContext("spconfig.xml");
    	MobileBean mb=(MobileBean)ct.getBean("id3");
    	//mb.createTable();
    	//mb.insertRecord();
    	//mb.updateTable();
    	//mb.deleteRecord();
    	//mb.printOneRecord();
    	//System.out.println("**********");
    	mb.printAllRecords();
    	
    }
    
}

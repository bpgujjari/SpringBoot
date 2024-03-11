package com.dao;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ct=new ClassPathXmlApplicationContext("spconfig.xml");
    	ProdectBean p=(ProdectBean)ct.getBean("id3");
    	//11p.createTable();
    	//p.insertRecord();
    	//p.updateRecord();
    	//p.deleteRecord();
    	p.printOneRecord();
    	System.out.println("*****************");
    	p.printAllRecords();
    	
    }
    
}

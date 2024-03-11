package com.bp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ct=new ClassPathXmlApplicationContext("spconfig.xml");
    	AdditionBean b=(AdditionBean)ct.getBean("id1");
    	b.Addition();
    }
}

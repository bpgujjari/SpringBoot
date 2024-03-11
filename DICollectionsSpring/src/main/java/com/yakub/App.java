package com.yakub;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
		SathyaCollegeBean s =(SathyaCollegeBean)ctx.getBean("id1");
		s.stdNames();
		s.stdRollno();
		s.branchdtls();
		s.branchInfos();
	}
}


package com.bp2;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
@Bean("id1")
public Employee getEmployee()
{

	Address ad=new Address(111,"Hyderabad","Telangana");
	
	Employee e1=new Employee();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter eid");
	int eid=sc.nextInt();
	System.out.println("enter ename");
	String name=sc.next();
	System.out.println("enter esal");
	double sal=sc.nextDouble();
	System.out.println("enter desg");
	String desg=sc.next();
	
	e1.setEid(eid);
	e1.setEname(name);
	e1.setEsal(sal);
	e1.setDesg(desg);
	e1.setAddr(ad);

	
	return e1;
}
	
}

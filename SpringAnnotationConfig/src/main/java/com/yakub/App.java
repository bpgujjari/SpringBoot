package com.yakub;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.yakub")
public class App 
{
	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(App.class);
		Employee e=(Employee)ctx.getBean(Employee.class);
		Customer c=(Customer)ctx.getBean(Customer.class);
		e.printEmp();
	}
}


package com.dao;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class ProdectBean {
private JdbcTemplate jt;

public ProdectBean() {
	super();
}

public JdbcTemplate getJt() {
	return jt;
}

public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

public void createTable()
{
jt.execute("create table ProdectBean(id number,productName varchar2(20),price number,quantity number,companyName varchar2(20),total_amt number,description varchar2(40))");	
System.out.println("table created Success fully...");
}

public void insertRecord() {
	Scanner sc= new Scanner(System.in);
	while(true)
    	{
    	System.out.println("enter product id...");
    	int no=sc.nextInt();
    	
    	System.out.println("enter productName");
    	String name=sc.next();
    	
    	System.out.println("enter price of the product..");
    	double price=sc.nextDouble();
    	
    	System.out.println("enter quantity...");
    	int quantity=sc.nextInt();
    	
    	System.out.println("enter company name...");
    	String cmpName=sc.next();
    	
    	System.out.println("enter description");
    	String description=sc.next();
    	double total_amt=quantity*price;
    	
    	int i=	jt.update("insert into ProdectBean values("+no+",'"+name+"',"+price+","+quantity+",'"+cmpName+"',"+total_amt+",'"+description+"')");
    	System.out.println(i+" records inserted...");
    	
    	System.out.println("do you want to insert one more record...yes/no");
    	String option=sc.next();
    	if(option.equals("no"))
    	{
    		break;
    	}
    }	
}



public void updateRecord()
{
int i=jt.update("update ProdectBean set price=price+1000 where price<15000");	
System.out.println(i+"--record updated");
}

public void deleteRecord()
{
	
int i =jt.update("delete from ProdectBean where companyname='hp'");
System.out.println(i+" - record deleted successfully..");
}
public void printOneRecord()
{
List one=jt.queryForList("select * from ProdectBean where companyname='dell'");
System.out.println(one.toString());

}
public void printAllRecords()
{
List i=jt.queryForList("select * from ProdectBean");
i.stream()
.forEach(System.out::println);
}

}

package com.dao;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

public class MobileBean {
Scanner sc= new Scanner(System.in);
private JdbcTemplate jt;

public MobileBean() {
}

public JdbcTemplate getJt() {
	return jt;
}

public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

public void createTable()
{
jt.execute("create table MobileBean(modelNo number, modelName varchar2(15),ram_size number(2), rom_size number(3),os_name varchar2(10), processor_name varchar2(15), glass_type varchar2(15), f_cam number(2), b_cam number(3), imei_no number(20), company_name varchar2(20), prize number(7,2), description varchar2(30))");	
System.out.println("table created succrss fully...");
}
public void insertRecord() {
	while(true)
    	{
    	System.out.println("enter model no...");
    	int no=sc.nextInt();
    	System.out.println("enter modelName");
    	String name=sc.next();
    	System.out.println("enter ram..");
    	int ram=sc.nextInt();
    	System.out.println("enter rom..");
    	int rom=sc.nextInt();
    	System.out.println("Enter os name");
    	String os=sc.next();
    	System.out.println("enter processor name");
    	String processor=sc.next();
    	System.out.println("enter glass type");
    	String glass=sc.next();
    	System.out.println("enter front cam pixcels");
    	int front=sc.nextInt();
    	System.out.println("enter back cam pixcels");
    	int back=sc.nextInt();
    	System.out.println("enter imei number..");
    	long imei=sc.nextLong();
    	System.out.println("enter company name...");
    	String cmpName=sc.next();
    	System.out.println("enter prize of the mobile..");
    	double prize=sc.nextDouble();
    	System.out.println("enter description");
    	String description=sc.next();
    	int i=	jt.update("insert into MobileBean values("+no+",'"+name+"',"+ram+","+rom+",'"+os+"','"+processor+"','"+glass+"',"+front+","+back+","+imei+",'"+cmpName+"',"+prize+",'"+description+"')");
    	System.out.println(i+" records inserted...");
    	
    	System.out.println("do you want to insert one more record...yes/no");
    	String option=sc.next();
    	if(option.equals("no"))
    	{
    		break;
    	}
    }	
}
public void updateTable()
{
int i=jt.update("update MobileBean set modelName='nokia' where modelNo=1 ");
System.out.println(i);
}
public void deleteRecord()
{
int i=jt.update("delete from MobileBean where modelName='nokia'");
System.out.println(i);

}
public void printOneRecord()
{
List one= jt.queryForList("select * from MobileBean where modelNo=90");
System.err.println(one.toString());
}
public void printAllRecords()
{
	
}


}

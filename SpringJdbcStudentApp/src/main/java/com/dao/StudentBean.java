package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentBean {
	private JdbcTemplate jt;

	public StudentBean() {
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
		jt.execute("create table StudentBean(id number, name varchar2(20), email varchar2(25), mobile number(10))");
		System.out.println("table created successfully........");		
	}
	public void insertRecords()
	{
		int i=jt.update("insert into StudentBean values(11,'Bhavani','bpgujjari2001@gmail.com',9346219501)");
		jt.update("insert into StudentBean values(13,'prasd','ppgujjari2001@gmail.com',999999999)");
		jt.update("insert into StudentBean values(12,'gujjari','gujjari2001@gmail.com',88888888)");
		System.out.println(i+"--records inserted...");
	}
	public void deleteRecord()
	{
		int i=jt.update("delete from StudentBean where id=11");
		System.out.println(i+"--record deleted...");
	}
	
	public void updateRecord()
	{
		int i=jt.update("update StudentBean set name='chimtu' where id=12");
		System.out.println(i+"--record updated...");
	}
	public void printOneRecord()
	{
		
		List s1= jt.queryForList("select * from StudentBean where id=12");
		System.out.println(s1.toString());
	}

	public void printAllRecords()
	{
		List ts= jt.queryForList("select * from StudentBean");
		ts.stream()
		.forEach(i->System.out.println(i.toString()));
		
		long count=ts.stream()
			.count();
		System.out.println(count);
		
	}
}

package com.yakub;

public class EmpBean {
private int eid;
private String ename;
private String desg;
public EmpBean() {
	super();
}
public EmpBean(int eid, String ename, String desg) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.desg = desg;
}
public void print()
{
System.out.println(eid+" "+ename+" "+desg);	
}
}

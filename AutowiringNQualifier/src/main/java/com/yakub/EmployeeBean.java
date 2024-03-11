package com.yakub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {
private int eid;
private String ename;
@Autowired
@Qualifier("perminentAddr")
private AddressBean addr;

public EmployeeBean() {
	super();
}

public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public AddressBean getAddr() {
	return addr;
}
public void setAddr(AddressBean addr) {
	this.addr = addr;
}

public void print()
{
	
System.out.println(eid);
System.out.println(ename);
System.out.println(addr);
}

}

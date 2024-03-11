package com.bp2;

public class Employee {
private int eid;
private String ename;
private double esal;
private String desg;
private Address addr;
public Employee() {
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
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}


public double getEsal() {
	return esal;
}
public void setEsal(double esal) {
	this.esal = esal;
}

public void printEmployee()
{
	
System.out.println(eid+" "+ename+" "+esal+" "+desg+"  --->"+addr);

}


}

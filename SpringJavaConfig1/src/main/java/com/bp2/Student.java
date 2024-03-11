package com.bp2;

import com.bp2.Address;

public class Student {
	private int sid;
	private String sname;
	private Address addr;
	public Student() {
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", addr=" + addr + "]";
	}
	
	public void print()
	{
		System.out.println(sid+" "+sname+" "+addr);
	}
}

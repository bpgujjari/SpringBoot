package com.bp1.Spring;

public class Student {

	private int sid;
	private String sname;
	private Address addr;
	public Student() {
	}
	public Student(int sid, String sname, Address addr) {
		super();
		this.sid = sid;
		this.sname = sname;
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

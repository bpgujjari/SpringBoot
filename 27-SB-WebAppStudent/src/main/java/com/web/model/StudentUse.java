package com.web.model;

public class StudentUse {
	private int id;
	private String fname;
	private String lname;
	private int sub1;
	private int sub2;
	private int sub3;
	private double total;
	private double percentage;
	private char grade;
	public StudentUse(int id, String fname, String lname, int sub1, int sub2, int sub3, double total, double percentage,
			char grade) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.total = total;
		this.percentage = percentage;
		this.grade = grade;
	}
	public StudentUse() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentUse [id=" + id + ", fname=" + fname + ", lname=" + lname + ", sub1=" + sub1 + ", sub2=" + sub2
				+ ", sub3=" + sub3 + ", total=" + total + ", percentage=" + percentage + ", grade=" + grade + "]";
	}
	
	
	
	
	
}

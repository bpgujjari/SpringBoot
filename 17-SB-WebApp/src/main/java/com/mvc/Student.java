package com.mvc;

import java.util.List;

public class Student {
private int sid;
private String firstname;
private String lastname;
private List<String> courses;
private String gender;
private long mobile;
private int java;
private int hibernate;
private int springboot;
public Student() {
	super();
}
public Student(int sid, String firstname, String lastname, List courses, String gender, long mobile, int java,
		int hibernate, int springboot) {
	super();
	this.sid = sid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.courses = courses;
	this.gender = gender;
	this.mobile = mobile;
	this.java = java;
	this.hibernate = hibernate;
	this.springboot = springboot;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public List getCourses() {
	return courses;
}
public void setCourses(List courses) {
	this.courses = courses;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public int getJava() {
	return java;
}
public void setJava(int java) {
	this.java = java;
}
public int getHibernate() {
	return hibernate;
}
public void setHibernate(int hibernate) {
	this.hibernate = hibernate;
}
public int getSpringboot() {
	return springboot;
}
public void setSpringboot(int springboot) {
	this.springboot = springboot;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", firstname=" + firstname + ", lastname=" + lastname + ", courses=" + courses
			+ ", gender=" + gender + ", mobile=" + mobile + ", java=" + java + ", hibernate=" + hibernate
			+ ", springboot=" + springboot + "]";
}


}

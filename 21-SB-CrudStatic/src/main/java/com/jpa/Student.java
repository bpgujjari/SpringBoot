package com.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
@Id
private int sid;
@Column(name="stdName")
private String sname;
private String course;
private double fee;
public Student() {
	super();
}
public Student(int sid, String sname, String course, double fee) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.course = course;
	this.fee = fee;
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
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public double getFee() {
	return fee;
}
public void setFee(double fee) {
	this.fee = fee;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + ", fee=" + fee + "]";
}



}

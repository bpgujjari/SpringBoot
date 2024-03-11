package com.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="chimtu")
public class Employee {
@Column(name="id1")
private int empId;
@Column(name="name")
private String empName;
@Column(name="password")
private String empPassword;
@Column(name="email")
private String empEmail;
@Column(name="company")
private String empCompany;
@Column(name="designation")
private String empDesignation;
@Column(name="salary")
private double empSalary;
private long mobile;
public Employee() {
	super();
}
public Employee(int empId, String empName, String empPassword, String empEmail, String empCompany,
		String empDesignation, double empSalary, long mobile) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empPassword = empPassword;
	this.empEmail = empEmail;
	this.empCompany = empCompany;
	this.empDesignation = empDesignation;
	this.empSalary = empSalary;
	this.mobile = mobile;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpPassword() {
	return empPassword;
}
public void setEmpPassword(String empPassword) {
	this.empPassword = empPassword;
}
public String getEmpEmail() {
	return empEmail;
}
public void setEmpEmail(String empEmail) {
	this.empEmail = empEmail;
}
public String getEmpCompany() {
	return empCompany;
}
public void setEmpCompany(String empCompany) {
	this.empCompany = empCompany;
}
public String getEmpDesignation() {
	return empDesignation;
}
public void setEmpDesignation(String empDesignation) {
	this.empDesignation = empDesignation;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empPassword=" + empPassword + ", empEmail="
			+ empEmail + ", empCompany=" + empCompany + ", empDesignation=" + empDesignation + ", empSalary="
			+ empSalary + ", mobile=" + mobile + "]";
}

}

package com.mvc;

import java.util.List;

public class User {
private String name;
private String email;
private String gender;
private String password;
private String confirmPassword;
private List<String> batches;
private List<String> courses;
public User() {
	super();
}
public User(String name, String email, String gender, String password, String confirmPassword, List<String> batches,
		List<String> courses) {
	super();
	this.name = name;
	this.email = email;
	this.gender = gender;
	this.password = password;
	this.confirmPassword = confirmPassword;
	this.batches = batches;
	this.courses = courses;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}
public List<String> getBatches() {
	return batches;
}
public void setBatches(List<String> batches) {
	this.batches = batches;
}
public List<String> getCourses() {
	return courses;
}
public void setCourses(List<String> courses) {
	this.courses = courses;
}
@Override
public String toString() {
	return "User [name=" + name + ", email=" + email + ", gender=" + gender + ", password=" + password
			+ ", confirmPassword=" + confirmPassword + ", batches=" + batches + ", courses=" + courses + "]";
}

}

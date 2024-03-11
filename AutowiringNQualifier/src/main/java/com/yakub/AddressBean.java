package com.yakub;

public class AddressBean {
private int hno;
private String street;
private String city;
public AddressBean() {
	super();
}
public int getHno() {
	return hno;
}
public void setHno(int hno) {
	this.hno = hno;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "AddressBean [hno=" + hno + ", street=" + street + ", city=" + city + "]";
}




}

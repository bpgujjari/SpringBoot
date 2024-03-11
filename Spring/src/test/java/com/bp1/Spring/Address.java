package com.bp1.Spring;

public class Address {

	private int hno;
	private String city;
	private String state;
	public Address() {
	}
	public Address(int hno, String city, String state) {
		super();
		this.hno = hno;
		this.city = city;
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", state=" + state + "]";
	}
	
	
}

package com.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
@Id
private int pid;
private String pname;
private double price;
private String mfgdate;
private String expdate;
private String warrenty;
public Product() {
	super();
}
public Product(int pid, String pname, double price, String mfgdate, String expdate, String warrenty) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.price = price;
	this.mfgdate = mfgdate;
	this.expdate = expdate;
	this.warrenty = warrenty;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getMfgdate() {
	return mfgdate;
}
public void setMfgdate(String mfgdate) {
	this.mfgdate = mfgdate;
}
public String getExpdate() {
	return expdate;
}
public void setExpdate(String expdate) {
	this.expdate = expdate;
}
public String getWarrenty() {
	return warrenty;
}
public void setWarrenty(String warrenty) {
	this.warrenty = warrenty;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", mfgdate=" + mfgdate + ", expdate="
			+ expdate + ", warrenty=" + warrenty + "]";
}

}

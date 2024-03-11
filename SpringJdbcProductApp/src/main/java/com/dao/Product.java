package com.dao;

public class Product {
public Integer productId;
public String productName;
public Double price;
public Integer quantity;
public String companyName;
public Double totalAmt;
public String description;
public Product(Integer productId, String productName, Double price, Integer quantity, String companyName,
		Double totalAmt, String description) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	this.quantity = quantity;
	this.companyName = companyName;
	this.totalAmt = totalAmt;
	this.description = description;
}
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public Double getTotalAmt() {
	return totalAmt;
}
public void setTotalAmt(Double totalAmt) {
	this.totalAmt = totalAmt;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
	
}

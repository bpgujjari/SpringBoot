package com.bp2;

import java.util.List;

public class ProductBean {
private int productId;
private String productName;
private List<ModelBean>modelObjs;
public ProductBean() {
	super();
}
public ProductBean(int productId, String productName, List<ModelBean> modelObjs) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.modelObjs = modelObjs;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public List<ModelBean> getModelObjs() {
	return modelObjs;
}
public void setModelObjs(List<ModelBean> modelObjs) {
	this.modelObjs = modelObjs;
}
@Override
public String toString() {
	return "ProductBean [productId=" + productId + ", productName=" + productName + ", modelObjs=" + modelObjs + "]";
}
public void print()
{
	
System.out.println(productId);
System.out.println(productName);
System.out.println(modelObjs);
}
}

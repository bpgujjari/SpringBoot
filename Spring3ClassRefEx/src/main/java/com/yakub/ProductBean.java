package com.yakub;

public class ProductBean {
private int pId;
private String pName;
private ModelBean obj;
public ProductBean() {
	super();
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public ModelBean getObj() {
	return obj;
}
public void setObj(ModelBean obj) {
	this.obj = obj;
}

public void printData()
{
System.out.println(pId+" "+pName+"  "+obj);	


}


}

package com.yakub;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductBean {
private int pId;
private String pName;
@Autowired
private List<ModelBean> modelObjs;
public ProductBean() {
	super();
}
public ProductBean(int pId, String pName, List<ModelBean> modelObjs) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.modelObjs = modelObjs;
}
public void printData()
{
System.out.println(pId+" "+pName+"  "+modelObjs);	
}
}

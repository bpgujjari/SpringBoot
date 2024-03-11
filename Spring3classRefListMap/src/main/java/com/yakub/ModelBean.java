package com.yakub;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class ModelBean {
private int modelId;
private String modelCode;
private double modelCost;
@Autowired
private Map<Integer, String>marginObjs;
public ModelBean() {
	super();
}
public ModelBean(int modelId, String modelCode, double modelCost, Map<Integer, String> marginObjs) {
	super();
	this.modelId = modelId;
	this.modelCode = modelCode;
	this.modelCost = modelCost;
	this.marginObjs = marginObjs;
}
@Override
public String toString() {
	return "ModelBean [modelId=" + modelId + ", modelCode=" + modelCode + ", modelCost=" + modelCost + ", marginObjs="
			+ marginObjs + "]";
}

public void printData()
{
System.out.println(modelId+" "+marginObjs);	
}
}


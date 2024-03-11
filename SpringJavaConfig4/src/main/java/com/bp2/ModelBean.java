package com.bp2;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class ModelBean {
private int modelId;
private String modelCode;
private double modelCost;
private Map<Integer, MarginBean>marginObjs;
public ModelBean() {
	super();
}
public ModelBean(int modelId, String modelCode, double modelCost, Map<Integer, MarginBean> marginObjs) {
	super();
	this.modelId = modelId;
	this.modelCode = modelCode;
	this.modelCost = modelCost;
	this.marginObjs = marginObjs;
}
public int getModelId() {
	return modelId;
}
public void setModelId(int modelId) {
	this.modelId = modelId;
}
public String getModelCode() {
	return modelCode;
}
public void setModelCode(String modelCode) {
	this.modelCode = modelCode;
}
public double getModelCost() {
	return modelCost;
}
public void setModelCost(double modelCost) {
	this.modelCost = modelCost;
}
public Map<Integer, MarginBean> getMarginObjs() {
	return marginObjs;
}
public void setMarginObjs(Map<Integer, MarginBean> marginObjs) {
	this.marginObjs = marginObjs;
}
@Override
public String toString() {
	return "ModelBean [modelId=" + modelId + ", modelCode=" + modelCode + ", modelCost=" + modelCost + ", marginObjs="
			+ marginObjs + "]";
}


}

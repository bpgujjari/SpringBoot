package com.yakub;

public class ModelBean {
private int modelId;
private String modelCode;
private double modelCost;
private MarginBean mb;
public ModelBean() {
	super();
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
public MarginBean getMb() {
	return mb;
}
public void setMb(MarginBean mb) {
	this.mb = mb;
}
@Override
public String toString() {
	return "ModelBean [modelId=" + modelId + ", modelCode=" + modelCode + ", modelCost=" + modelCost + ", mb=" + mb
			+ "]";
}
}

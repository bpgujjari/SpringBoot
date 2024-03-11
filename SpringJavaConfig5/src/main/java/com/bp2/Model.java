package com.bp2;

public class Model {
private int modelId;
private String modelCode;
private double modelCost;
private Margin mgObj;
public Model() {
	super();
}
public Model(int modelId, String modelCode, double modelCost, Margin mgObj) {
	super();
	this.modelId = modelId;
	this.modelCode = modelCode;
	this.modelCost = modelCost;
	this.mgObj = mgObj;
}
@Override
public String toString() {
	return "Model [modelId=" + modelId + ", modelCode=" + modelCode + ", modelCost=" + modelCost + ", mgObj=" + mgObj
			+ "]";
}

}

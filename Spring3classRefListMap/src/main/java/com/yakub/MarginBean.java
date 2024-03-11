package com.yakub;

public class MarginBean {
private int mrgId;
private String mrgCode;
public MarginBean() {
	super();
}
public MarginBean(int mrgId, String mrgCode) {
	super();
	this.mrgId = mrgId;
	this.mrgCode = mrgCode;
}
@Override
public String toString() {
	return "MarginBean [mrgId=" + mrgId + ", mrgCode=" + mrgCode + "]";
}
}

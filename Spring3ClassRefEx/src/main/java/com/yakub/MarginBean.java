package com.yakub;

public class MarginBean {
private int mrgId;
private String mrgCode;
public MarginBean() {
	super();
}
public int getMrgId() {
	return mrgId;
}
public void setMrgId(int mrgId) {
	this.mrgId = mrgId;
}
public String getMrgCode() {
	return mrgCode;
}
public void setMrgCode(String mrgCode) {
	this.mrgCode = mrgCode;
}
@Override
public String toString() {
	return "MarginBean [mrgId=" + mrgId + ", mrgCode=" + mrgCode + "]";
}
}

package com.bp2;

public class Margin {
private int  mrgId;
private String mrgCode;
public Margin() {
}
public Margin(int mrgId, String mrgCode) {
	super();
	this.mrgId = mrgId;
	this.mrgCode = mrgCode;
}
@Override
public String toString() {
	return "Margin [mrgId=" + mrgId + ", mrgCode=" + mrgCode + "]";
}
}

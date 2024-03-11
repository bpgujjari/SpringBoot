package com.bp2;

public class Product {
private int proId;
private String proName;
private Model mobj;
public Product() {
}
public Product(int proId, String proName, Model mobj) {
	super();
	this.proId = proId;
	this.proName = proName;
	this.mobj = mobj;
}

public void print()
{
System.out.println(proId);
System.out.println(proName);
System.out.println(mobj);

}



}

package com.bp2;

public class Consume {
private int cid;
private String cname;
private int current_reading;
private int previous_reading;


public Consume() {
	super();
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getCurrent_reading() {
	return current_reading;
}
public void setCurrent_reading(int current_reading) {
	this.current_reading = current_reading;
}
public int getPrevious_reading() {
	return previous_reading;
}
public void setPrevious_reading(int previous_reading) {
	this.previous_reading = previous_reading;
}



public void printBill()
{
	int units=current_reading-previous_reading;
	double total;
	
	if(units<300)
	{
		total=units*1.75;
		
	}
	
	else if(units>=300&&units<500)
	{
		total=units*2.75;
		
	}
	else
	{
		total=units*5.25;

	}
	
	
	System.out.println("Cid--->"+cid);
	System.out.println("Cousumer name-->"+cname);
	System.out.println("current reading-->"+current_reading);
	System.out.println("previous reading-->"+previous_reading);
	System.out.println("units--->"+units);
	System.out.println("total bill-->"+total);
	
	

}

}

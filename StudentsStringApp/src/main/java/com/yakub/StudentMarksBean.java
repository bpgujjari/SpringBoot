package com.yakub;

public class StudentMarksBean {
private int sid;
private String fname;
private String lname;
private int sub1;
private int sub2;
private int sub3;
public StudentMarksBean() {
	super();
}
public StudentMarksBean(int sid, String fname, String lname, int sub1, int sub2, int sub3) {
	super();
	this.sid = sid;
	this.fname = fname;
	this.lname = lname;
	this.sub1 = sub1;
	this.sub2 = sub2;
	this.sub3 = sub3;
}

public void print()
{
	int total;
	double average;
	char grade;
	
	total=sub1+sub2+sub3;
	average=total/3;
	
	
	if (average>=70) {
		grade='A';	
	}
	else if (average>=60) {
		grade='B';	
	}
	else if (average>=50) {
		grade='C';	
	}
	else
	{
		grade='F';
	}
	
	
	
	System.out.println("sid-->"+sid);
	System.out.println("FullName-->"+fname+lname);
	System.out.println("sub1-->"+sub1);
	System.out.println("sub2-->"+sub2);
	System.out.println("sub3-->"+sub3);
	System.out.println("Total-->"+total);
	System.out.println("Average-->"+average);
	System.out.println("Grade-->"+grade+" grade");
	
	

}




}

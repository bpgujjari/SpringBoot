package com.yakub;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
@Controller
public class Employee {
private int eid;
private String ename;
public Employee() {
}

@Value("101")
public void setEid(int eid) {
	this.eid = eid;
}
@Value("Chimtu")
public void setEname(String ename) {
	this.ename = ename;
}
public void printEmp()
{
System.out.println(eid);
System.out.println(ename);

}

}

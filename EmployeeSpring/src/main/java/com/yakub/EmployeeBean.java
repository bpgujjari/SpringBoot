package com.yakub;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeBean {
private Integer empid;
private List<Integer> empProjects;
private Map<String, Integer> empMap;

public EmployeeBean() {
	super();
}
public EmployeeBean(int empid, List<Integer> empProjects, Map<String, Integer> empMap) {
	this.empid = empid;
	this.empProjects = empProjects;
	this.empMap = empMap;
}

public void printEmpId()
{
System.out.println("Employee id--->"+empid);	
}
public void printList()
{
	
System.out.print("List of projects");
                    List<Object> projects =  empProjects.stream()
                     .collect(Collectors.toList());
                    System.out.println(projects);
}
public void printMap()
{
System.out.print("Number of projects with company name:");

for(Map.Entry<String, Integer> entry :empMap.entrySet()) {
	String key=entry.getKey();
	Integer value=entry.getValue();
	System.out.print(key+" : "+value+", ");

}
}
}


package com.bp2;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Student {
private Set<Integer>ids;
private List<String> names;
private Map<String,Integer>marks;


public Student() {
}
public List<String> getNames() {
	return names;
}
public void setNames(List<String> names) {
	this.names = names;
}
public Set<Integer> getIds() {
	return ids;
}
public void setIds(Set<Integer> ids) {
	this.ids = ids;
}
public Map<String, Integer> getMarks() {
	return marks;
}
public void setMarks(Map<String, Integer> marks) {
	this.marks = marks;
}


@Override
public String toString() {
	return "Student [names=" + names + ", ids=" + ids + ", marks=" + marks + "]";
}
public void printStudent()
{
	names.forEach(i->System.out.println(i));
	
	
	ids.forEach(i->System.out.println(i));
	
	Set<Entry<String, Integer>> entries=marks.entrySet();
	
	for(Map.Entry<String, Integer> entry:entries)
	{
		System.out.println(entry.getKey()+" --->"+entry.getValue());
	}


}


}

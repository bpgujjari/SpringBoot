package com.yakub;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.function.Consumer;

public class SathyaCollegeBean {
private List<String> stdNames;
private Set<Integer> stdRoll;
private Map<String, Integer> branchDetails;
private Properties branchInfo;
public SathyaCollegeBean() {
	
}
public List<String> getStdNames() {
	return stdNames;
}
public void setStdNames(List<String> stdNames) {
	this.stdNames = stdNames;
}
public Set<Integer> getStdRoll() {
	return stdRoll;
}
public void setStdRoll(Set<Integer> stdRoll) {
	this.stdRoll = stdRoll;
}
public Map<String, Integer> getBranchDetails() {
	return branchDetails;
}
public void setBranchDetails(Map<String, Integer> branchDetails) {
	this.branchDetails = branchDetails;
}
public Properties getBranchInfo() {
	return branchInfo;
}
public void setBranchInfo(Properties branchInfo) {
	this.branchInfo = branchInfo;
}

public void stdNames()
{
stdNames.stream()
.forEach(i->System.out.println(i));

}

public void stdRollno()
{
stdRoll.stream()
.forEach(i->System.out.println(i));

}
/*
 * public void branchdtls() { branchDetails.entrySet() .forEach((Consumer<?
 * super Entry<String, Integer>>) branchDetails.keySet()); }
 * 
 * public void branchinfo() { branchInfo.stringPropertyNames()
 * .forEach(i->System.out.println(i));
 * 
 * branchInfo.values() .forEach(i->System.out.println(i)); }
 */

public void branchdtls()
{
	for(Map.Entry<String, Integer> entry :branchDetails.entrySet()) {
		String key=entry.getKey();
		Integer value=entry.getValue();
		System.out.println(key+"  "+value);
	}
}


public void branchInfos()
{
	
Set<String> keys=branchInfo.stringPropertyNames();
for(String key:keys)
{
System.out.println(key+"--->"+branchInfo.getProperty(key));	
}



}
}

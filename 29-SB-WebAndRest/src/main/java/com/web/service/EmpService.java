package com.web.service;

import java.util.List;

import com.web.model.Employee;

public interface EmpService {
public Employee saveUser(Employee employee);
public List<Employee> viewAll();
public void deleteEmp(Integer id);
public Employee getOne(Integer id);
public Employee editEmp(Employee employee);


}

package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Employee;
import com.web.repo.EmpRepo;
@Service
public class EmpServiceImp  implements EmpService {

	@Autowired
	private EmpRepo repo;
	@Override
	public Employee saveUser(Employee employee) {
		if(employee.getDesg().equalsIgnoreCase("ceo")&&employee.getManager().equalsIgnoreCase("R1-101"))
		{
			employee.setManager("no reporting emp");
			return repo.save(employee);
		}
		
		else if(employee.getDesg().equalsIgnoreCase("projectManager"))
			{
			repo.findById()
			employee.setManager();
			return repo.save(employee);
		}
		
		else
		return repo.save(employee);

	}
	@Override
	public List<Employee> viewAll() {		
		return repo.findAll();
	}
	@Override
	public void deleteEmp(Integer id) {
		repo.deleteById(id);
	}
	@Override
	public Employee getOne(Integer  id) {
		return repo.findById(id).get();
	}
	@Override
	public Employee editEmp(Employee employee) {
		if(employee.getManager().equals("R1-101"))
		{
			employee.setManager("no Reporting Employee");
			return repo.save(employee);
		}
		else if(employee.getManager().equals("R1-102"))
		{
			employee.setManager("abc");
			return repo.save(employee);
		}
		else if(employee.getManager().equals("R1-103"))
		{
			employee.setManager("abcd");
			return repo.save(employee);
		}
		
		
		
		else
		return repo.save(employee);
		}
	}


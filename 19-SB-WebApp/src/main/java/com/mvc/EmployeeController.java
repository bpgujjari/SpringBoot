package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@RequestMapping("/")
	public String home(ModelMap model)
	{
		Employee employee= new Employee();
		model.put("employee", employee);
		return "employee";
	}
	@RequestMapping("/printEmployee")
	public String printEmployee(@ModelAttribute Employee employee,ModelMap model)
	{
		model.put("employeee", employee);
		
		double ta=0.0,da=0.0,hra=0.0,pf=0.0,gross_salary=0.0,net_salary=0.0;
		
		if(employee.getSalary()<30000)
		{
			ta=(employee.getSalary()*7)/100;
			da=(employee.getSalary()*9)/100;
			hra=(employee.getSalary()*11)/100;
			pf=(employee.getSalary()*15)/100;			
		}
		else if(employee.getSalary()>30000&&employee.getSalary()<50000)
		{
			ta=(employee.getSalary()*12)/100;
			da=(employee.getSalary()*13)/100;
			hra=(employee.getSalary()*17)/100;
			pf=(employee.getSalary()*22)/100;			
		}
		else if(employee.getSalary()>50000)
		{
			ta=(employee.getSalary()*17)/100;
			da=(employee.getSalary()*19)/100;
			hra=(employee.getSalary()*21)/100;
			pf=(employee.getSalary()*25)/100;			
		}
		
		gross_salary=employee.getSalary()+ta+da+hra;
		net_salary=gross_salary-pf;
		
		model.put("ta", ta);
		model.put("da", da);
		model.put("hra", hra);
		model.put("pf", pf);
		model.put("gross", gross_salary);
		model.put("net", net_salary);
		
	return "result";
	}
	
}

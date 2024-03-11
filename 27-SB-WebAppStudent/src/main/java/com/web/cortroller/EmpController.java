package com.web.cortroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.web.model.EmpTemp;
import com.web.model.Employee;
import com.web.service.EmpService;


@Controller
public class EmpController {
	
	@Autowired
	private EmpService serv;
	
	@RequestMapping("/empreg")
	public String empRegPage(ModelMap model,EmpTemp emptemp)
	{
		model.put("emptemp", emptemp);
		return "empreg";
	}
	
	@RequestMapping("/empregister")
	public String empRegst(@ModelAttribute EmpTemp emptemp,ModelMap model)
	{	serv.empReg(emptemp);
		return "empregSuccess";
	}
	@RequestMapping("/emploginpage")
	public String empLoginPage(ModelMap model,Employee emp)
	{	model.put("emp", emp);
		return "emplogin";
	}
	@RequestMapping("/emplogin")
	public String empLogin(@ModelAttribute Employee emp,ModelMap model)
	{	
		Employee e=serv.empLogin(emp);
		if(e==null)
		{
			return "loginfail";
		}
		else
		return "loginSuccess";	
	}
	
	
	@RequestMapping("/viewCust")
	public String viewAll(ModelMap model)
	{
		model.put("cs", serv.getAllCust());
		return "viewAll";
	}
	
	
	
}

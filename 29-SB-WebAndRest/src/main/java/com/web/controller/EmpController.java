package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Employee;
import com.web.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService serv;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/addEmp")
	public String regPage(ModelMap model)
	{
		Employee emp=new Employee();
		model.put("emp", emp);
		values(model);
		return "reg";
	}
	@RequestMapping("/register")
	public String regEmp(@ModelAttribute Employee emp,ModelMap model)
	{
		serv.saveUser(emp);
		return "success";
	}
	
	
	@RequestMapping("/viewEmp")
	public String viewEMp(ModelMap model)
	{
		model.addAttribute("employees", serv.viewAll());
		return "view";
	}
	
	@RequestMapping("/delete/{id}")
	public String delectEmp(@PathVariable int id)
	{
		serv.deleteEmp(id);
		return "redirect:/view";
	}
	
	@RequestMapping("/editEmp/{id}")
	public String editPage(@PathVariable int id,ModelMap model)
	{
		model.put("emp", serv.getOne(id));
		values(model);
		return "edit";
	}
	
	@RequestMapping("/editEmp1")
	public String editEmp(@ModelAttribute Employee emp,ModelMap model)
	{
		serv.editEmp(emp);
		return "redirect:/view";
		
	}
	
	
	
	
	
	
	
	public void values(ModelMap model)
	{
		List<String> desg=List.of("ceo","projectManager","teamLeader");
		List<String> qual=List.of("mba","mtech","btech");
		model.addAttribute("qual",qual);
		model.addAttribute("desg",desg);
	}
}

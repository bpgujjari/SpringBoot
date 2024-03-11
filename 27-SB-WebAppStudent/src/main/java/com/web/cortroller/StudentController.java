package com.web.cortroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.Student;
import com.web.model.StudentUse;
import com.web.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/addstudent")
	public String regPage(ModelMap model, StudentUse student)
	{	model.put("student", student);
		return "reg";
	}
	
	
	@RequestMapping("/register")
	public String savePage(ModelMap model, StudentUse student)
	{	service.saveStudent(student);
		return "success";
	}
	
	@RequestMapping("/viewstudent")
	public String viewPage(ModelMap model)
	{
		model.put("students", service.getAllStudents());
		return "view";
	}
	
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		service.deleteStudent(id);
		return "redirect:/viewstudent";
	}
	
	@RequestMapping("/edit/{id}")
	public String edit(@PathVariable int id,ModelMap model)
	{
		model.addAttribute("command", service.getStudent(id));
		return "edit";
	}
	
	@RequestMapping("/edit1")
	public String editPage(ModelMap model, Student student)
	{
		service.updateStudent(student);
		return "redirect:/viewstudent";
	}
	
	
	
	
	
	
}

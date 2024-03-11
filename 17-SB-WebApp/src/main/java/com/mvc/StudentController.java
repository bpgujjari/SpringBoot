package com.mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping("/")
	public String home(ModelMap model)
	{
		Student student =new Student();
		model.put("student", student);
		formValues(model);
		return "student";
	}
	@RequestMapping("/printStudent")
	public String printStudent(@ModelAttribute Student student,ModelMap model)
	{
		model.put("students", student);
		String fullname=student.getFirstname()+student.getLastname();
		
		double total=0.0,percentage=0.0;
		char grade='Z';
		
		total=student.getJava()+student.getHibernate()+student.getSpringboot();
		percentage=total/3;
		if(percentage>=70)
		{
			grade='A';
		}
		else if(percentage>60)
		{
			grade='B';

		}
		else if(percentage>50)
		{
			grade='C';

		}
		else
		{
			grade='F';
		}
		
		model.put("fullname", fullname);
		model.put("total", total);
		model.put("percentage",percentage);
		model.put("grade", grade);
		
		return "result";
	}
	
	private void formValues(ModelMap model)
	{
		List<String>courses=new ArrayList<>();
		courses.add("java");
		courses.add("spring");
		courses.add("springBoot");
		model.addAttribute("courses",courses);

		List<String>gender=new ArrayList<>();
		gender.add("male");
		gender.add("female");
		model.addAttribute("gender",gender);
	
	}
	
	
}

package com.mvc;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/")
	public String home(ModelMap model)
	{
		User user= new User();
		model.put("user", user);
		formValues(model);
		return "user";
	}
	@RequestMapping("/printUser")
	public String printUser(@ModelAttribute User user,ModelMap model)
	{
		
		model.put("users", user);
		return "result";
	}
	
	private void formValues(ModelMap model)
	{
		
		List<String>gender=Arrays.asList("male","female","hemanth");
		model.addAttribute("gender",gender);
		
		List<String>courses=Arrays.asList("java","hibernate","spring","springboot","reactjs");
		model.addAttribute("courses", courses);
		
		List<String>batches=Arrays.asList("morning","evening");
		model.addAttribute("batches",batches);
	}
	
	
}

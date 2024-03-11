package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping("/")
	public String homePage()
	{
		
		return "name";
	}
	@RequestMapping("/result")
	public String printFullName(@RequestParam String fname,@RequestParam String lname,ModelMap model)
	{
		model.put("k1",fname);
		model.put("k2",lname);
		String fullName=fname+" "+lname;
		model.put("k3", fullName);
		
		return "result";
	}

}

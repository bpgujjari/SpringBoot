package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping("/")
	public String viewPage()
	{
		
		return "login";
	}
	
	@RequestMapping("/result")
	public String printBiggest(@RequestParam String name,@RequestParam String password, ModelMap model)
	{
		String res=null;
		
		if(name.equalsIgnoreCase("bhavani")&&password.equals("bhavani@123"))
		{
			res="Login successful..";
		}		
		else {
			res=" login failed try with valid data..";

		}
		
		
		model.put("k1", name);
		model.put("k2", password);
		model.put("k3", res);
		
		return "result";
	}


}

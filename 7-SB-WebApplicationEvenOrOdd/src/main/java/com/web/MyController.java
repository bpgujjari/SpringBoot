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
		
		return "number";
	}
	@RequestMapping("/result")
	public String evenOrOdd(@RequestParam Integer number1,ModelMap model)
	{
		String status=null;
		if(number1%2==0)
		{
			status="--Even";			
		}
		else
		{
			status="--Odd";
		}
		model.put("number", status);

		return "result";
	}

}

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
		
		return "numbers";
	}
	
	@RequestMapping("/result")
	public String printBiggest(@RequestParam int num1,@RequestParam int num2,@RequestParam int num3,ModelMap model)
	{
		int biggest=0;
		
		if(num1>num2&&num1>num3)
		{
			biggest=num1;
		}
		else if(num2>num1&&num2>num3)
		{
			biggest=num2;
		}
		else {
			biggest=num3;
		}
		
		model.put("num1",num1);
		model.put("num2",num2);
		model.put("num3",num3);
		model.put("biggest",biggest);

		
		return "result";
	}


}

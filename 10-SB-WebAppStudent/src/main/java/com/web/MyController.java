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
		
		return "students";
	}
	
	@RequestMapping("/result")
	public String printBiggest(@RequestParam int sid,@RequestParam String fname,@RequestParam String lname,@RequestParam int java,@RequestParam int hibernate,@RequestParam int springBoot, ModelMap model)
	{
		String fullName=fname+" "+lname;
		int total=java+hibernate+springBoot;
		double average=total/3;
		
		char grade='z';
		
		if(average>=70)
		{
			grade='A';
		}
		else if(average>=60)
		{
			grade='B';
		}
		else if(average>=50)
		{
			grade='C';
		}
		else
		{
			grade='F';
		}

		
		model.put("sid", sid);
		model.put("fullname", fullName);
		model.put("java", java);
		model.put("hibernate", hibernate);
		model.put("springBoot", springBoot);
		model.put("total", total);
		model.put("average", average);
		model.put("grade", grade);
		
		return "result";
	}


}

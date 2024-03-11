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
		
		return "consumer";
	}
	
	@RequestMapping("/result")
	public String printBiggest(@RequestParam int cid,@RequestParam String name,@RequestParam int c_reading,@RequestParam int p_reading, ModelMap model)
	{
		int units=c_reading-p_reading;
		double rateOfUnit=0;
		
		if(units<300)
		{
			rateOfUnit=2.25;
		}
		else if(units<500)
		{
			rateOfUnit=5.25;
		}
		else
		{
			rateOfUnit=9.25;
		}
		
		double total=units*rateOfUnit;
		
		model.put("cid", cid);
		model.put("name", name);
		model.put("c_reading", c_reading);
		model.put("p_reading", p_reading);
		model.put("units", units);
		model.put("total", total);
				
		return "result";
	}


}

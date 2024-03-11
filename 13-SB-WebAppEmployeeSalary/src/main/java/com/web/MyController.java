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
		
		return "employee";
	}
	
	@RequestMapping("/result")
	public String printBiggest(@RequestParam int id,@RequestParam String name,@RequestParam double salary, ModelMap model)
	{
		double ta = 0;
		double da=0;
		double hra=0;
		double pf=0;
		
		if(salary<30000)
		{
			ta=(7*salary)/100;
			da=(9*salary)/100;
			hra=(11*salary)/100;
			pf=(15*salary)/100;
		}
		
		else if(salary>=30000&&salary<50000)
		{
			ta=(12*salary)/100;
			da=(13*salary)/100;
			hra=(17*salary)/100;
			pf=(22*salary)/100;
		}
		else if(salary>50000)
		{
			ta=(17*salary)/100;
			da=(19*salary)/100;
			hra=(21*salary)/100;
			pf=(25*salary)/100;
		}
		
		double gross=ta+da+hra+pf;
		double net=salary+gross;
		
		
		model.put("k1", id);
		model.put("k2", name);
		model.put("k3", salary);
		model.put("k4", ta);
		model.put("k5", da);
		model.put("k6", hra);
		model.put("k7", pf);
		model.put("k8", gross);
		model.put("k9", net);




		
		





				
		return "result";
	}


}

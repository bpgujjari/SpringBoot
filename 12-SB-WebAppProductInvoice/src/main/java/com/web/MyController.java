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
		
		return "product";
	}
	
	@RequestMapping("/result")
	public String printBiggest(@RequestParam int cid,@RequestParam String name,@RequestParam long mobile,@RequestParam String prodName,@RequestParam double price,@RequestParam int quantity, ModelMap model)
	{
		double total1=price*quantity;
		double gst=(total1*18)/100;
		double total2=total1+gst;
		
		int discount=0;
		
		if(total2<2500)
		{
			discount=10;
		}
		else if(total2>=2500&& total2<5000)
		{
			discount=15;
		}
		else if(total2>=5000)
		{
			discount=30;
		}
		
		double disc_amt=(total2*discount)/100;
		double invoise=(total2-disc_amt);
		
		
		model.put("k1", cid);
		model.put("k2", name);
		model.put("k3", mobile);
		model.put("k4", prodName);
		model.put("k5", price);
		model.put("k6", quantity);
		model.put("k7", total1);
		model.put("k8", disc_amt);
		model.put("k9", gst);
		model.put("k10", invoise);


		





				
		return "result";
	}


}

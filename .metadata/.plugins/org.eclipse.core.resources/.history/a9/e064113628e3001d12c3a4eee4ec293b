package com.web.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.web.model.User;
import com.web.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/add")
	public String userReg(ModelMap model )
	{	User user=new User();
		formValues(model);

		model.addAttribute("user", user);

		return "reg";
	}	
	@RequestMapping("/register")
	public String userSave(@ModelAttribute User user, Model model)
	{	
		User us=service.saveUser(user);
		return "success";
	}
	@RequestMapping("/view")
	public String getAllUsers(Model model)
	{
		model.addAttribute("users", service.getAll());
		return "view";
	}
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id)
	{
		service.deleteUser(id);
		return "redirect:/view";
	}
	
	@RequestMapping(value="/edit/{id}",method = RequestMethod.GET)
	public String edituu(@PathVariable int id, ModelMap model)
	{
		model.put("command",service.getUser(id));
		formValues(model);
		return "edit";
	}
	
	
	@RequestMapping("/edituser2")
	public String editUser(@ModelAttribute User user,ModelMap model)
	{
		service.updateUser(user);
		return "redirect:/view";
	}
	
	
	public void formValues(ModelMap model)
	{
		List<String>genders=Arrays.asList("male","female","others");
		model.addAttribute("genders", genders);
	}

	
	
}

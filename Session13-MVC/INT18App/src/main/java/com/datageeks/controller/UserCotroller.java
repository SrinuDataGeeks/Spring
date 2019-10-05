package com.datageeks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserCotroller {
	
	@RequestMapping(path = "/userPage",method = RequestMethod.GET)
	public String loadUserPage(ModelMap map)
	{
		UserBean user = new UserBean();
		user.setUsername("Srinu");
		
		map.put("userBean", user);
		
		return "user";
	}
	
	@RequestMapping(path = "/processuser",method = RequestMethod.POST)
	public String process(ModelMap map,@ModelAttribute UserBean userBean)
	{
		
		map.put("userBean", userBean);
		return "success";
	}
}

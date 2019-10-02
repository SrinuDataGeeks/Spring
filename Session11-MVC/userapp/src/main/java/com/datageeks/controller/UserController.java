package com.datageeks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@RequestMapping(path = "/userPage",method =RequestMethod.GET)
	public String getUserPage(ModelMap map)
	{
		UserBean user = new   UserBean();
		user.setUsername("NARESH");
		map.put("userBean",user);
		return "user";
	}
		
	@RequestMapping(path = "/processUser",method =RequestMethod.POST)
	public String process(ModelMap map, @ModelAttribute UserBean user)
	{
		if(user.getUsername().isEmpty())
		{
			map.put("usernameReq", "UserName is requested");
			return "user";
		}
		map.put("userBean", user);
		return "success";
	}

}

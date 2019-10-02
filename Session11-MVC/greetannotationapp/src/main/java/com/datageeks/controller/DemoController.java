package com.datageeks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController{

		
	@RequestMapping(path = "/greet" , method = RequestMethod.GET)
	public String processGreet(ModelMap map)
	{
		map.put("message", "From Greet: Welcome to Spring Annotations");
		return "success";
	}
	
	@RequestMapping(path = "/msg" , method = RequestMethod.GET)
	public String processMessage(ModelMap map)
	{
		map.put("message", "From Msg: Welcome to Spring Annotations");
		return "success";
	}
	
	@RequestMapping(path = "/wish" , method = RequestMethod.GET)
	public String processWish(ModelMap map)
	{
		map.put("message", "From Wish: Welcome to Spring Annotations");
		return "success";
	}
	
}

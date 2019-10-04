package com.datageeks.controller;

import java.util.Arrays;
import java.util.List;

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
		user.setQly(new String[]{"B.Tech","M.Tech"});
		user.setGender("Male");
		user.setCountry("INDIA");
		
		map.put("userBean", user);
		
		return "user";
	}
	
	@RequestMapping(path = "/processuser",method = RequestMethod.POST)
	public String process(ModelMap map,@ModelAttribute UserBean userBean)
	{
		String[] qlyArr = userBean.getQly();
		List<String> qlyList = Arrays.asList(qlyArr);
		map.put("userBean", userBean);
		map.put("qlyList", qlyList);
		return "success";
	}
}

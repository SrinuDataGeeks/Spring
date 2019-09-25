package com.datageeks.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "singleton")
public class StateBean {
	
	
	public void getStateInfo()
	{
		System.out.println(" From StateBean :: Welcome to Telangana");
	}

}

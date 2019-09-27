package com.datageeks.dao;

import org.springframework.stereotype.Component;

@Component
public class RegularEmployee implements Employee {
	
	@Override
	public void getInfo() {
System.out.println(" Implementation From RegularEmployee");		
	}

}

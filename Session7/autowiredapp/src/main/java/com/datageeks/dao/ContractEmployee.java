package com.datageeks.dao;

import org.springframework.stereotype.Component;

@Component
public class ContractEmployee implements Employee {

	@Override
	public void getInfo() {
System.out.println(" Implementation From ContractEmployee");		
	}

}

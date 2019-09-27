package com.datageeks.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	
	@Autowired
	@Qualifier("contractEmployee")
	private Employee contractEmployee = null;
	
	
	
	public void getInfo()
	{
		contractEmployee.getInfo();
	}

}

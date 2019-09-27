package com.datageeks.dao;

public class EmployeeDAO {
	
	private Employee contractEmployee = null;
	
		
	
	
	public void setContractEmployee(Employee contractEmployee) {
		this.contractEmployee = contractEmployee;
	}




	public void getInfo()
	{
		contractEmployee.getInfo();
	}

}

package com.datageeks.dao;

import java.io.Serializable;
import java.util.Map;

public class EmployeeBean implements Serializable {

	private Integer emp_Id = null;
	private String emp_Name = null;
	private Float emp_Sal = null;

	public EmployeeBean() {
	}

	public EmployeeBean(Integer emp_Id, String emp_Name, Float emp_Sal) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Sal = emp_Sal;
	}

	public Integer getEmp_Id() {
		return emp_Id;
	}

	public void setEmp_Id(Integer emp_Id) {
		this.emp_Id = emp_Id;
	}

	public String getEmp_Name() {
		return emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}

	public Float getEmp_Sal() {
		return emp_Sal;
	}

	public void setEmp_Sal(Float emp_Sal) {
		this.emp_Sal = emp_Sal;
	}

	public static EmployeeBean getEmpFromMap(Map<String, Object> rowMap)
	{
		EmployeeBean emp = null;
		
			if(rowMap != null)
			{
				
			Integer empNo =	Integer.valueOf(rowMap.get("EMP_ID").toString());
			String empName = rowMap.get("EMP_Name").toString();
			Float empSal = Float.valueOf(rowMap.get("EMP_Sal").toString());
			emp = new EmployeeBean(empNo, empName, empSal);
			}
			
			return emp;
	}
	@Override
	public String toString() {
		return "EmployeeBean [emp_Id=" + emp_Id + ", emp_Name=" + emp_Name + ", emp_Sal=" + emp_Sal + "]";
	}
	
		
}

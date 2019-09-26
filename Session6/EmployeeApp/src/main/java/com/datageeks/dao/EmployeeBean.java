package com.datageeks.dao;

import java.io.Serializable;

public class EmployeeBean implements Serializable {
	
	private Integer empNo = null;
	private String empName = null;
	private Float empSal = null;
	
	public EmployeeBean() {
	}
	
	
	public EmployeeBean(Integer empNo, String empName, Float empSal) {
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
	}


	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Float empSal) {
		this.empSal = empSal;
	}
	
	

}

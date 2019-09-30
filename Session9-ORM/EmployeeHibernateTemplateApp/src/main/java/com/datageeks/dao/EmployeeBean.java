package com.datageeks.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class EmployeeBean implements Serializable {	
		
	@Id
	@Column(name="EMP_ID")
	private Integer empNo = null;
	
	@Column(name="EMP_NAME")
	private String empName = null;
	
	@Column(name="EMP_SAL")
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


	@Override
	public String toString() {
		return "EmployeeBean [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	

}

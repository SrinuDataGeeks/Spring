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
	@Column(name = "EMP_ID")
	private Integer id = null;
	
	@Column(name = "EMP_NAME")
	private String name = null;
	
	@Column(name = "EMP_SAL")
	private Float salary = null;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	

}

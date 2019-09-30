package com.datageeks.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate = null;

	public EmployeeBean get(Integer empId) {
		return hibernateTemplate.get(EmployeeBean.class, empId);
	}

	public List<EmployeeBean> getAll() {
		return (List<EmployeeBean>) hibernateTemplate.find("Select emp From EmployeeBean as emp");
	}

}

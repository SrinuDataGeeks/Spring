package com.datageeks.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate = null;

	public String getEmpNameById(Integer empId) {
		return jdbcTemplate.queryForObject("Select EMP_NAME From EMPLOYEE Where EMP_ID = ?", String.class, empId);
	}

	public EmployeeBean getEmpById(Integer empId) {
		Map<String, Object> rowMap = jdbcTemplate
				.queryForMap("Select EMP_ID,EMP_NAME,EMP_SAL From EMPLOYEE Where EMP_ID = ?", empId);

		return EmployeeBean.getEmpFromMap(rowMap);
	}

	public List<EmployeeBean> getAll() {
		List<Map<String, Object>> mapList = jdbcTemplate.queryForList("Select EMP_ID,EMP_NAME,EMP_SAL From EMPLOYEE ");

		List<EmployeeBean> empList = new ArrayList<EmployeeBean>();

		for (Map<String, Object> rowMap : mapList) {
			EmployeeBean emp = EmployeeBean.getEmpFromMap(rowMap);
			empList.add(emp);
		}

		return empList;
	}
	
	public Integer getMax() {
		
		return jdbcTemplate.queryForObject("Select Max(Emp_ID) From Employee",Integer.class);
		
	}

}

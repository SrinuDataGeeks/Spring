package com.datageeks.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate = null;

	public void save(EmployeeBean employeeBean) {
		jdbcTemplate.update(
				"Insert Into Employee(EMP_ID,EMP_NAME,EMP_SAL) values(?,?,?)", 
				employeeBean.getEmpNo(),
				employeeBean.getEmpName(), 
				employeeBean.getEmpSal()
				);
	}
	
	
	public Integer delete(Integer empId) {
		
		return jdbcTemplate.update("Delete From Employee Where EMP_ID = ?", empId);
	}
	
	
	public EmployeeBean update(EmployeeBean employeeBean) {
		jdbcTemplate.update(
				"UPDATE Employee SET EMP_NAME = ? ,EMP_SAL = ? Where EMP_ID = ?", 
				employeeBean.getEmpName(), 
				employeeBean.getEmpSal(),
				employeeBean.getEmpNo()
				);
		return employeeBean;
	}
	
	
	public void save2(EmployeeBean employeeBean) {
		
		PreparedStatementCreator psc = new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement ps = con.prepareStatement("Insert Into Employee(EMP_ID,EMP_NAME,EMP_SAL) values(?,?,?)");
				ps.setInt(1, employeeBean.getEmpNo());
				ps.setString(2, employeeBean.getEmpName());
				ps.setFloat(3, employeeBean.getEmpSal());
				return ps;
			}
		};
		
		jdbcTemplate.update(psc);
	}
	
	
public void save3(EmployeeBean employeeBean) {
		
		PreparedStatementSetter pss = new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, employeeBean.getEmpNo());
				ps.setString(2, employeeBean.getEmpName());
				ps.setFloat(3, employeeBean.getEmpSal());
			}
		};
		jdbcTemplate.update("Insert Into Employee(EMP_ID,EMP_NAME,EMP_SAL) values(?,?,?)",pss);
	}

}

package com.datageeks.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate = null;

	public List<EmployeeBean> getAllResultSetExtractor() {

		ResultSetExtractor<List<EmployeeBean>> rse = new ResultSetExtractor<List<EmployeeBean>>() {

			@Override
			public List<EmployeeBean> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<EmployeeBean> empList = new ArrayList<EmployeeBean>();
				while (rs.next()) {
					EmployeeBean emp = new EmployeeBean();
					emp.setEmpNo(rs.getInt("EMP_ID"));
					emp.setEmpName(rs.getString("EMP_NAME"));
					emp.setEmpSal(rs.getFloat("EMP_SAL"));
					empList.add(emp);
				}
				return empList;
			}
		};

		List<EmployeeBean> list = jdbcTemplate.query("Select EMP_ID,EMP_NAME,EMP_SAL From Employee", rse);
		return list;
	}

	public List<EmployeeBean> getAllRowCallbackHandler() {
		List<EmployeeBean> empList = new ArrayList<EmployeeBean>();

		RowCallbackHandler rch = new RowCallbackHandler() {

			@Override
			public void processRow(ResultSet rs) throws SQLException {

				EmployeeBean emp = new EmployeeBean();
				emp.setEmpNo(rs.getInt("EMP_ID"));
				emp.setEmpName(rs.getString("EMP_NAME"));
				emp.setEmpSal(rs.getFloat("EMP_SAL"));
				empList.add(emp);
			}
		};

		jdbcTemplate.query("Select EMP_ID,EMP_NAME,EMP_SAL From Employee", rch);

		return empList;
	}

	public List<EmployeeBean> getAllRowMapper() {

		RowMapper<EmployeeBean> rowMapper = new RowMapper<EmployeeBean>() {

			@Override
			public EmployeeBean mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeBean emp = new EmployeeBean();
				emp.setEmpNo(rs.getInt("EMP_ID"));
				emp.setEmpName(rs.getString("EMP_NAME"));
				emp.setEmpSal(rs.getFloat("EMP_SAL"));
				return emp;
			}
		};

		List<EmployeeBean> list = jdbcTemplate.query("Select EMP_ID,EMP_NAME,EMP_SAL From Employee", rowMapper);

		return list;
	}

	public EmployeeBean getAllRowMapper2(Integer empId) {

		RowMapper<EmployeeBean> rowMapper = new RowMapper<EmployeeBean>() {

			@Override
			public EmployeeBean mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeBean emp = new EmployeeBean();
				emp.setEmpNo(rs.getInt("EMP_ID"));
				emp.setEmpName(rs.getString("EMP_NAME"));
				emp.setEmpSal(rs.getFloat("EMP_SAL"));
				return emp;
			}
		};

	EmployeeBean emp = jdbcTemplate.queryForObject("Select EMP_ID,EMP_NAME,EMP_SAL From Employee Where EMP_ID = ?",
				rowMapper,empId);

		return emp;
	}

}

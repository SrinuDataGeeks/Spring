package com.datageeks.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
	
@Repository
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate = null;

		public void batchProcessing()
		{
			String stmt1 = "Insert Into EMPLOYEE(EMP_ID,EMP_NAME,EMP_SAL) Values(444,'Arvind1',15000f)";
			String stmt2 = "Insert Into EMPLOYEE(EMP_ID,EMP_NAME,EMP_SAL) Values(555,'Arvind2',25000f)";
			String stmt3 = "Insert Into EMPLOYEE(EMP_ID,EMP_NAME,EMP_SAL) Values(666,'Arvind3',35000f)";
			String stmt4 = "Update EMPLOYEE Set EMP_NAME= 'SRINU NPP' Where EMP_ID=111 ";
			jdbcTemplate.batchUpdate(stmt1,stmt2,stmt3,stmt4);
		}
}



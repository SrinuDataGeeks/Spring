package com.datageeks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.datageeks.dao.DataSourceException;
import com.datageeks.dao.EmployeeBean;
import com.datageeks.dao.EmployeeDAO;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO = null;

	public List<EmployeeBean> getAll() throws ServicesException {

		try {
			return employeeDAO.getAll();
		} catch (DataSourceException exp) {
			throw new ServicesException(exp.getMessage());
		}

	}

	public EmployeeBean getById(Integer empId) throws ServicesException {
		try {
			return employeeDAO.getById(empId);
		} catch (DataSourceException exp) {
			throw new ServicesException(exp.getMessage());
		}
	}

	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = ServicesException.class)
	public void delete(Integer empId) throws ServicesException {

		try {
			 employeeDAO.delete(empId);
			} catch (DataSourceException exp) {
			throw new ServicesException(exp.getMessage());
		}

	}
	
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor = ServicesException.class)
	public void saveOrUpdate(EmployeeBean employeeBean) throws ServicesException {

		try {
			 employeeDAO.saveOrUpdate(employeeBean);
			} catch (DataSourceException exp) {
			throw new ServicesException(exp.getMessage());
		}

	}

}

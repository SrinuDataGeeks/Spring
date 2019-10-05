package com.datageeks.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory = null;

	public List<EmployeeBean> getAll() throws DataSourceException {

		try {
			return sessionFactory.openSession().createQuery("Select emp From EmployeeBean as emp", EmployeeBean.class)
					.getResultList();
		} catch (HibernateException exp) {
			throw new DataSourceException(exp.getMessage());
		}

	}

	public EmployeeBean getById(Integer empId) throws DataSourceException {
		try {
			return sessionFactory.openSession().get(EmployeeBean.class, empId);
		} catch (HibernateException exp) {
			throw new DataSourceException(exp.getMessage());
		}
	}

	public void delete(Integer empId) throws DataSourceException {

		try {
			Session session = sessionFactory.getCurrentSession();
			EmployeeBean employee = session.get(EmployeeBean.class, empId);
			if (employee != null) {
				session.delete(employee);
			}
			session.close();
		} catch (HibernateException exp) {
			throw new DataSourceException(exp.getMessage());
		}

	}
	
	
	public void saveOrUpdate(EmployeeBean employeeBean) throws DataSourceException {

		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(employeeBean);
			session.close();
		} catch (HibernateException exp) {
			throw new DataSourceException(exp.getMessage());
		}

	}
}

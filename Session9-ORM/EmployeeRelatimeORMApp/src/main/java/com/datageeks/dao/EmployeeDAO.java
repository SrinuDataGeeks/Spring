package com.datageeks.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory = null;

	public EmployeeBean get(Integer empId) {
		return sessionFactory.openSession().get(EmployeeBean.class, empId);
	}

	public void saveOrUpdate(EmployeeBean employeeBean) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employeeBean);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(Integer empId) {
		Session session = sessionFactory.openSession();

		EmployeeBean emp = session.get(EmployeeBean.class, empId);
		if (emp != null) {
			session.beginTransaction();
			session.delete(emp);
			session.getTransaction().commit();
		}

		session.close();
	}

	public List<EmployeeBean> getAll() {
		Session session = sessionFactory.openSession();

		TypedQuery<EmployeeBean> query = session.createQuery("Select emp From EmployeeBean as emp", EmployeeBean.class);

		return query.getResultList();
	}

	public List<EmployeeBean> getAll2() {

		return sessionFactory.openSession().createQuery("Select emp From EmployeeBean as emp", EmployeeBean.class)
				.getResultList();

	}

}

package com.datageeks.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	@Autowired
	private SessionFactory sessionFactory = null;

	public ProductBean get(Integer id) throws DataSourceException {
		ProductBean productBean = null;

		try {
			productBean = sessionFactory.openSession().get(ProductBean.class, id);
		} catch (HibernateException exp) {
			exp.printStackTrace();
			throw new DataSourceException(exp.getMessage());
		}

		return productBean;

	}

	public void saveOrUpdate(ProductBean product) throws DataSourceException {
		Session session = null;

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(product);
			session.getTransaction().commit();
		} catch (HibernateException exp) {
			session.getTransaction().rollback();
			exp.printStackTrace();
			throw new DataSourceException(exp.getMessage());
		} finally {
			if (session != null)
				session.close();
		}

	}

	public void delete(Integer id) throws DataSourceException {
		Session session = null;

		try {
			session = sessionFactory.openSession();
			session.beginTransaction();
			ProductBean productBean = sessionFactory.openSession().get(ProductBean.class, id);
			if (productBean != null) {
				session.delete(productBean);
				session.getTransaction().commit();
			}

		} catch (HibernateException exp) {
			session.getTransaction().rollback();
			exp.printStackTrace();
			throw new DataSourceException(exp.getMessage());
		} finally {
			if (session != null)
				session.close();
		}

	}

	public List<ProductBean> search(String productName) throws DataSourceException {
		List<ProductBean> productList = null;
		Session session = null;

		String hql = " Select p From ProductBean p where upper(p.productName) like :pname";

		try {
			session = sessionFactory.openSession();
			TypedQuery<ProductBean> query = session.createQuery(hql, ProductBean.class);
			query.setParameter("pname", "%" + productName.trim().toUpperCase() + "%");

			productList = query.getResultList();

		} catch (HibernateException exp) {
			session.getTransaction().rollback();
			exp.printStackTrace();
			throw new DataSourceException(exp.getMessage());
		} finally {
			if (session != null)
				session.close();
		}

		return productList;
	}

	public List<ProductBean> getAll() throws DataSourceException {
		List<ProductBean> productList = null;
		Session session = null;

		String hql = " Select p From ProductBean p";

		try {
			session = sessionFactory.openSession();
			TypedQuery<ProductBean> query = session.createQuery(hql, ProductBean.class);
			productList = query.getResultList();

		} catch (HibernateException exp) {
			session.getTransaction().rollback();
			exp.printStackTrace();
			throw new DataSourceException(exp.getMessage());
		} finally {
			if (session != null)
				session.close();
		}

		return productList;
	}
	
	

}

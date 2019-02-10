package com.hb.utils;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Criteria;
import com.persistentClasses.Employee;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public class CriteriaAndStuff {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		//CriteriaBuilder builder = session.getCriteriaBuilder();
		//CriteriaQuery<Employee> criteria = builder.createQuery(Employee.class);
		List<Employee> employees = criteria.list();
		for(Employee employee : employees) {
			System.out.println(employee);
		}
	}
}

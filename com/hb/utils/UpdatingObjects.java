package com.hb.utils;

import org.hibernate.SessionFactory;

import com.persistentClasses.Employee;

import org.hibernate.Session;

public class UpdatingObjects {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.getTransaction().begin();
		Employee employee = (Employee)session.get(Employee.class, new Long(1));
		session.delete(employee);
		
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}

}

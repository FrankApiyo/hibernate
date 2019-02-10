package com.hb.utils;

import org.hibernate.SessionFactory;

import com.persistentClasses.Employee;

import org.hibernate.Session;

public class Test2 {
	public static void main(String[] args) {
		//open session factory
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		Employee employee = (Employee) session.get(Employee.class, 2l);
		if(employee != null) {
			System.out.println(employee.toString());
		}
		
		session.close();
		HibernateUtil.shutdown();
	}

}

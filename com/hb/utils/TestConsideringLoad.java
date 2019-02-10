package com.hb.utils;

import org.hibernate.SessionFactory;

import com.persistentClasses.Employee;

import org.hibernate.Session;

public class TestConsideringLoad {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		System.out.println("Employee get..");
		Employee employeeGet = (Employee) session.get(Employee.class,  Long.valueOf(1));
		System.out.println(employeeGet.toString());
		
		System.out.println("Employee load... ");
		Employee employeeLoad = (Employee) session.load(Employee.class,  Long.valueOf(3));
		System.out.println(employeeLoad.toString());
		
		session.close();
		HibernateUtil.shutdown();
	}
}

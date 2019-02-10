package com.hb.utils;

import org.hibernate.SessionFactory;

import com.persistentClasses.Employee;

import org.hibernate.Session;

public class UpdatingAnObject {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employee employee = (Employee) session.get(Employee.class,  new Long(2));
		System.out.println("\nOld Employee...");
		System.out.println(employee.toString());
		
		session.getTransaction().begin();
		employee.setFirstName("aarush_updated");
		session.saveOrUpdate(employee);
		session.getTransaction().commit();
		
		
		employee = session.get(Employee.class,  new Long(2));
		
		System.out.println("\nEmployee after update");
		System.out.println(employee);
		
		session.close();
		HibernateUtil.shutdown();
	}
}

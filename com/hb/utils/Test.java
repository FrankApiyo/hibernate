package com.hb.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.persistentClasses.Department;
import com.persistentClasses.Employee;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		//HibernateUtil.shutdown();
		
		//get a session
		Session session = sessionFactory.openSession();
		
		//begin transaction
		session.getTransaction().begin();
		
		//create a department object
		Department department = new Department();
		//department.setDeptName("development");
		department.setId(1l);
		
		
		//save department object
		//session.save(department);
		//System.out.println("Department saved, id: "+department.getId());
		
		Employee employee = new Employee();
		employee.setFirstName("Yogesh");
		employee.setSalary(50000);
		//Employee employee = new Employee();
		//employee.setFirstName("aarush");
		//employee.setSalary(35000);
		employee.setDepartment(department);
		
		//session.save(employee);
		//employee.setDepartment(department);
		
		session.save(employee);
		System.out.println("Employee saved, id: "+employee.getId());
		
		session.getTransaction().commit();
		
		session.close();
		HibernateUtil.shutdown();
		
	}

}

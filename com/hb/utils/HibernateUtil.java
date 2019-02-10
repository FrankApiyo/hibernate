package com.hb.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	
	static {
		try {
			//create the session factory from hibernate.cfg.xml
			Configuration c = new Configuration().configure();
			//this line is written here as a testament to the sad fact that its the small ones that will get you
			System.out.println("\n\n\n"+c.getProperties().get("hibernate.hbm2ddl.auto")+"\n\n\n");
			sessionFactory = c.buildSessionFactory();
		}catch(Throwable ex) {
			System.err.println("sessionFactory creation failed."+ex);
			throw new ExceptionInInitializerError(ex);
		}	
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void shutdown() {
		getSessionFactory().close();
	}
}

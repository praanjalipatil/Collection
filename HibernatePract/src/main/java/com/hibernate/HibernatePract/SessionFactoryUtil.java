package com.hibernate.HibernatePract;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		
		System.out.println("hi");

		if (sessionFactory == null) {
			//sessionFactory = new Configuration().configure().buildSessionFactory();
			
			synchronized (SessionFactoryUtil.class) {
				if(sessionFactory==null)
					sessionFactory = new Configuration().configure().buildSessionFactory();
			}			
		}
		return sessionFactory;
	}
	
	

}

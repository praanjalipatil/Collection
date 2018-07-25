package com.hibernate.HibernatePract;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {

		//SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		
		session.save(new Employee(5, "Jnb", "Pune", 40000));
		session.save(new Employee(6, "Tga", "Mumbai", 10000));
		session.flush();
		tr.commit();
		session.close();

		System.out.println("Successfully saved...");
	}

}

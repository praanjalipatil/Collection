package com.scp.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		
		Employee emp = new Employee(1, "Abc", "Pune", 50000);

		System.out.println("hi");		
		
		 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
         Session session = sessionFactory.openSession();
         Transaction tr = session.beginTransaction();
         session.save(emp);
         //session.getTransaction().commit();				
		session.flush();
		tr.commit();
		session.close();
		
		System.out.println("Successfully saved...");
	}

}

package com.hibernate.HibernateInheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Abc", "Pune", 30000);
		
		Session session1 = SessionFactoryUtil.getSession();
		Transaction tr1 = session1.beginTransaction();
		session1.save(e1);
		SessionFactoryUtil.flushNcommit(tr1, session1);
		session1.evict(e1);
		
		e1.setAddress("Karad");
		
		Session session2 = SessionFactoryUtil.getSession();
		Transaction tr2 = session2.beginTransaction();
		Employee e2 = session2.get(Employee.class, 1);
		e2.setEmpName("Xyz");
		//session2.save(e2);
		session2.merge(e1);
		SessionFactoryUtil.flushNcommit(tr2, session2);

		
		
		
		

		System.out.println("Successfully saved...");
	}

}

package com.hibernate.HibernateInheritance;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestInheritance {

	public static void main(String[] args) {

		Session session1 = SessionFactoryUtil.getSession();
		
		Student st = new Student(12345, "COEP", 1,"Abc");
		Teacher teach = new Teacher(67891, "PICT", 99, "Xyz");
		
		
		Transaction tr1 = session1.beginTransaction();
		session1.save(st);
		session1.save(teach);
		SessionFactoryUtil.flushNcommit(tr1, session1);

	}

}

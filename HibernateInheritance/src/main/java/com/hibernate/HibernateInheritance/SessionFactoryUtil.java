package com.hibernate.HibernateInheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	private static SessionFactory sessionFactory = null;
	private static Session session = null;
	
	public static Session getSession(){
		
		if (sessionFactory == null) {			
			synchronized (SessionFactoryUtil.class) {
				if(sessionFactory==null)
					sessionFactory = new Configuration().configure().buildSessionFactory();
			}	
		}
		
		Session session = sessionFactory.openSession();		
		return session;
	}
	
	public static void flushNcommit(Transaction tr, Session session){
		
		if(session != null){
			session.flush();
		}
		
		if(tr != null){
			tr.commit();
		}
		
	}
	
}

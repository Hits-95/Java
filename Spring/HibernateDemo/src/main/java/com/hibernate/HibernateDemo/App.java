package com.hibernate.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//creating student
		Student student = new Student(2, "Prashunya Shewale", "@Tehare, Malegaon, Nashi");
		System.out.println(student);
		
		//Session session = factory.getCurrentSession();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
		/*
		 * System.out.println(factory); System.out.println(factory.isOpen());
		 * System.out.println(factory.isClosed());
		 */
	}
}

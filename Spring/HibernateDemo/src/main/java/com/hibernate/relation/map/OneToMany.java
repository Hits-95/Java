package com.hibernate.relation.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		/*
		 * // creating question Question que = new Question(); que.setQuestionId(1);
		 * que.setQuestion("What is java ?");
		 * 
		 * // creating ans object Answer ans1 = new Answer(1,
		 * "Java is programming language.", que); Answer ans2 = new Answer(2,
		 * "with the help of java we can create softwares.", que); Answer ans3 = new
		 * Answer(3, "java has different types of frameworks to work.", que);
		 * 
		 * // create list List<Answer> list = new ArrayList<Answer>(); list.add(ans1);
		 * list.add(ans2); list.add(ans3);
		 * 
		 * // pass list of answers to an question que.setAnswers(list);
		 */

		// session
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		/*
		 * //save session.save(que);
		 * 
		 * session.save(ans1); session.save(ans2); session.save(ans3);
		 */

		// fetching data

		Question que = session.get(Question.class, 1);
		System.out.println(que.getQuestion());

		for (Answer ans : que.getAnswers())
			System.out.println(ans.getAnswer());

		tx.commit();

		// close
		session.close();
		factory.close();
	}

}

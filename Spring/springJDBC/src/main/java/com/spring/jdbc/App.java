package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/data_confg.xml");
		
		//get query fire object
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		
		//get data for insert
		//Student student  = context.getBean("student1", Student.class);
		
		//fire 
		//int result = studentDao.insert(student);
		
		//update Student
		/*
		 * Student student = new Student(); student.setId(2);
		 * student.setNaem("Yogita Bhagwan Ahire");
		 * student.setCity("At dabli post kashti");
		 * 
		 * //fire int update = studentDao.update(student);
		 * System.out.println("No of record update : " + update);
		 */
		
		//Delete Student
		int delete = studentDao.delete(6);
		System.out.println("No of record deleted : " + delete);

	}
}


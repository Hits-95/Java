package com.springDemo.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springDemo/springDemo/conf.xml");
		Student student = (Student) context.getBean("Student1");
		System.out.print(student);
	}
}

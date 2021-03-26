package com.springDemo.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springDemo/standalone/collections/data_confg.xml");
		Person person = context.getBean("");
	}

}

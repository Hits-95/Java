package com.springDemo.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//default variable is 'student ' but u can change it as temp
@Component("temp")
public class Student {
	@Value("Hitesh Bhagwan Ahire")
	private String name;
	
	@Value("Malegaon Nashik")
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}

}

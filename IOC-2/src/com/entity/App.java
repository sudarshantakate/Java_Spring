package com.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("Beans.xml");
		Student student = (Student) apc.getBean("stud");
		
		System.out.println(student);
		
		
		
		
	}
}

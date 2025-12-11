package com.entity;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Controller {

	public static void main(String[] args) {

//		//Lazzey Loader 
//		Resource resource = new ClassPathResource("beans.xml");
//		BeanFactory bf = new XmlBeanFactory(resource);
//
//		Student student = bf.getBean("stud", Student.class);
//		System.out.println(student.hashCode());
//
//		Address college = bf.getBean("clg", Address.class);
//		System.out.println(college.hashCode());

		System.out.println("----------------------------------------------");
		
		System.out.println("Application Conext Part");
		
		//Eager Loader 
		ApplicationContext apc = new ClassPathXmlApplicationContext("Beans.xml");
		
		System.out.println("Student and Adddress data ");
		Student student = apc.getBean("stud",Student.class);
		System.out.println(student);
		
		System.out.println("");
		System.out.println("Address Data Only");
		Address address = apc.getBean("add", Address.class);
        System.out.println(address);
		 
		 

	}
}

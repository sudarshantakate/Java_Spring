package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Controller {

	public static void main(String[] args) {


		System.out.println("----------------------------------------------");
		
		System.out.println("Application Conext Part");
		
		// Eager Loader
        ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
//
//        System.out.println("Course details");
//        Course course = apc.getBean("course", Course.class);
//        System.out.println(course);
//
//        System.out.println();
//        System.out.println("Faculty details");
//        Faculty faculty = apc.getBean("faculty", Faculty.class);
//        System.out.println(faculty);

//        System.out.println();
        System.out.println("All details");
        Student student = apc.getBean("stud", Student.class);
        System.out.println(student);
	
		 

	}
}

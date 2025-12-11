package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.School;
import com.entity.Student;


@Configuration
public class AppConfig {
	
	@Bean(name = "School")
	public School getSchool() {
		
		School sc = new School();
		
		sc.setSid(201);
		sc.setSname("Adarsh Vidya Mandir");
		sc.setAddress("Talegaon Dabhade");
		
		return sc;
	}

	@Bean(name = "Student")
	public Student getStudent() {
		Student st = new Student();
		
		st.setRollNo(101);
		st.setSname("Sudarshan");
		st.setAddress("Pune"); 
		
//		st.setSchool(getSchool());
		
		return st;
	}
}

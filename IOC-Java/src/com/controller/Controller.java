package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig;
import com.entity.Student;

public class Controller {

    public static void main(String[] args) {

        ApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = apc.getBean("Student", Student.class);
        System.out.println(student);

    }
}

package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class B {

	@Autowired
	private A a;
	
	public static void main(String[] args) {
		
		B b = new B();
		b.a.i=200;
		b.a.m1();
	}
}

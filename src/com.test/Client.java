package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Employee employee1 = (Employee)context.getBean("emp1");
		System.out.println("Employee 1"+employee1);
		
		Employee employee2 = (Employee)context.getBean("emp2");
		System.out.println("Employee 2"+employee2);		
		
		((ClassPathXmlApplicationContext)context).close();
	}

}

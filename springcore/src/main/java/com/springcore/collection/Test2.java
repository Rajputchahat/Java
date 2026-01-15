package com.springcore.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test2 {

	public static void main(String[] args) {
	System.out.println("Hello World");
	ApplicationContext context =  new ClassPathXmlApplicationContext("collectionConfig.xml");
	Emp employee = (Emp) context.getBean("emp1");
	System.out.println(employee.getName());
	System.out.println(employee.getPhones());
	System.out.println(employee.getAddress());
	System.out.println(employee.getCourses());
	System.out.println(employee.getProps());
	
	} 
}

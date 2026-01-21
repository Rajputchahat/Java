package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
    	System.out.println("This is your Test Class 3 for Spring project!");
        ApplicationContext context =
            new ClassPathXmlApplicationContext("ci_config.xml");
        Person p = (Person) context.getBean("person");
        
        System.out.println(p);
    }
}


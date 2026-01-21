package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello Reference Object");
        ApplicationContext context = new ClassPathXmlApplicationContext("refConfig.xml");
        A temp = (A) context.getBean("a_ref");
        System.out.println(temp.getX());
        System.out.println(temp.getObj());
        System.out.println(temp);
        System.out.println(temp.getObj().getY());
        
	}

}

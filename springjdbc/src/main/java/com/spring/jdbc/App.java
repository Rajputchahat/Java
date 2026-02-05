package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StuDaoImplementation;

public class App {
   
	public static void main(String args[]) {
		System.out.println("My First JDBC Program......");
		
		//Spring JDBC => JDBC Template
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//General Way to Fire the SQL Query
//		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
//		
//		//Insert Query
//		String query = "insert into student(id,name,city) values(?,?,?)";
//		
//		//Fire the query 
//		int update = template.update(query,105,"Chahat Rajput","Bulandshahr");
//		System.out.println("Number of record inserted = "+update);

		
		//Insertion using dao design pattern
//		StuDaoImplementation sdi = (StuDaoImplementation) context.getBean("sdi");
//		
//		Student std = new Student();
//		
//		std.setId(106);
//		std.setName("BrajBhushan Rajput"); 
//		std.setCity("Mohaba");
//		
//		int n = sdi.insert(std);
//		System.out.println("No. of Student Added =  "+n);
		
        //Updation using dao design pattern 		
//		StuDaoImplementation sdi = (StuDaoImplementation) context.getBean("sdi");
//		
//		Student std = new Student();
//		
//		std.setName("Pradeep Rajput");
//		std.setCity("Meerut");
//		std.setId(103);
//		
//		int n = sdi.update(std);
//		System.out.println("No. of updation =  "+n);
		
		//Deleśtion using dao design pattern
//		System.out.println("Enter the id of student which you want to delete!");
//		Scanner sc = new Scanner(System.in);
//		int id = sc.nextInt();
//		StuDaoImplementation sdi = (StuDaoImplementation) context.getBean("sdi");
//		int n = sdi.delete(id);
//		System.out.println("No. of deletion =  "+n);
		
//		Reading data from table using dao design pattern
//		System.out.println("Enter the id of student whose data you want to access!");
//		Scanner sc = new Scanner(System.in);
//		int id = sc.nextInt();
//		StuDaoImplementation sdi = (StuDaoImplementation) context.getBean("sdi");
//		Student stu = sdi.getStudent(id);
//		System.out.println(stu);
		
		//Reading Whole data from table using dao design pattern
//		StuDaoImplementation sdi = (StuDaoImplementation) context.getBean("sdi");
//		List<Student> stu = sdi.getAllStudents();
//		for(Student s: stu) {
//			System.out.println(s);
//		}
		
		
		//Spring JDBC Configuration Without XML file
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		//General Way to Fire the SQL Query
//		JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");
//		
//		//Insert Query
//		String query = "insert into student(id,name,city) values(?,?,?)";
//		
//		//Fire the query 
//		int update = template.update(query,107,"Nipun Rajput","Bulandshahr");
//		System.out.println("Number of record inserted = "+update);

		//Reading Whole data from table using dao design pattern
		StuDaoImplementation sdi = (StuDaoImplementation) context.getBean("sdi");
		List<Student> stu = sdi.getAllStudents();
		for(Student s: stu) {
			System.out.println(s);
		}
		
	}
}

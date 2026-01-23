 package list;

import java.util.ArrayList;
import java.util.Scanner;
import model2.Student;
public class Admin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        ArrayList<Student> container = new ArrayList<Student>();
        
        for(int i=1; i<=3; i++) 
        {
        	System.out.println("Enter Student ID");
        	int id = sc.nextInt();
        	sc.nextLine(); //clear the scanner buffer
        	System.out.println("Enter Student NAME");
        	String name = sc.nextLine();
        	System.out.println("Enter Student COURSE");
        	String course = sc.nextLine();
        	
        	Student obj = new Student();
        	obj.setId(id);
        	obj.setName(name);
        	obj.setCourse(course);
        	
        	//add data into container
        	container.add(obj);
        }
        System.out.println("*=========================================================*");
	    System.out.println("Id\tSt.name\tcourse");
	    System.out.println("*=========================================================*");
	    for(Student obj:container) {
	    	System.out.println(obj.getId()+"\t"+obj.getName()+"\t"+obj.getCourse());
	    }
	}
}

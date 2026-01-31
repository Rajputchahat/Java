package list;

import java.util.ArrayList;
import java.util.Scanner;

import model.Student;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    ArrayList<Integer> id = new ArrayList<Integer>();
		ArrayList<String> name = new ArrayList<String>();
	    ArrayList<String> course = new ArrayList<String>();
	    for(int i=0;i<3;i++) {
	     	System.out.println("Enter student id");
	    	id.add(sc.nextInt());
	    	sc.nextLine();
	    	System.out.println("Enter student name");
	    	name.add(sc.next());
	     	System.out.println("Enter student course");
	    	course.add(sc.next());
	    }
	    System.out.println("*=========================================================*");
	    System.out.println("Id\tSt.name\tcourse");
	    System.out.println("*=========================================================*");
	    for(int i=0;i<3;i++)
	    {	
			System.out.println(id. get(i)+"\t"+name.get(i)+"\t"+course.get(i));
		} 
	   
	}
}

package list;

import java.util.ArrayList;
import java.util.Scanner;
import model2.Employee;

public class Details {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<Employee> container = new ArrayList<Employee>();
      for(int i=1;i<=5;i++) {
    	  System.out.println("Enter Employee ID:");
    	  int a = sc.nextInt();
    	  sc.nextLine();   //Clear the buffer
    	  System.out.println("Enter Employee NAME:");
    	  String b = sc.nextLine(); 
    	  System.out.println("Enter Employee DESIGNATION:");
    	  String c = sc.nextLine(); 
    	  System.out.println("Enter Employee SALARY:");
    	  int d = sc.nextInt();
    	  Employee emp = new Employee();
    	  emp.setId(a);
    	  emp.setName(b);
    	  emp.setDesignation(c);
    	  emp.setSalary(d);
    	  container.add(emp);
      }
      System.out.println("*********************************************************************");
      System.out.println("Emp.Id\tName\tDesignation\tSalary");
      System.out.println("*********************************************************************");
      for(Employee value: container) {
    	  System.out.println(value.getId()+"\t"+value.getName()+"\t\t"+value.getDesignation()+"\t\t"+value.getSalary());
      }
	}
}

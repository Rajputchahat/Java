package list;
import java.util.Scanner;
import java.util.ArrayList;
public class Assignment1 {

	public static void main(String[] args) {
		//Question->1
        ArrayList<String> names = new ArrayList<String>();
		System.out.println("Enter the name of any five Students");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			names.add(sc.nextLine());
		}
		System.out.println(names);
		names.add("Rohan");
		names.remove(3);
		System.out.println(names);
		
		
		//Question->2
		/*ArrayList<Integer> li = new ArrayList<Integer>();
		System.out.println("Enter number that you want to add");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			System.out.println("Enter number: "+ (i+1));
			int b = sc.nextInt();
			li.add(b);
		}
		li.sort(null);
		System.out.println(li);*/
		
		//Question->3
		//Sorting ArrayList of Strings alphabetically
		/*ArrayList<String> list = new ArrayList<String>();
		System.out.println("Enter the number of students");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			  System.out.println("Enter student name: "+ (i+1));
		      String b = sc.next();
		      list.add(b);
		}
		list.sort(null);
	    System.out.println(list);*/
	}
}

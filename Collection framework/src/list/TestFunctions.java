package list;

import java.util.ArrayList;

public class TestFunctions {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("Android");
		list.add("Flutter");
		list.add("MERN");
		
         ArrayList<String> list2 = new ArrayList<String>();
         list2.add("Java");
         list2.add("Python");
         list2.add("Android");
         list2.add("Flutter");
         list2.add("MERN");
		//isEmpty():-> It is use to check the ArrayList element availability
		//System.out.println(list.isEmpty());
		
		//contains():-> I t is use to search any element from ArrayList
		//System.out.println(list.contains("MERN"));
         
	
		//equals():-> It is use to compare two ArrayList
		System.out.println(list.equals(list2));

		//remove():-> It is use to remove the element from ArrayList
       	list2.remove("Java");
       	System.out.println(list2);

	}

}

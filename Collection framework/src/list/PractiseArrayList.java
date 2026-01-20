package list;

import java.util.ArrayList;

public class PractiseArrayList {
	public static void main(String args[])
	{
		ArrayList list = new ArrayList();
		
		System.out.println("The Size of ArrayList is: "+list.size());
		list.add("Ram");
		list.add(2);
		list.add(true);
		list.add("Chahat");
		System.out.println("The Size of ArrayList after adding the elements is: "+list.size());
		System.out.println(list);
		list.remove(3);
		System.out.println("The Size of ArrayList after removing one element is: "+list.size());
		System.out.println(list);
	}
}

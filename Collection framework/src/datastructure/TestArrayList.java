package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		  
			ArrayList<String> al = new ArrayList<String> ();
			//System.out.println("Size before adding element :- "+al.size());
			al.add("Ram");
			al.add("Rohit");
			al.add("Shyam");
			al.add("Ramu");
			al.add("Sanju");
			//System.out.println("Size after adding element :- "+al.size());
			//al.remove(0);
			//System.out.println("Size after removing element :- "+al.size());
	       //Read the element from arraylist 
			//1st way Using for loop
			/*for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i));
			}*/
			//2nd way to read the all element from arraylist using for-each loop
			/*for(String data : al)
			{
				System.out.println(data);
			}*/
			//3rd way to read data using iterator
			Iterator<String> obj = al.iterator();
			while(obj.hasNext())
			{
			   System.out.println(obj.next());
			} 
	}
}

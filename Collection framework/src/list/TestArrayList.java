package list;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		//ArrayList list = new ArrayList();  // Bug of ArrayList because it can store hetergenous type of data
		//To solve this bug we make the ArrayList Generic through data type in angular bracket
		
     	 ArrayList<Integer> list = new ArrayList<Integer>();
		 System.out.println("Size Before Adding Element: "+list.size());
		 
		 list.add(101);
		 list.add(102);
		 list.add(103);
		 list.add(103);
		
		 
		 System.out.println("Size After Adding Element: "+list.size());
		 
		 list.remove(3);
		 
		 System.out.println("Size After Removing Element: "+list.size());
	}

}

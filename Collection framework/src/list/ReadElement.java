package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ReadElement {

	public static void main(String[] args) {
		
		ArrayList<String> places = new ArrayList<String>();
		places.add("Delhi");
		places.add("Mumbai");
		places.add("Kolkata");
		places.add("UP");
		places.add("Goa");
		
		//Ist way to read element from ArrayList (By using for loop)
		/*for(int i=0;i<places.size();i++) {
		   System.out.println(places.get(i));
		}*/
		
		//IInd way to read element from ArrayList (By using for-each loop)
		/*for(String value : places) {
			System.out.println(value);
		}*/
		//3rd way to read element from ArrayList (By using Iterator)
		/*Iterator<String> itr = places.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		//Using lamdaExpression
		//places.forEach(data->System.out.println(data));
		places.forEach(data->
		{
			System.out.println(data);
		});
		}
	}

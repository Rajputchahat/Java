package queue;

import java.util.Iterator;
import java.util.PriorityQueue;
public class TestPriority {

	public static void main(String[] args)
	{
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Oreo");
		pq.add("Alpha");
		pq.add("Kitkit");
		//pq.add("Oreo");
		
		//System.out.println(pq);
		
		//Using For Each loop
		
	    /*for(String data : pq)
	    {
	    	System.out.println(data);
	    }*/
		
		//Using Iterator
		
	    /*Iterator<String> itr = pq.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }*/
	    
	    //Using Lamda Expression
	    pq.forEach(data -> {System.out.println(data);});
	    
	}

}

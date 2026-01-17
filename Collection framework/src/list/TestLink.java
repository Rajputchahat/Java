package list;

import java.util.LinkedList;
public class TestLink {

	public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("Ram");
	list.add("Shyam");
	list.add("Radha");
	list.add("Mohan");
	list.add("Raju");
	
	list.addFirst("Chintu");
	list.addLast("Mintu");
	System.out.println(list);

	}

}

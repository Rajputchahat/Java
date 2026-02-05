package list;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;

public class Assignment3 {
   
	public static void main(String[] args)
	 {
     ArrayList<Integer> num = new ArrayList<Integer>();
     Scanner sc = new Scanner(System.in);
     for(int i=0;i<5;i++) {
    	 num.add(sc.nextInt());
     }
     System.out.println(num);

	}

}

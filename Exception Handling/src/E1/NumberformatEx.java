package E1;

import java.util.Scanner;

public class NumberformatEx {

	public static void main(String[] args) {
	try
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two values");
		String x = sc.next();
		String y = sc.next();
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		System.out.println(a+b);
	}
	catch(Exception e)
	{
		System.out.println("Input Number Only");
	}
	
	}

}

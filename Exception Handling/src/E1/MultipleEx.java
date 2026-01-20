package E1;
import java.util.Scanner;
import java.util.InputMismatchException;
public class MultipleEx {
	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = x/y;
			System.out.println("Result is :- "+z);
		}
		catch (ArithmeticException obj)
		{
			System.out.println("Don't input the value of y=0");
		}
		catch (InputMismatchException e)
		{
			System.out.println("Input Numbers Only");
		}
	}
}
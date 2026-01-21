package E1;

public class ArithmeticEx 
{
	public static void main(String[] args) {
	   System.out.println("Hi");
	   System.out.println("Hello");
	   try
	   {
		   System.out.println(10/0);
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	   System.out.println("Kaise ho");
	}
}

package E1;

public class ArrayIndexex {

	public static void main(String[] args) {
		try
		{
			int id[] = {14,62,53,58,60,78};
			for(int i=0;i<=id.length;i++)
			{
				System.out.println(id[i]);
			}
		}
	    catch(Exception e)
		{
	    	System.out.println("Array index out of Bounds");
		}

	}

}

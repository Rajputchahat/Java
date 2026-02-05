package E1;

public class finallyBlock {

	public static void main(String[] args) {
      try
      {
    	  System.out.println(10/0);
    	  System.out.println("This is try");
      }
      catch(Exception e)
      {
    	 System.out.println("This is catch"); 
      }
      finally
      {
    	  System.out.println("This is finally");
      }
	}

}

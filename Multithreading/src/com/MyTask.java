package com;
public class MyTask {
   public synchronized void task()
   {
	   for(int i=1;i<=5;i++)
	   {
		   try
		   {
			   Thread.sleep(2000);
		   }
		   catch(Exception e)
		   {}
		   System.out.println(i);
	   }
   }
   
}

package com;

public class MyThread extends Thread {
	@Override
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try
			{
				Thread.sleep(4000);
			}
			catch(Exception e)
			{}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		/*MyThread obj = new MyThread();
		obj.start();*/
		// single task multiple thread
		/*MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();
		MyThread obj3 = new MyThread();
		obj1.start();
		obj2.start();
		obj3.start();*/
		//Thread Life cycle
		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();
		MyThread obj3 = new MyThread();
		obj1.start();
		try
		{
			obj1.join();
		}
		catch(Exception e)
		{}
		
		obj2.start();
		obj3.start();
	}
}

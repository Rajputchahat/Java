package com;

public class MyThread4 extends Thread {
	 MyTask obj;
	    public MyThread4(MyTask obj)
	    {
	    	this.obj = obj;
	    }
	    @Override
	    public void run()
	    {
	    	obj.task();
	    }
}

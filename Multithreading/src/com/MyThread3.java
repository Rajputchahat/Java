package com;
public class MyThread3 extends Thread{
	 MyTask obj;
	    public MyThread3(MyTask obj)
	    {
	    	this.obj = obj;
	    }
	    @Override
	    public void run()
	    {
	    	obj.task();
	    }
}

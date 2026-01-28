package com;

public class MyThread2 extends Thread {
    MyTask obj;
    public MyThread2(MyTask obj)
    {
    	this.obj = obj;
    }
    @Override
    public void run()
    {
    	obj.task();
    }
}

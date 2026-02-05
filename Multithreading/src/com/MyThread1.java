package com;

public class MyThread1 implements Runnable
{
	@Override
	public void run() {
		System.out.println("This is Task");
	}
    public static void main(String[] args) {
        MyThread1 obj = new MyThread1();
        Thread t1 = new Thread(obj);
        t1.start();
	}
}

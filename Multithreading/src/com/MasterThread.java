package com;

public class MasterThread {

	public static void main(String[] args) {
		MyTask obj = new MyTask();
		MyThread2 t2 = new MyThread2(obj);
		MyThread3 t3 = new MyThread3(obj);
		MyThread4 t4 = new MyThread4(obj);
        t2.start();
        t3.start();
        t4.start();
	}

}

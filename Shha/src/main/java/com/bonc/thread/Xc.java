package com.bonc.thread;

public class Xc implements Runnable{

	public void run() {
		System.out.println("用run方法创建线程");
	}
	public static void main(String[] args) {
		Xc x = new Xc();
		Thread t = new Thread(x);
		t.start();
	}
}

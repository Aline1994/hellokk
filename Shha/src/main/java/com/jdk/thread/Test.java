package com.jdk.thread;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		/*DeadLock dl = new DeadLock(true);
		DeadLock dl1 = new DeadLock(false);
		dl.start();
		dl1.start();*/
			Bank b = new Bank();
			Thread t1 = new Thread(b);
			Thread t2 = new Thread(b);
			t1.start();
			t2.start();
			System.out.println(b.sum);
			Thread.sleep(100);
			System.out.println(b.sum);
	}
}
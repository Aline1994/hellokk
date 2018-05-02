package com.jdk.thread.soldTicket;



public class Test {
	public static void main(String[] args) {
		SaleTicket st = new SaleTicket();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		new Thread(st).start();
		/*new Thread(new com.jdk.thread.mianshi.Printer(0)).start();
		new Thread(new com.jdk.thread.mianshi.Printer(1)).start();
		new Thread(new com.jdk.thread.mianshi.Printer(2)).start();*/
	}
}

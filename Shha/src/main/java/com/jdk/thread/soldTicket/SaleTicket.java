package com.jdk.thread.soldTicket;

public class SaleTicket implements Runnable{
	private int totolnum;
	private int count;
	public SaleTicket() {
		this.totolnum=100;
		this.count=0;
	}

	@Override
	public  void run() {
		
			while(true){
				synchronized (this) {
				if(totolnum<=0){
					break;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					System.out.println(Thread.currentThread().getName()+"========"+totolnum--);
				}
			
			}
			
		
	}

}

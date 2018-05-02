package com.jdk.thread;

public class DeadLock extends Thread {
	
	boolean flag;
	public DeadLock(boolean flag){
		this.flag=flag;
	}
	@Override
	public void run() {
		if(flag){
			synchronized (Obj.obj1) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("A.object1");
				synchronized (Obj.obj2) {
					System.out.println("A.object2");
				}
			}
			
		}else{
			synchronized (Obj.obj2) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("B.object2");
				synchronized (Obj.obj1) {
					System.out.println("B.object1");
				}
			}
		}
		
	}

}
class Obj{
	public static Object obj1 = new Object();
	public static Object obj2 = new Object();
}

package hellokk.thread;

public class DeadLock {
	public static void main(String[] args) {
		Thread t = new Thread(new Test(false));
		Thread t1 = new Thread(new Test(true));
		t.start();
		t1.start();
	}
}
class Obj{
	public  static Object obj = new Object();
	public static Object obj1 = new Object();
}
class Test implements Runnable{
	private boolean flag;
	public Test(boolean flag){
		this.flag= flag;
	}
	@Override
	public void run() {
		if(flag){
			synchronized (Obj.obj) {
				System.out.println("if ----obj");
				synchronized (Obj.obj1) {
					System.out.println("if------obj1");
				}
			}
		}else{
			synchronized (Obj.obj1) {
				System.out.println("else ----obj1");
				synchronized (Obj.obj) {
					System.out.println("else ----obj");
				}
			}
		}
		
	}
	
}

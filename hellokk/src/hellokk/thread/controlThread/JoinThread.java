package hellokk.thread.controlThread;

public class JoinThread extends Thread {
	public JoinThread(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(getName()+" "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<100;i++){
			if(i==20){
				JoinThread jt = new JoinThread("zx");
				JoinThread jt1 = new JoinThread("kk");
				
				jt.start();
				jt.join(1);
				jt1.start();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
		
	}
}

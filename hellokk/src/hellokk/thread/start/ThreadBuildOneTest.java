package hellokk.thread.start;

public class ThreadBuildOneTest{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0;i<10;i++){
			if(i==6){
				ThreadBuildOne tb = new ThreadBuildOne();
				ThreadBuildOne tb1 = new ThreadBuildOne();
				tb.start();
				tb1.start();
			}
			
		}
		
	}
}
class ThreadBuildOne extends Thread {
	private int i;
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println(getName()+" "+i);
		}
	}
}


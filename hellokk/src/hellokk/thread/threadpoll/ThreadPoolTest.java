package hellokk.thread.threadpoll;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(6);
		r re = new r();
		pool.submit(re);
		pool.submit(re);
		pool.shutdown();
	}
}
class r implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"           "+i);
		}
		
	}
	
}
package hellokk.thread.start;
public class SecondBuild implements Runnable{
	private int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;i<10;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+""+i); 
			if(i==5){
				SecondBuild sb = new SecondBuild();
				new Thread(sb,"kk").start();
				new Thread(sb,"zx").start();
				
			}
		}
		
	}
	
}
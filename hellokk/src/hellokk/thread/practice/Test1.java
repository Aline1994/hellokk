package hellokk.thread.practice;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		Object obj = new Object();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();
	}
	
	
}
class  Thread1 extends Thread{
	private Object obj;  
    
    public Thread1(Object obj)  
    {  
        this.obj = obj;  
    }  
	public void run(){
		synchronized(obj){
			for(int i=1;i<53;i++){
				System.out.print(i);
				if(i%2==0){
					obj.notifyAll();
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
		
	}
}
class  Thread2 extends Thread{
	private Object obj;  
    
    public Thread2(Object obj)  
    {  
        this.obj = obj;  
    }  
	public  void run(){
		synchronized(obj){
			char a = 'A';
			for(int i=0;i<26;i++){
				System.out.print(a);
				a++;
				if(i!=25){
					obj.notify();
					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
		
	}
}
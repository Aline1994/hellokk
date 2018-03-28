package hellokk.thread.internation;

public class Test {
	public static void main(String[] args) {
		Account a = new Account("768976",0.0);
		//
		new CunThread("zx",a,800).start();
	
		new DrawThread("zx",a,100.0).start();
	}
}

package hellokk.collection.list.newList;

public class Test {
	public static void main(String[] args) throws InterruptedException {
	
		ListTest2 lt = new ListTest2();
		
		
		
		for(int i = 0; i < 500; i++){
			Thread t = new Thread(lt);
			t.start();
			ListSafe ls = new ListSafe();
			ls.start();
		}
		Thread.sleep(1000);
		System.out.println("ghfhgf"+ListTest.getInstance().l1.size());
		
	}
}

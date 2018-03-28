package hellokk.collection.list.newList;

public class ListSafe extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		ListTest.getInstance().add();
	}
}

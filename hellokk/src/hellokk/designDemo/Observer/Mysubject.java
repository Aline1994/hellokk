package hellokk.designDemo.Observer;

public class Mysubject extends AbstractSubject {
	//首先主类增加了修改工作，然后通知观察类，观察类收到修改的通知
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("update self!");
		notifyObservers();
	}

}

package hellokk.designDemo.Observer.newObserver;

public class Test {
	public static void main(String[] args) {
		Subject sj = new MySubject();
		sj.add(new ObServer1());
		sj.add(new Observer2());
		sj.operation();
	}
}

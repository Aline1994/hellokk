package hellokk.designDemo.Observer;

public class ObserverTest {
	public static void main(String[] args) {
		Subject sub = new Mysubject();
		sub.add(new Observer1());
		sub.add(new Observer2());
		sub.operation();
	}
}

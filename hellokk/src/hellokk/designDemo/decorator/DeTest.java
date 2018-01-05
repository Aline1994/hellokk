package hellokk.designDemo.decorator;

public class DeTest {
	public static void main(String[] args) {
		Sourcable source = new Source();
		Sourcable decorator = new Decarator(source);
		decorator.method();
	}
}

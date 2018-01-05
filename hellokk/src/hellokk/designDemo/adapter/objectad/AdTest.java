package hellokk.designDemo.adapter.objectad;

import hellokk.designDemo.adapter.Source;

public class AdTest {
	public static void main(String[] args) {
		Source s = new Source();
		Adapter ad = new Adapter(s);
		ad.method1();
		ad.method2();
	}
}

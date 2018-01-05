package hellokk.designDemo.adapter.inter;

import hellokk.designDemo.adapter.Targetable;

public class InterfaceTest {
	public static void main(String[] args) {
		Targetable ta1 = new TargetSub1();
		Targetable ta2 = new TargetSub2();
		ta1.method1();
		ta1.method2();
		ta2.method1();
		ta2.method2();
	}
}

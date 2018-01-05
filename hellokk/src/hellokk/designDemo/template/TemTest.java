package hellokk.designDemo.template;

public class TemTest {
	public static void main(String[] args) {
		String exp = "8+9";
		AbsCalculate ac = new Plus();
		int z=ac.calculate(exp, "\\+");
		System.out.println(z);
		AbsCalculate ac1 = new Minus();
		int z1 = ac1.calculate("8-9", "\\-");
		System.out.println(z1);
	}
}

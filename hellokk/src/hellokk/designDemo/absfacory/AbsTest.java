package hellokk.designDemo.absfacory;

public class AbsTest {
	public static void main(String[] args) {
		Provider pro = new MailFactory();
		pro.produce().Send();
	}
}

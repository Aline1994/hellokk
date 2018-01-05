package hellokk.designDemo.builder;

public class BuilderTest {
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(5);
		builder.produceMsgSender(3);
		builder.look();
	}
}

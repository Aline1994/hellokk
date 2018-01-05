package hellokk.designDemo.facory;

public class Test {
	//普通工厂模式，前提是实现的是同一接口
	public static void main(String[] args) {
		SendFactoru sf = new SendFactoru();
		Sender sender = sf.produce("mail");
		sender.Send();
	}
}

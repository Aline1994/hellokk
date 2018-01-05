package hellokk.designDemo.proxy;

public class Proxy implements Sourceable{
	private Source source;
	public Proxy(){
		super();
		this.source = new Source();
	}
	public void method(){
		before();
		source.method();
		after();
	}
	private void after() {
		System.out.println("proxy before");		
	}
	private void before() {
		System.out.println("proxy after");
	}
}

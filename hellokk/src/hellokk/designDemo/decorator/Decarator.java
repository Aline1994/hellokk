package hellokk.designDemo.decorator;

public class Decarator implements Sourcable{
	private Sourcable source;
	
	public Decarator(Sourcable source){
		super();
		this.source = source;
	}
	@Override
	public void method() {
		System.out.println("before decorator");
		source.method();
		System.out.println("after decorator");
	}

}

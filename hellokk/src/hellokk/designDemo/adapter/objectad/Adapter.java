package hellokk.designDemo.adapter.objectad;

import hellokk.designDemo.adapter.Source;
import hellokk.designDemo.adapter.Targetable;

public class Adapter implements Targetable {
	private Source source;
	
	public Adapter(Source source){
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
		
	}

	@Override
	public void method2() {
		System.out.println("这是target方法");
		
	}
}

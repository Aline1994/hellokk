package hellokk.designDemo.visitor.newVisitor;

public class MySubject implements Subject {

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

	@Override
	public void getSub() {
		// TODO Auto-generated method stub
		System.out.println("happy everyday");
	}

}

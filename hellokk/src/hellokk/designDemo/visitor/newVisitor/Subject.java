package hellokk.designDemo.visitor.newVisitor;

public interface Subject {
	public void accept(Visitor v);
	public void getSub();
}

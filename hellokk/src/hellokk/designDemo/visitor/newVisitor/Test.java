package hellokk.designDemo.visitor.newVisitor;

public class Test {
	public static void main(String[] args) {
		Subject sj = new MySubject();
		Visitor v = new MyVisitor();
		v.visit(sj);
	}
}

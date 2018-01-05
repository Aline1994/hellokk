package hellokk.designDemo.visitor;

public interface Subject {
	//接受要访问他的对象
	public void accept(Visitor visitor);
	//获取要被访问的属性
	public String getSubject();
}

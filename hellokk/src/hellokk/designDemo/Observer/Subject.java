package hellokk.designDemo.Observer;

public interface Subject {
	//增加观察者
	public void add(Observer obs);
	//删除观察者
	public void del(Observer obs);
	//通知所有的观察者
	public void notifyObservers();
	//自身的操作
	public void operation();
}

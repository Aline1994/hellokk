package hellokk.designDemo.Observer.newObserver;

public interface Subject {
	public void add(ObServer o);
	public void remove(ObServer o);
	public void notifyObServers();
	public void operation();
}

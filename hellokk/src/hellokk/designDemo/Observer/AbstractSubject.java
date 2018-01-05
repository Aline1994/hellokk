package hellokk.designDemo.Observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {
	//管理观察者
	private Vector<Observer>vector = new Vector<Observer>();
	
	public void add(Observer obs){
		vector.add(obs);
	}
	public void del(Observer obs){
		vector.remove(obs);
	}
	public void notifyObservers(){
		Enumeration<Observer>enumo = vector.elements();
		while(enumo.hasMoreElements()){
			enumo.nextElement().update();
		}
	}
}

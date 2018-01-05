package hellokk.designDemo.Observer.newObserver;

import java.util.Vector;

public abstract class AbsSubjet implements Subject {
	private Vector<ObServer> v = new Vector<ObServer>();
	@Override
	public void add(ObServer o) {
		// TODO Auto-generated method stub
		v.add(o);
	}

	@Override
	public void remove(ObServer o) {
		// TODO Auto-generated method stub
		v.remove(o);
	}

	@Override
	public void notifyObServers() {
		// TODO Auto-generated method stub
		for(ObServer o:v){
			o.update();
		}
	}

	
}

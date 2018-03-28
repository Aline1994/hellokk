package hellokk.leiandduixiang.practice;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Single {
	private static Single instance = new Single();
	private Single(){}
	//饿汉式
	public static Single getInstance(){
		return instance;
	}
	
	
	//懒汉事
	/*
	public static Single getInstance(){
		if(instance==null){
			instance = new Single();
		}
		return instance;
	}
	public static synchronized Single getInstace1(){
		if(instance==null){
			instance = new Single();
		}
		return instance;
	}
	public static Single getInstance2(){
		if(instance==null){
			synchronized (instance) {
				if(instance==null){
					instance = new Single();
				}
			}
		}
		return instance;
	}*/
}

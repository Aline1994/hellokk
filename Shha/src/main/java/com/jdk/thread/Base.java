package com.jdk.thread;

public class Base {
	public static void main(String[] args) {
		T2 t = new T2();
		T1 t1 = new T1();
		Thread tt = new Thread(t1);
		tt.start();
		t.start();
	}
}

package com.jdk.OOM;

public class Test {
	public static void main(String[] args) {
		Bus bus = new Bus();
		int a = bus.getBus().getBus().getBus().offBus().nownum;
		System.out.println(a);
	}
}

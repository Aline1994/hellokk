package com.jdk.base;

public class Daimakuai {
	{
		int a = 10;
		System.out.println("普通代码块"+a);
	}
	public Daimakuai(){
		int a = 10;
		System.out.println("构造方法代码块"+a);
	}
	{
		int a = 23;
		System.out.println("普通代码块"+a);
	}
	static {
		int a = 15;
		System.out.println("静态代码块"+a);
	}
	
}

package com.bonc.thread;

public class Th extends Thread{
	public void run(){
		System.out.println("用Thread创建线程");
	}
	public static void main(String[] args) {
		new Th().start();
	}
}

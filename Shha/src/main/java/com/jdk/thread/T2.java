package com.jdk.thread;

public class T2 extends Thread {
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i+"*****2*******");
		}
	}
}

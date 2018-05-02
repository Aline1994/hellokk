package com.jdk.thread;

import com.jdk.thread.mianshi.Printer;

public class ThreadLocalal {
	public static void main(String args[]){
		Printer p = new Printer(1);
		ThreadLocal<Printer>t = new ThreadLocal<>();
		
	}
}

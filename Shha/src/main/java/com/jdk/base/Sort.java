package com.jdk.base;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread();
		t.join();
		int a [] = new int[]{3,5,2,4,6};
		Arrays.sort(a);
		for(int s:a){
			System.out.println(s);
		}
	}
}
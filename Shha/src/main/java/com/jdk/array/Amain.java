package com.jdk.array;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Amain {
	public static void main(String[] args) {
		int n=20;
		int [] number = new int[n];
		for(int i=0;i<number.length;i++){
			number[i]=i+1;
		}
		int result[] = new int[3];
		 ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		/*Random ra = new Random();
		int a = ra.nextInt(10);*/
		for(int i=0;i<result.length;i++){
			int r = (int) Math.random()*20;
			result[i]=number[r];
			number[r]=number[n-1];
			n--;
		}
		Arrays.sort(result);
		System.out.println("print");
		for(int r:result){
			System.out.println(r);
		}
		
	}
}

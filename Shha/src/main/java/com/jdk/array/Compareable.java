package com.jdk.array;

import java.util.Random;

public class Compareable implements Comparable<Compareable> {
	int j;
	int i;
	private int count = 1;
	public Compareable(int n1,int m2){
		i=n1;
		j=m2;
	}
	public int compareTo(Compareable o) {
		return i<o.i?-1:(i==o.i?0:1);
	}
	private static Random r = new Random();
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			System.out.println(r.nextInt(10));

		}
		Compareable c = new Compareable(r.nextInt(10),r.nextInt(10));
		int a = new Compareable(r.nextInt(10),r.nextInt(5)).compareTo(c);
		System.out.println(a);
	}
	
}

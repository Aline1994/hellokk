package com.jdk.array;

import java.math.BigInteger;
import java.util.Scanner;

public class Sw {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("这是春天，百花盛放");
			
		case 2:
			System.out.println("这是夏天，热死");
			
		default:
			System.out.println("qita");
			break;
		}*/
	/*	for(int i=0;i<10;i++){
			System.out.println(i+"before");
			if(i==4){
				break;
			}
			System.out.println(i+"after");
		}*/
		/*for(int i=0;i<10;i++){
			System.out.println(i+"before");
			if(i==4){
				continue;
			}
			System.out.println(i+"after");
		}*/
		/*BigInteger bi = BigInteger.valueOf(1234);
		bi=bi.add(BigInteger.valueOf(1));
		System.out.println(bi);*/
		
		String a = "aaa";
		String b = "bbb";
		String c = a+b;
		String e = "aaa"+b;
		String d ="aaabbb";
		System.out.println(c==d);
	}
}

package com.jdk.thread;

import java.util.Scanner;
/**
 * while和switch
 * while 是条件为真时一直循环
 * switch只判断在限定的条件
 * @author iwpoo
 *
 */
public class Swich {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a<3){
			switch(a){
			case 1:
				System.out.println("nishi1");
				break;
			case 2:
				System.out.println("nishi2");
				break;
			case 3:
				System.out.println("nishi3");
				break;
			default:
				System.out.println("ooooooooo");
				
			}
		}
		
		System.out.println("switch结束");
	}
}

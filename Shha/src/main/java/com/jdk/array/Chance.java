package com.jdk.array;

import java.util.Scanner;

public class Chance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("你要抽多少次");
		int  a = in.nextInt();
		System.out.println("你能抽到的最大的数字");
		int b = in.nextInt();
		
		int lottyOdds = 1;
		for(int i=1;i<a;i++){
			lottyOdds=lottyOdds*(b-i+1)/i;
		}
		System.out.println("中奖的概率是"+lottyOdds);
	}
}

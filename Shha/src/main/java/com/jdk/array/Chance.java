package com.jdk.array;

import java.util.Scanner;

public class Chance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("��Ҫ����ٴ�");
		int  a = in.nextInt();
		System.out.println("���ܳ鵽����������");
		int b = in.nextInt();
		
		int lottyOdds = 1;
		for(int i=1;i<a;i++){
			lottyOdds=lottyOdds*(b-i+1)/i;
		}
		System.out.println("�н��ĸ�����"+lottyOdds);
	}
}
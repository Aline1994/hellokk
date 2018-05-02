package com.jdk.findmaxormin;

public class FindMaxDemo {
	public static Comparable findMax(Comparable [] arr){
		int maxIndex = 0;
		
		for(int i=1;i<arr.length;i++){
			if(arr[i].compareTo(arr[maxIndex])>0){
				maxIndex = i;
			}
		}
		return arr[maxIndex];
	}
	public static void main(String[] args) {
		String [] s = {"zx","kk","zxx","lj"};
		System.out.println(findMax(s));
		Integer [] a = {1,4,7,3,545,6,2};
		System.out.println(findMax(a));
	}
}

package com.jdk.array;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		String[]sa = {"aaa","ebb","ccc"};
		int index = Arrays.binarySearch(sa, sa[1]);
		System.out.println(sa[index]);
	}
}

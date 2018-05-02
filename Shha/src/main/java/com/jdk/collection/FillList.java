package com.jdk.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillList  {
	public static void main(String[] args) {
		List<StringAddress>list = new ArrayList<StringAddress>(Collections.nCopies(5, new StringAddress("zhuxiu")));
		System.out.println(list);
		Collections.fill(list, new StringAddress("kakakakaka"));
	}
}
class StringAddress{
	private String s;
	public StringAddress(String s){
		this.s=s;
	}
}

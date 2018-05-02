package com.jdk.array;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<Bus>bus1 = new ArrayList();
		List bus2 = new ArrayList<Bus>();
		bus2.add(new String("bbb"));
		System.out.println(bus2.toString());
	}
}

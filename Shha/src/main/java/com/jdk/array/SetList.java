package com.jdk.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetList {
	public static void main(String[] args) {
		/*Set<String>words = new HashSet<String>();
		long totaltime = 0;
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()){
				String word = sc.next();
				long callTime = System.currentTimeMillis();
				words.add(word);
				callTime = System.currentTimeMillis()-callTime;
				totaltime+=callTime;
			}
		}
		Iterator<String>iter = words.iterator();
		for(int i=0;i<=20&&iter.hasNext();i++){
			System.out.println(iter.next());
		}
		System.out.println(">>>");
		System.out.println(words.size()+"*********"+totaltime);*/
		
		SortedSet<String>set = new TreeSet<>();
		set.add("aaa");
		set.add("bbb");
		set.add("eee");
		set.add("ccc");
		for(String s:set){
			System.out.println(s);
		}
	}
}
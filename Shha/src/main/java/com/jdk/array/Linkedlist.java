package com.jdk.array;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.jdt.core.IBufferChangedListener;

public class Linkedlist {
	public static void main(String[] args) {
		List<String>list = new LinkedList<String>();
		List<String>list1 = new LinkedList<String>();
		list.add("A");
		list.add("C");
		list.add("E");
		list1.add("B");
		list1.add("D");
		list1.add("F");
		list1.add("G");
		
		Iterator<String>it = list1.iterator();
		ListIterator<String>it1 = list.listIterator();
		
		while(it.hasNext()){
			if(it1.hasNext()){
				it1.next();
			}
			it1.add(it.next());
		}
		System.out.println(list);
		
		
		
		
		ListIterator<String>blist = list1.listIterator();
		while(blist.hasNext()){
			blist.next();
			if(blist.hasNext()){
				blist.next();
				blist.remove();
			}
		}
		System.out.println(list1);
		list.addAll(2, list1);
		ListIterator<String>ait = list.listIterator(2);
		System.out.println(ait.next());		
		
	}
}
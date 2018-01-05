package test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		for(int i=0;i<5;i++){
			list.add(i);
		}
		List list1 = list.subList(0, 2);;
		
		for(int i=0;i<list1.size();i++){
			System.out.println(list1.get(i));
		}
	}
}

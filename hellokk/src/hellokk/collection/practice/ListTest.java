package hellokk.collection.practice;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		for(int i=0;i<10;i++){
			list.add(i+"");
		}
		System.out.println(list.get(5));
		System.out.println(list.indexOf(2));
		System.out.println(list.indexOf(7));
		System.out.println(list.remove(3));
		System.out.println(list);
	}
}

package hellokk.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListTest {
	static List list = new ArrayList();
	static Set set = new HashSet();
	public static void main(String[] args) {
		getDiff(list,set);
		
	}
	public static void  getDiff(List list,Set set){
		list.add(1);
		list.add(1);
		list.add(3);
		list.add(2);
		set.add(1);
		set.add(1);
		set.add(3);
		set.add(2);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i)+"****************");
		}
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next()+"**********");
		}
	}
}

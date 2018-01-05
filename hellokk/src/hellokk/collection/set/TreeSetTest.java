package hellokk.collection.set;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		 TreeSet ts = new TreeSet();
		 ts.add(5);
		 ts.add(9);
		 ts.add(3);
		 ts.add(-2);
		 System.out.println(ts);
		 System.out.println(ts.first());
		 System.out.println(ts.last());
		 System.out.println(ts.lower(2));//小于指定元素最大的元素
		 System.out.println(ts.higher(3));//大于指定元素最小元素
		 System.out.println(ts.subSet(1, 9));//在指定元素之间的集合
		 System.out.println(ts.headSet(5));//小于指定元素的集合
		 System.out.println(ts.tailSet(2));//大于指定元素的集合
		 ts.comparator();
		 System.out.println(ts);
	}
}
class Comparator implements Comparable<Object>{
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}}

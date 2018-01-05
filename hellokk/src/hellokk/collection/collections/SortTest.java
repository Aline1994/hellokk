package hellokk.collection.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * 
 * Collections工具类的主要作用都有排序，增删改查，同步，不可变
 * @author iwpoo
 *
 */
public class SortTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(2);
		list.add(-5);
		list.add(3);
		list.add(10);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
}
class SearchTest{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(2);
		list.add(-5);
		list.add(3);
		list.add(10);
		list.add(2);
		System.out.println(list);
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		Collections.replaceAll(list, 2, 1);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, 0));
		
	}
}
class synchonizedTest{
	public static void main(String[] args) {
		Collection c = Collections.synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new LinkedList());
		Set s = Collections.synchronizedSet(new HashSet());
		Map map = Collections.synchronizedMap(new HashMap());
	}
}
class UnmodifiedTest{
	public static void main(String[] args) {
		List list = Collections.emptyList();//空的，不可变的集合
		Set set = Collections.singleton("zxx");//只包含一个元素的不可变的集合
		Map map = new HashMap();
		map.put("语文", 90);
		map.put("数学", 67);
		Map mapun = Collections.unmodifiableMap(map);//不可变的map
	}
}















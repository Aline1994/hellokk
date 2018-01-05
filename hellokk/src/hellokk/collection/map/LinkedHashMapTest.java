package hellokk.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
//按照添加顺序输出
public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("语文", 234);
		lhm.put("数学",45);
		lhm.put("英语", 150);
		Iterator it = lhm.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		HashMap hm = new HashMap();
		hm.put("语文", 234);
		hm.put("数学",45);
		hm.put("英语", 150);
		Iterator it1 = hm.entrySet().iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
	}
}

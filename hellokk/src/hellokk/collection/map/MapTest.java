package hellokk.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("疯狂Java讲义", 109);
		map.put("疯狂ios讲义", 10);
		map.put("疯狂ajax讲义", 79);
		map.put("zx讲义", 9999);
		System.out.println(map);
		System.out.println(map.put("疯狂ios讲义", 99));
		System.out.println(map);
		System.out.println(map.containsKey("zx讲义"));
		System.out.println(map.containsValue(9999));
		for(Object key:map.keySet()){
			System.out.println(key+"zxcxzczxc"+map.get(key));
		}
		map.remove("zx讲义");
		System.out.println(map);
		
	}
}
//hashmap中允许有空值存在，hashtable中不允许是空
class nullinhashmap{
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(null, null);
		hm.put("a", null);
		System.out.println(hm);
		Hashtable ht = new Hashtable();
		ht.put(null, null);
		ht.put("a", null);
		System.out.println(ht);
		
	}
}
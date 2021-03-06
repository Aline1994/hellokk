package hellokk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 从No matter how familiar we used to be with each other读取单词，将所有不重复的单词按字典逆序显示
 * @author iwpoo
 *
 */
public class OrderDesc {
		
	public static void main(String[] args) {
		String zx = "You Know I still Love You Baby And it will never change I want nobody nobody But You I want nobody nobody But You";
		String kk = getOrderByMap(zx);
		String kk2 = getOrderBySet(zx);
		String kk3 = getOrderBydesc(zx);
		System.out.println(kk);
		System.out.println(kk2);
		System.out.println(kk3);
	}
	
	public static String getOrderBydesc(String zx){
		String kk = "";
		String [] zxs = zx.split(" ");
		List<String>list = new ArrayList<String>();
		for(String a:zxs){
			if(list.contains(a.toLowerCase())){
				list.remove(a.toLowerCase());
			}else{
				list.add(a.toLowerCase());
			}
		}
		Collections.sort(list);
		/*
		for(int i=list.size()-1;i>=0;i--){
			kk+=list.get(i)+" ";
		}*/
		Collections.reverse(list);
		for(String a:list){
			kk+=a+" ";
		}
		return kk;
	}
	public static String getOrderBySet(String zx){
		String cgg = "";
		String [] zxs = zx.split(" ");
		TreeSet<String> ts = new TreeSet<String>();
		for(String a:zxs){
			a=a.toLowerCase();
			if(ts.contains(a)){
				ts.remove(a);
			}else{
				ts.add(a);
			}
		}
		ts=(TreeSet<String>) ts.descendingSet();
		for(String s:ts){
			cgg+=s+" ";
		}
		
		return cgg;
	}
	public static String getOrderByMap(String zx){
		TreeMap<String, Integer> map = new TreeMap<String,Integer>();
		String cgg = "";
		int count=1;
		String[]ts = zx.split(" ");
		for(String a:ts){
			a=a.toLowerCase();
			if(map.containsKey(a)){
				count=map.get(a)+1;
				map.put(a, count);
			}else{
				map.put(a, 1);
			}
		}
		map.descendingKeySet();
		for(Entry<String, Integer> e:map.entrySet()){
			if(e.getValue()==1){
				
				cgg+=e.getKey()+" ";
			}
		}
		return  cgg;
	}
		
}

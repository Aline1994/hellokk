package hellokk.collection.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
	public static void main(String[] args) {
		String [] s = {"a","b","a","b","c","a","b","ad","ab"};
		Map<String,Integer>map = new HashMap<String,Integer>();
		int count=0;
		for(int i=0;i<s.length;i++){
			if(!map.containsKey(s[i])){
				map.put(s[i], 1);
			}else{
				count = map.get(s[i])+1;
				map.put(s[i], count);
			}
		}
		System.out.println(map);
	}
}

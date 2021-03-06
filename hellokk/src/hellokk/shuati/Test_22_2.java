package hellokk;

import java.util.Comparator;
import java.util.TreeMap;

public class Test_22_2 {
	 private static String source;  
	  
	 static {  
	  source = "You Know I still Love You Baby And it will never change I want nobody nobody But You I want nobody nobody But You";  
	 }  
	  
	 /** 从文本读取单词，将所有不重复的单词按升(降)序显示，文本文件作为命令参数传递。 */  
	 public static void main(String[] args) {  
	  String[] ints = source.split("[ \n\t\r.,;:!?(){]");  
	  // 如果是升序输出，那么不需要自定义比较器了  
	  TreeMap<String, Integer> map = new TreeMap<String, Integer>(  
	    new ABCComparator());  
	  
	  for (int i = 0; i < ints.length; i++) {  
	   String key = ints[i].toLowerCase();  
	   if (key != null) {  
	    if (map.get(key) == null) {  
	     map.put(key, 1);  
	    } else {  
	     int value = map.get(key);  
	     map.put(key, value + 1);  
	    }  
	   }  
	  }  
	  System.out.println(map);  
	 }  
	}  
	  
	class ABCComparator implements Comparator<String> {  
	  
	 // 需要逆序 ，不是升序  
	 public int compare(String o1, String o2) {  
		 System.out.println("**");
	  return o2.compareTo(o1);  
	 }  
	}  

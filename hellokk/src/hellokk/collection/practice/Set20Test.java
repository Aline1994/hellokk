package hellokk.collection.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set20Test {
	public static void main(String[] args) {
		Set<String>set = null;
		String a="";
		for(int i=0;i<5;i++){
			System.out.println("请输入");
			Scanner scan = new Scanner(System.in);
			String s =scan.next();
			a=a+s+" ";
			set = AddString(a);
		}
		System.out.println(set);
	}
	
	public static Set<String> AddString(String as){
		String[]s = as.split(" ");
		Set<String> set = new HashSet<String>();
		for(String a:s){
			set.add(a);
		}
		return set;
	}
}

package com.bonc.shujujiegou;

import java.util.Stack;

public class CharacterPIPei {
	public static void main(String[] args) {
		String c = "{}[][]{}()";
		char[] bytes = c.toCharArray();
		boolean b = isMacth(bytes);
		System.out.println(b);
	}
	public static boolean isMacth(char[] bytes){
		Stack<Character>s = new Stack<Character>();
		s.push(bytes[0]);
		for(int i=1;i<bytes.length;i++){
			Character c1,c2;
			if(s.isEmpty()){
				s.push(bytes[i]);
				c1=s.peek();
				c2=bytes[++i];
			}else{
				c1=s.peek();
				c2=bytes[i];
			}
			if((c1.toString().equals("(")&&c2.toString().equals(")"))||(c1.toString().equals("{")&&c2.toString().equals("}"))||
					(c1.toString().equals("[")&&c2.toString().equals("]"))){
				s.pop();
				
			}else{
				s.push(c2);
			}
		}
		return s.isEmpty();
	}
}

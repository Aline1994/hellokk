package com.bonc.shujujiegou;

import java.util.Scanner;
import java.util.Stack;

public class CharactorPP {
	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
			String target = "({})[]";
			char[] bytes = target.toCharArray();
			System.out.println(bytes[0]);
			s.push(bytes[0]);
			System.out.println(s);
			
			for(int i=1;i<bytes.length;i++){
				Character c1,c2;
				if(s.isEmpty()){
					 s.push(bytes[i]);
					 c1 = s.peek();
					 c2 = bytes[++i];
					
				}else{
					 c1 = s.peek();
					 c2 = bytes[i]; 
				}
				
				if((c1.toString().equals("(")&&c2.toString().equals(")"))||
						(c1.toString().equals("[")&&c2.toString().equals("]"))||
						(c1.toString().equals("{")&&c2.toString().equals("}"))){
					s.pop();
				}else{
					s.push(c2);
				}
			}
			boolean isMatch = s.isEmpty();
			System.out.println(s);
			System.out.println(isMatch);
	
	}
}

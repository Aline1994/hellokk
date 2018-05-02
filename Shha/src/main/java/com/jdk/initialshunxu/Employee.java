package com.jdk.initialshunxu;

import java.util.Random;

public class Employee {
	private static int nextId;
	private int id;
	private String name;
	
	static{
		Random rand = new Random();
		nextId = rand.nextInt(100);
		System.out.println("s");
	}
	{
		id=nextId;
		nextId++;
		System.out.println("putong");
	}
	 Employee(){
		 System.out.println("gouzaowucan");
	 }
	 Employee(String name){
		 System.out.println("gouzaoyoucan");
		 this.name=name;
	 }
	 
	 public static void main(String[] args) {
		 Employee em = new Employee();
		Employee em1 = new Employee("zx");
	}
}

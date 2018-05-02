package com.jdk.array;

import java.util.Objects;

public class Item {
	private String description;
	private int partNum;
	
	public Item(String description,int apartnum){
		this.description=description;
		this.partNum = apartnum;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj==null||getClass()!=obj.getClass()){
			return false;
		}
		Item other =(Item)obj;
		return Objects.equals(description, other.description)&&partNum==other.partNum;
	}
	public int hashCode(){
		return Objects.hash(description,partNum);
	}
	public int compareTo(Item other){
		int diff = Integer.compare(partNum, other.partNum);
		return diff!=0?diff:description.compareTo(other.description);
	}
}

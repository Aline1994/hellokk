package com.jdk.base;

public class ReWriteEqual extends Object{
	char[]name;
	public ReWriteEqual(char[]name){
		this.name=name;
	}
	 public boolean equals(Object obj) {
	        if(this==obj){
	        	return true;
	        }
	        if(obj instanceof ReWriteEqual){
	        	ReWriteEqual obj1 = (ReWriteEqual)obj;
	        	int n = name.length;
	        	if(name.length==obj1.name.length){
	        		char[]name1=name;
	        		char[]obj2=obj1.name;
	        		int i=0;
	        		while(n--!=0){
	        			if(name1[i]!=obj2[i]){
	        				return false;
	        			}
	        			i++;
	        			
	        			return true;
	        		}
	        	}
	        }
	        return false;
	    }

}

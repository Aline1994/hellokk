package hellokk.collection.map;

import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(new R(3), "qwrdfaswf");
		tm.put(new R(87), "aasdasdas");
		System.out.println(tm);
	}
}
class R implements Comparable{
	int count;
	public R(int count){
		this.count = count;
	}
	public String toString(){
		return "R[count:"+count+"]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		R a = (R) o;
		return count >a.count?1:count<a.count?-1:0;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj!=null&&obj.getClass()==R.class){
			R a = (R) obj;
			return a.count == this.count;
		}
		return false;
	}
	
}
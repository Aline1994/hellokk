package hellokk.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetTest2 {
	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(-3));
		hs.add(new R(-2));
		System.out.println(hs);
		Iterator it = hs.iterator();
		R first = (R) it.next();
		first.count=-3;
		System.out.println(hs);
		hs.remove(new R(-3));
		System.out.println(hs);
		System.out.println("是否包含-3的R对象"+hs.contains(new R(-3)));
		System.out.println("是否包含-2的对象"+hs.contains(new R(-2)));
	}
}
class R{
	int count;
	public R(int count){
		this.count=count;
	}
	public String toString(){
		return "R[count:" + count +"]";
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj!=null&&obj.getClass()==R.class){
			R r = (R)obj;
			return this.count == r.count;
		}
		return false;
	}
	public boolean equalsre(Object obj){
		if(this==obj){
			return true;
		}
		if(obj!=null&&obj.getClass()==R.class){
			R r = (R) obj;
			return this.count == r.count;
		}
		return false;
	}
	public int hashCode(){
		return this.count;
	}
}
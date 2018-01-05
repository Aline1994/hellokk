package hellokk.collection.map;

import java.util.Hashtable;
//hashtable判断value相等的标准是equals返回true

public class MapEquals {
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new A(6000), "zx");
		ht.put(new A(709), "kk");
		ht.put(new A(43534), new B());
		System.out.println(ht);
		
	}
}
class A{
	int count;
	public A(int count){
		this.count = count;
	}
	public boolean equals(Object obj){
		if(obj==this){
			return true;
		}
		if(obj!=null&&obj.getClass()==A.class){
			A a = (A) obj;
			return this.count == a.count;
		}
		return false;
	}
	public int hashCode(){
		return this.count;
	}
}
class B{
	public boolean equals(Object obj){
		return true;
	}
}
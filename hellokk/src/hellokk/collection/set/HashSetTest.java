package hellokk.collection.set;

import java.util.HashSet;
//hashset中比较两个对象相等必须满足值相等hashcode值相等
public class HashSetTest {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new A());
		hs.add(new A());
		hs.add(new B());
		hs.add(new B());
		hs.add(new C());
		hs.add(new C());
		System.out.println(hs);
		HashSet hs2 = new HashSet();
		hs2.add("sda");
		hs2.add("123");
		System.out.println(hs2.iterator().next().hashCode());
	}
}
class A{
	public boolean equals(Object obj){
		return true;
	}
}
class B{
	public int hashCode(){
		return 1;
	}
}
class C{
	public boolean equals(Object obj){
		return true;
	}
	public int hashCode(){
		return 2;
	}
}
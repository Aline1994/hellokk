package hellokk.collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
/**
 * Enumeration是Iterator的古老版本，和Iteratior作用相似
 * @author iwpoo
 *
 */
public class EnumerationTest {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("123");
		v.add("abc");
		v.add("def");
		v.add("hij");
		Hashtable ht = new Hashtable();
		ht.put("语文", 78);
		ht.put("数学", 90);
		Enumeration er = v.elements();
		while(er.hasMoreElements()){
			System.out.println(er.nextElement());
		}
		Enumeration er1 = ht.keys();
		while(er1.hasMoreElements()){
			Object key = er1.nextElement();
			System.out.println(key+"key--->"+ht.get(key));
		}
	}
}

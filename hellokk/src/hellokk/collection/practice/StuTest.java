package hellokk.collection.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StuTest {
	public static void main(String[] args) {
		/*List<Student>set = new ArrayList<Student>();
		Student s1 = new Student("zx",12);
		Student s2 = new Student("kk",22);
		Student s3 = new Student("lj",27);
		Student s4 = new Student("zx",12);
		Student s5 = new Student("56",23);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		Iterator<Student>it= set.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getName());
		}
	}*/
		List set = new ArrayList();
		set.add(1);
		set.add(3);
		set.add(1);
		Iterator<Student>it= set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
}
}

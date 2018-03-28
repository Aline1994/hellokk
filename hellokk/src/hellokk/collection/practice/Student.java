package hellokk.collection.practice;

import java.util.Comparator;

public class Student implements Comparable  {
	private String name;
	private int age;
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		String name = s.getName();
		return this.name.compareTo(name);
	}

	
	
}
class Comparator1 implements Comparator{



	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student)o1;
		Student s2 = (Student)o1;
		return s1.getName().compareTo(s2.getName());
	}


}
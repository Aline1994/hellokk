package test;


public class Test {
	private volatile String name;
	
	public Test(String name){
		this.name =  name;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		Test t = new Test("zx");
		System.out.println(t.getName());
		t.setName("aaa");
		System.out.println(t.getName());
	}
}

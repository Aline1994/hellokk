package hellokk.leiandduixiang;
 class Creature {
	public Creature(){
		System.out.println("creature无参构造器");
	}
}

class Animal extends Creature{
	public Animal(String name){
		System.out.println("animal 带一个参数的构造器"+name);
	}
	public Animal(String name,int age){
		this(name);
		System.out.println("Animal带两个参数的构造器"+age);
	}
}

public class Wolf extends Animal{
	public Wolf(){
		super("zs",12);
		System.out.println("Wolf无参构造器");
	}
	public static void main(String[] args) {
		 new Wolf();
	}
}
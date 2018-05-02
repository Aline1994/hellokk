package com.jdk.duotai;

public class Test {
	public static void main(String[] args) {
		Rodent[] r = {new Mouse(),new Gerbil(),new Hamster()};
		for(int i=0;i<r.length;i++){
			r[i].eat();
			r[i].drink();
		}
	}
}

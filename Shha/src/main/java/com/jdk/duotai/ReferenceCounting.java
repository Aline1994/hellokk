package com.jdk.duotai;

public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[]c = {new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared)};
		for(Composing cs:c){
			cs.dispose();
		}
	}
}

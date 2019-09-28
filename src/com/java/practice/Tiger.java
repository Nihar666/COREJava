package com.java.practice;

public class Tiger extends Human {
	void eat(){
		System.out.println("Tiger is a carnivores:: eating only meat");
	}
	void roar(){
		System.out.println("tiger roar::");
	}
	void work(){
		super.eat();
	}
  public static void main(String[] args) {
	Tiger tg = new Tiger();
	tg.work();
}
}

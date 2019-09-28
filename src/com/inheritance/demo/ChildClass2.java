package com.inheritance.demo;

public class ChildClass2 {

	public static void main(String[] args) {
		BaseClass obj1 = new ChildClass();
		obj1.add();
		obj1.sub();
		//obj1.mul();//we can't use the child class method with the reference of BaseClass
		//obj1.div();

	}
	
	public void mul(){
		System.out.println("Hey I am in ChildClass and multiplication is 2500");
	}
	public void div(){
		System.out.println("Hey I am in ChildClass and div is 50");
	}
}

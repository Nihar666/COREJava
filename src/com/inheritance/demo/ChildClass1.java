package com.inheritance.demo;

public class ChildClass1 extends BaseClass {

	public static void main(String[] args) {
		BaseClass obj1 = new BaseClass();
		obj1.add();
		obj1.sub();
		

	}
	
	public void mul(){
		System.out.println("Hey I am in ChildClass and multiplication is 2500");
	}
	public void div(){
		System.out.println("Hey I am in ChildClass and div is 50");
	}

}

package com.java.practice;

public class ChildClass2 extends BaseClass {

	public static void main(String[] args) {
		//By using BaseClass reference and ChildClass object we can access only BaseClass method not the ChildClass method.
		BaseClass obj1 = new ChildClass2();
		obj1.add();
		obj1.sub();

	}
	public void mul(){
		System.out.println("Hey m in ChildClass2 and multiplication is::2444");
	}
	
	public void div(){
		System.out.println("Hey m in ChildClass2 and division is 23");
	}
}

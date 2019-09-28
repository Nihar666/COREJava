package com.java.practice;

public class ChildClass extends BaseClass {

	public static void main(String[] args) {
		//Using ChildClass reference and ChildClass object we can call all the method of both ChildClass and BaseClass.
		ChildClass obj1 = new ChildClass();
		obj1.add();//BaseClass
		obj1.div();//ChildClass

	}
	
	public void mul(){
		System.out.println("Hey m in ChildClass and multiplication is::2444");
	}
	
	public void div(){
		System.out.println("Hey m in Child Class and division is 23");
	}

}

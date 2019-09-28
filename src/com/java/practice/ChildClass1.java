package com.java.practice;

public class ChildClass1 extends BaseClass {

	public static void main(String[] args) {
		//Using BaseClass reference and BaseClass object we will call only BaseClass method.
		BaseClass obj1 = new BaseClass();
		obj1.add();

	}
	
	public void mul(){
		System.out.println("Hey m in ChildClass1 and multiplication is::343");
	}
	
	public void div(){
		System.out.println("Hey m in ChildClass1 and division is 12");
	}

}

package com.constructor.program;

public class Test {
	void m1(){
		System.out.println("instance method of m1");
	}
	
	//compiler will generate one default constructor
	public static void main(String[] args) {
		
		Test t = new Test();//default constructor// 
		
		t.m1();
	}

}

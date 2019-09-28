package com.java.practice;

public class FinalExample {
	
	public void method1(){
		final int x =100;
		System.out.println(x);
	}
	public static void main(String[] args) {
		int x=45;
		System.out.println(x);
		FinalExample obj = new FinalExample();
		obj.method1();
		
	}

}

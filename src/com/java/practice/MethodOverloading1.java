package com.java.practice;

public class MethodOverloading1 {
	public static void main(String[] args) {
		
		MethodOverloading1 obj = new MethodOverloading1();
		obj.add(23, 34);
		obj.add(34, 45, 56);
		
	}
	
	public void add(int a,int b){
		int c=a+b;
		System.out.println("Sum of number is::"+c);
	}
	
	public void add(int a,int b,int d){
		int c=a+b+d;
		System.out.println("Sum of number is::"+c);
	}

}

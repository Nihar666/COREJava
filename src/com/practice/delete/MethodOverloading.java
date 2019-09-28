package com.practice.delete;

public class MethodOverloading {
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.add(3.4, 4.5);
		obj.add(4, 5);
		obj.add(3, 4, 6);
		obj.add(3, 3.4);
		obj.add(4.4, 7);
		
	}
	
	public void add(int a,int b){
		int c = a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b,int d){//number of argument.
		int c=a=b+d;
		System.out.println(c);	
	}
	
	public void add(double a,double b){
		double c=a+b;
		System.out.println("This is double arugment addition ="+c);
	}
	
	public void add(int a,double b){
		System.out.println("int double argument.");
	}
	public void add(double a,int b){
		System.out.println("double int argument.");
	}

}

package com.java.practice;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading obj1 = new MethodOverloading();
		obj1.add(23, 34);
		obj1.add(23, 34, 56);
		obj1.add(34.5, 34.5);
	}

	public void add(double a, double b) {// Type of argument
		double c = a + b;
		System.out.println("Sum of the number is::" + c);
	}

	public void add(int a, double b) {
		double sum = a + b;
		System.out.println("Sum of numbers is::" + sum);
	}

	public void add(double a, int b) {// order of argument
		double sum = a + b;
		System.out.println("Sum of number is::" + sum);
	}

	public void add(int a, int b) {
		int c = a + b;
		System.out.println("Sum of number is " + c);
	}

	public void add(int a, int b, int d) {// Number of argument.
		int c = a + b + d;
		System.out.println("sum of number is " + c);
	}
}

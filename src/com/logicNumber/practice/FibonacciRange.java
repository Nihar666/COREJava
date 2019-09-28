package com.logicNumber.practice;

import java.util.Scanner;

public class FibonacciRange {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a range:::");
		
		int n = sc.nextInt();
		
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 0; i < n-2; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}

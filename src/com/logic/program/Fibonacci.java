package com.logic.program;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("etner range::");
		int n = sc.nextInt();
		
		int c,a=0,b=1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <n; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}

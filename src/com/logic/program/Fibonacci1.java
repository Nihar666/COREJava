package com.logic.program;

import java.util.Scanner;

public class Fibonacci1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range::");
		int n = sc.nextInt();
		
		
		int a=0,b=1,c;
		for (int i = 0; i < n-2; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}

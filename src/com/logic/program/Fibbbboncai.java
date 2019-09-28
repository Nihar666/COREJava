package com.logic.program;

import java.util.Scanner;

public class Fibbbboncai {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a range:");
		int n = sc.nextInt();
		
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 2; i < n; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}

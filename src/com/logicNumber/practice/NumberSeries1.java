package com.logicNumber.practice;

import java.util.Scanner;

public class NumberSeries1 {
	//1 2 4 7 11 .......10th
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a range::");
		int n = sc.nextInt();
		
		int a=1,b=2,c;
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 2; i <=n-2; i++) {
			c=b+i;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}

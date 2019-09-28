package com.logic.program;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int fact =1;
		if(n>0){
			for (int i = 1; i <=n; i++) {
				fact = fact*i;
			}
			System.out.println("factorial of"+n+"is::"+fact);
		}
	}

}

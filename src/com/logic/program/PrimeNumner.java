package com.logic.program;

import java.util.Scanner;

public class PrimeNumner {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number::");
		int n = sc.nextInt();
		
		boolean flag = true;
		for (int i = 2; i < n/2; i++) {
			if(n%i==0){
				flag = false;
			}
			if(flag){
				System.out.println("No . is prime number");
			}else{
				System.out.println("No. is not  prime");
			}
			
		}
		System.out.println(flag);
	}

}

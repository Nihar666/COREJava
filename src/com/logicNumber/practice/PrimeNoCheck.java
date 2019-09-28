package com.logicNumber.practice;

import java.util.Scanner;

public class PrimeNoCheck {
	/*public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number::");
		int n = sc.nextInt();
		
		boolean flag=true;
		
		for (int i = 2; i < n; i++) {
			if(n%i==0){
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("The number is prime::");
		}else{
			System.out.println("not a prime num..");
		}
		
	}*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number::");
		int n = sc.nextInt();
		
		boolean flag = true;
		for(int i=2; i<n;i++){
			if(n%i==0){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("The number is prime::");
		}else{
			System.out.println("not a prime::");
		}
	}

}

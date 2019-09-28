package com.practice.delete;

import java.util.Scanner;

public class PrimeNOO {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number::");
		int n = sc.nextInt();
		
		boolean flag=true;
		
		for (int i = 2; i <= n/2; i++) {
			if(n%i==0){
				flag=false;
			}
			
		}
		if(flag){
			System.out.println("The number is prime::"+n);
		}else{
			System.out.println("Not pallindoen");
		}
		
	}

}

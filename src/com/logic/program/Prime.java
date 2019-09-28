package com.logic.program;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number::");
		int num = sc.nextInt();
		
		Boolean flag = true;
		
		for (int i = 2; i < num; i++) {
			if(num%i==0){
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("The number "+num+" is a prime number.");
		}else{
			System.out.println("The number "+num+" is not a prime number.");
		}
		
		
	}

}

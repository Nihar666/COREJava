package com.logic.program;

import java.util.Scanner;

public class CheckPrimee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("etner a number::");
		int n = sc.nextInt();
		
		boolean flag= true;
		
		for (int i = 2; i <=n; i++) {
			if(n%i==0){
				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println("The given number is prime::");
		}else{
			System.out.println("This is not prime.::");
		}
		
		
	}

}

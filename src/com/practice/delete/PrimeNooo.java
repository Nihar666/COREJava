package com.practice.delete;

import java.util.Scanner;

public class PrimeNooo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		boolean flag = true;
		for(int i=2;i<n;i++){
			if(n%i==0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("prime");
		}else{
			System.out.println("not prime");
		}
	}

}

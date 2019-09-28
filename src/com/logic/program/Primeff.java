package com.logic.program;

import java.util.Scanner;

public class Primeff {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("terne a n");
		int n=sc.nextInt();
		
		boolean flag=true;
		for (int i = 2; i < n; i++) {
			if(n%i==0){
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("no is prime"+n);
		}else{
			System.out.println("not prime");
		}
	}

}

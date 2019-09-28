package com.logic.program;

import java.util.Scanner;

public class RevNo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		int rev=0,r;
		while(n>0){
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);
	}
	

}

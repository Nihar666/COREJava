package com.logic.program;

import java.util.Scanner;

public class PallindromeNumber {
	
	public static void main(String[] args) {
		
		int rev=0,r;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int t=n;
		while(n>0){
			
			r=n%10;
			rev=rev*10+r;
			n=n/10;	
		}
		System.out.println("The reverse is::"+rev);
		if(rev==t){
			System.out.println("Number is pallindrome::");
		}else{
			System.out.println("no is not pallindrome.");
		}
		
	}

}

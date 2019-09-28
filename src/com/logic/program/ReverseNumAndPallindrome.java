package com.logic.program;

import java.util.Scanner;

public class ReverseNumAndPallindrome {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		
		int n =sc.nextInt();
		int t=n;
		int rev=0,r;
		
		
	while(n>0){
			r=n%10;
			rev=rev*10+r;
			n=n/10;	
		}
		
		System.out.println(rev);	
		
		if(rev==t){
			System.out.println("The number is pallindrome ");
		}else{
			System.out.println("not");
		}
		
	}
	
	

}

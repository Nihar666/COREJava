package com.logicNumber.practice;

import java.util.Scanner;

public class ReverseNumberTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number::");
		int n = sc.nextInt();
		
		int r,rev=0;
		int t=n;
		
		while(n>0){
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		
		//System.out.println("The reverese number is::"+rev);
		if(rev==t){
			System.out.println("number is pallindrome");
		}else{
			System.out.println("Number is nnot pallindrome");
		}
	}

}

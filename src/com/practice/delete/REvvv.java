package com.practice.delete;

import java.util.Scanner;

public class REvvv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("etner a number::");
		int n = sc.nextInt();
		
		/*int rev=0,r;
		while(n>0){
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);*/
		
		
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < n-2; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}

}

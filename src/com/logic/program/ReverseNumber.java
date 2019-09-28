package com.logic.program;

import java.util.Scanner;

public class ReverseNumber {
	
	private Scanner sc;

	public void reverseNumber(){
		sc = new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		
		int rev=0,r;
		while(number!=0){
			r=number%10;
			rev=rev*10+r;
			number = number/10;
			
		}
		System.out.println("reversed number is: "+rev);
		
	}
	
	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		obj.reverseNumber();
		
	}

}

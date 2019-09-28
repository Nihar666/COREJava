package com.practice.delete;

import java.util.Scanner;

public class StringPallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String::");
		String n=sc.next();
		String rev="";
		for (int i = n.length()-1; i >=0; i--) 
			rev = rev+n.charAt(i);
		
		if(rev.equals(n)){
			System.out.println("String is pallindrome::");
		}else{
			System.out.println("not pallindrome::");
		}
		
	}

}

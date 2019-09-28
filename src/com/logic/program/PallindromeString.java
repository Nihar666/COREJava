package com.logic.program;

import java.util.Scanner;

public class PallindromeString {
	public static void main(String[] args) {
		
		String rev="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String::");
		String n = sc.next();
		
		for (int i = n.length()-1; i >=0; i--) {
			
			rev=rev+n.charAt(i);
		}
			if(n.equals(rev)){
				System.out.println("String is pallindrome::");
			}else{
				System.out.println("String is not pallindrome::");
			}
			
		}
		

		
	//}

}

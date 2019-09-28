package com.logic.program;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String n = sc.next();
		
		for (int i=n.length()-1;i>=0;i--) {
			System.out.print(n.charAt(i));
		}
		
		sc.close();
	}
}

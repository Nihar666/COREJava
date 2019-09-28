package com.string.pkg;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		/*String n ="nihar";
		for (int i =n.length()-1; i >=0; i--) {
			System.out.print(n.charAt(i));
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.println("etner a string::");
		String n = sc.next();
		for (int i = n.length()-1; i >=0; i--) {
			System.out.print(n.charAt(i));
		}
	}

}

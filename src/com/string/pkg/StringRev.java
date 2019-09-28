package com.string.pkg;

public class StringRev {
	public static void main(String[] args) {
		String n = "how r you";
		for (int i = n.length()-1; i >=0; i--) {
			System.out.print(n.charAt(i));
		}
	}

}

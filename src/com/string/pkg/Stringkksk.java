package com.string.pkg;

public class Stringkksk {
	public static void main(String[] args) {
		
		String str = "sachin is a great cricketer";
		
		String[] sp = str.split(" ");
		int len = sp.length;
		System.out.println("The number of word::="+len);
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}
	}

}

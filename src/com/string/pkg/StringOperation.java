package com.string.pkg;

public class StringOperation {
	public static void main(String[] args) {
		String s = "Nihar";
		String s1 = "Nihar";
		String s2 = new String("Nihar");
		System.out.println(s==s1);
		System.out.println(s1.equals(s));
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1);
		
		
	}

}

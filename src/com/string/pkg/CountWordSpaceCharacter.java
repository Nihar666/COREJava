package com.string.pkg;

public class CountWordSpaceCharacter {
	public static void main(String[] args) {
		String str = "India is going to win the series";
		//int len = str.length();
		String[] spl = str.split(" ");
		int len1 = spl.length;
		System.out.println("The number of word present is::"+len1);
		System.out.println("The number of space present is::"+(len1-1));
		
		/*String str1 =str.trim();
		System.out.println(str1);*/
		
		String str1 = str.replace(" ", "");
		System.out.println(str1);
		int len2 = str1.length();
		System.out.println("The number of character present is::"+len2);
	}
	

}

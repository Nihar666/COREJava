package com.string.pkg;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		
		String str ="   java is a programming language::   ";
		/*String str1="";
		
		char[] chars =str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(chars[i]!=' '){
				str1=str1+chars[i];
			}
		}
		
		System.out.println(str1);*/
		
		String str1=str.replaceAll(" ", "");
		
		System.out.println(str1);
	}

}

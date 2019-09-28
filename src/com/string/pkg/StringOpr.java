package com.string.pkg;

public class StringOpr {
	public static void main(String[] args) {
		
		String str = "selenium";
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.print(inp[j]);
		    }  	
		   }
		  }
		System.out.println();
		String replace = str.replace("e", " ");
		System.out.println(replace);
		
		for (int i = replace.length()-1; i >= 0; i--) {
			System.out.print(replace.charAt(i));
		}
		  
		}
		
	}


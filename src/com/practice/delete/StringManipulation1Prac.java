package com.practice.delete;

import java.util.HashMap;
import java.util.Map;

public class StringManipulation1Prac {
	public static void main(String[] args) {
		
		String n ="sachin nihar rahin";
		
		/*Map<Character,Integer> numVal = new HashMap<Character,Integer>();
		
		for (int i = 0; i < n.length()-1; i++) {
			
			char charat = n.charAt(i);
			
			if(numVal.containsKey(charat)){
				numVal.put(charat, numVal.get(charat)+1);
			}else{
				numVal.put(charat, 1);
			}	
		}
		
		System.out.println(numVal);*/
		
		
		String temp = " ";
		String rev = "";

		for (int i = n.length() - 1; i >= 0; i--) {

			rev = rev + n.charAt(i);
		}
		System.out.println(rev);

			String[] splt = rev.split(" ");
			int len = splt.length - 1;

			while (len >= 0) {
				temp = temp+ splt[len];
				temp = temp + " ";
				len--;
			}

			System.out.println(temp);
		

	}
}

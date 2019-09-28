package com.practice.delete;

import java.util.HashMap;

public class StringCharacterOccurence {
	public static void main(String[] args) {
		
		String str ="bazil won the football worldcup five times";
		
		HashMap<Character,Integer> numChar = new HashMap<Character,Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			
			char charat = str.charAt(i);
			
			if(numChar.containsKey(charat)){
				numChar.put(charat, numChar.get(charat)+1);
			}else{
				numChar.put(charat, 1);
			}
			
		}
		
		System.out.println(numChar);
	}

}

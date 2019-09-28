package com.practice.delete;

import java.util.HashMap;
import java.util.Map;

public class Occurence1 {
	public static void main(String[] args) {
		
		String str ="save tree save life";
		
		Map<Character,Integer> numChar = new HashMap<Character,Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(numChar.containsKey(ch)){
				numChar.put(ch, numChar.get(ch)+1);
			}else {
				numChar.put(ch, 1);
			}
		}
		
		System.out.println(numChar);
	}

}

package com.practice.delete;

import java.util.HashMap;

public class ChracteOccurence {
	
	public static void main(String[] args) {
		
		
		String n ="dsfjdsfjiffneeifehjlfje";
		
		HashMap<Character,Integer> numChar = new HashMap<Character,Integer>();
		for (int i = 0; i < n.length(); i++) {
			char charat = n.charAt(i);
			
			if(numChar.containsKey(charat)){
				numChar.put(charat, numChar.get(charat)+1);
			}else{
				numChar.put(charat, 1);
			}
		}
		
		System.out.println(numChar);
		
	}

}

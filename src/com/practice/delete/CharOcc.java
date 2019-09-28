package com.practice.delete;

import java.util.HashMap;

public class CharOcc {

	
	public static void main(String[] args) {
		
		String str = "sdjfdsfdie";
		
		HashMap<Character,Integer> numchar = new HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
			char charat = str.charAt(i);
			
			if(numchar.containsKey(charat)){
				numchar.put(charat, numchar.get(charat)+1);
			}else{
				numchar.put(charat, 1);
			}
		}
		
		System.out.println(numchar);
		
	}
}

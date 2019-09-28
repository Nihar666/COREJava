package com.practice.delete;

import java.util.HashMap;

public class Occurenceceeee {
	
	public static void main(String[] args) {
		
		String str="sdfdskfdsfdsjfklsdjflks";
		
		HashMap<Character,Integer> numchars = new HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
			char charat = str.charAt(i);
			
			if(numchars.containsKey(charat)){
				numchars.put(charat, numchars.get(charat)+1);
			}else{
				numchars.put(charat, 1);
			}
		}
		
		System.out.println(numchars);
	}

}

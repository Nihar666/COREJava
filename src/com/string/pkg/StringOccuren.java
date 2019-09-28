package com.string.pkg;

import java.util.HashMap;
import java.util.Map;

public class StringOccuren {
	public static void main(String[] args) {
		
		String n = "fjdsfjdslfsjl ";
		
		Map<Character,Integer> numchars = new HashMap<Character,Integer>();
		
		for (int i = 0; i < n.length(); i++) {
			char charat = n.charAt(i);
			/*if(!numchars.containsKey(charat)){
				numchars.put(charat, 1);
			}else{
				numchars.put(charat, numchars.get(charat)+1);
			}*/
			
			if(numchars.containsKey(charat)){
				numchars.put(charat, numchars.get(charat)+1);
			}else{
				numchars.put(charat, 1);
			}
		}
		
		System.out.println(numchars);
		
	}

}

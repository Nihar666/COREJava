package com.string.pkg;

import java.util.HashMap;
import java.util.Map;

public class StringSent1 {
	public static void main(String[] args) {
		/*String str = "I am Nihar";
		
		Map<Character,Integer> numchars = new HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
			char charat = str.charAt(i);
			if(!numchars.containsKey(charat)){
				numchars.put(charat, 1);
			}else{
				numchars.put(charat, numchars.get(charat)+1);
			}
			
		}
		System.out.println(numchars);*/
		
		String str = "i am nihar";
		
		Map<Character,Integer> numchars = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			char charat = str.charAt(i);
			if(!numchars.containsKey(charat)){
				numchars.put(charat, 1);
			}else{
				numchars.put(charat, numchars.get(charat)+1);
			}
		}
		System.out.println(numchars);
		
	}

}

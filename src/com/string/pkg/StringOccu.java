package com.string.pkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringOccu {
	public static void main(String[] args) {
		
		String str = "Save water save earth";
		
		Map<Character,Integer> numChar = new HashMap<Character,Integer>();
		
		char[] ch = str.toCharArray();
		
		for (char c : ch) {
			if(numChar.containsKey(ch)){
				System.out.println(numChar.put(c, numChar.get(c)+1));
			}else{
				System.out.println(numChar.put(c,1));
			}
				
		}
		Set<Character> keys = numChar.keySet();
		for (Character character : keys) {
			if(numChar.get(character)>=1)
			System.out.println(character+"============"+numChar.get(character));
		}
	}

}

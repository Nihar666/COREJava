package com.string.pkg;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringOccurence1 {
	public static void main(String[] args) {
		String str ="sachin tendulkar";
		Map<Character,Integer> numchar = new HashMap<Character,Integer>();
		char[] chars = str.toCharArray();
		
		for (Character ch : chars) {
			if(numchar.containsKey(ch)){
				numchar.put(ch, numchar.get(ch)+1);
			}else{
				numchar.put(ch, 1);
			}
		}
		Set<Character> keys = numchar.keySet();
		for (Character ch : keys) {
			if (numchar.get(ch)>=1) {
				System.out.println(ch+"============"+numchar.get(ch));
			}
		}
	}

}

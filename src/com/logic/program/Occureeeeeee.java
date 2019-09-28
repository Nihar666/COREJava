package com.logic.program;

import java.util.HashMap;
import java.util.Map;

public class Occureeeeeee {
	
	public static void main(String[] args) {
		
		String str ="sdfdslfjdslfkjdsfl";
		Map<Character,Integer> numchar = new HashMap<Character,Integer>();
		
		int len = str.length();
		System.out.println(len);
		
		for (int i = 0; i < len; i++) {
			char charat = str.charAt(i);
			if(!numchar.containsKey(charat)){
				numchar.put(charat, 1);
			}else{
				numchar.put(charat, numchar.get(charat)+1);
			}
		}
		
		System.out.println(numchar);
		
	}

}

package com.practice.delete;

import java.util.HashMap;
import java.util.Map;

public class Occurence {
	public static void main(String[] args) {
		String n = "sachinnihar";
		
		Map<Character,Integer> numchar = new HashMap<Character,Integer>();
		for (int i = 0; i < n.length(); i++) {
			char ch = n.charAt(i);
			if(!numchar.containsKey(ch)){
				numchar.put(ch, 1);
			}else{
				numchar.put(ch, numchar.get(ch)+1);
			}
		}
		System.out.println(numchar);
	}

}

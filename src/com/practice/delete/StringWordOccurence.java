package com.practice.delete;

import java.util.HashMap;
import java.util.Map;

public class StringWordOccurence {
	public static void main(String[] args) {
		
		String str ="save water save life save river save tree tree friend water";
		
		String[] words = str.split(" ");
		
		Map<String,Integer> wordCount = new HashMap<String,Integer>();
		
		for (String word : words) {
			if(wordCount.containsKey(word)){
				wordCount.put(word, wordCount.get(word)+1);
			}else{
				wordCount.put(word, 1);
			}
		}
		
		
		
		System.out.println(wordCount);
	}

}

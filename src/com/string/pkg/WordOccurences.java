package com.string.pkg;

import java.util.HashMap;

public class WordOccurences {
	public static void main(String[] args) {
		
		String n = "The quick little brown fox jumps over the little lazy brown dogs";
		HashMap<String, Integer> numWord = new HashMap<String,Integer>();
        String[] words = n.split(" ");

        for(String word : words){
            if(numWord.containsKey(word)){
            	numWord.put(word, numWord.get(word)+1);             
            }
            else{
            	numWord.put(word, 1);
            }
        }
            
        System.out.println(numWord);
        
        
        
        //Extracting of all keys of word count
       /* Set<String> wordsInString = wordCount.keySet();

        for(String word : wordsInString){
            if(wordCount.get(word)>1){
                System.out.println(word+":"+wordCount.get(word));
            }*/
		
	}

}

		
	
		
		
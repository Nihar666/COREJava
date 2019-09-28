package com.string.pkg;

public class RemoveJunkCharacters {
	public static void main(String[] args) {
		
		String s = "@@####789sachin&*^^%%nihar";
		/*s=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);//sachinnihar
*/		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);//789sachinnihar
		
		
	}

}

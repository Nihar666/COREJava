package com.collections.program;

import java.util.ArrayList;

public class CollectionArrayCNv {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("aaa");
		al.add("bbbb");
		al.add("cccc");
		al.add("ddd");
		
		String[] s = new String[al.size()];
		al.toArray(s);
		
		for(String str:al){
			System.out.println(str);
		}
	}

}

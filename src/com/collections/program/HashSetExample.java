package com.collections.program;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {
	
	
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		
		h.add("sachin");
		h.add("dfdsf");
		h.add(null);
		h.add("nihar");
		System.out.println(h.add("sachin"));
		
		System.out.println(h);
	}

}

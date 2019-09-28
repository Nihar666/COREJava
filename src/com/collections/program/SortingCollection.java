package com.collections.program;

import java.util.ArrayList;
import java.util.Collections;

public class SortingCollection {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("sachin");
		al.add("nihar");
		al.add("shakti");
		al.add("rabi");
		
		System.out.println("before sorting="+al);
		
		Collections.sort(al);
		
		System.out.println("after sorting="+al);
		
		
	}

}

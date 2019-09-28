package com.collections.program;

import java.util.ArrayList;
import java.util.Arrays;
//conversions of arrays to collection
public class ArrayCollectionCnv {
	public static void main(String[] args) {
		String[] s = {"nihar","sachin","naren"};
		
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s));
		al.add("aaa");
		al.add("bbb");
		
		for(String str :al){
			System.out.println(str);
		}
	}

}

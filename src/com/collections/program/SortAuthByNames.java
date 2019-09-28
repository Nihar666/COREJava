package com.collections.program;

import java.util.ArrayList;
import java.util.Collections;

public class SortAuthByNames {
	public static void main(String[] args) {
		ArrayList<Author> al = new ArrayList<Author>();
		al.add(new Author("nihar","miller","driven my way"));
		al.add(new Author("sachhin","Tendulkar","Playing my way"));
		al.add(new Author("Yuvi","singh","taste of my life"));
		Collections.sort(al);
		
		for (Author author : al) {
			System.out.println(author.firstName+" "+author.lastName+" "+author.bookName);
		}
	}

}

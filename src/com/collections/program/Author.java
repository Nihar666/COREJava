package com.collections.program;

public class Author implements Comparable<Author>{
    
    String firstName;
    String lastName;
    String bookName;
    Author(String first, String last, String book){
    	this.firstName = first;
    	this.lastName = last;
    	this.bookName = book;
    }
	@Override
	public int compareTo(Author o) {
		int last = this.lastName.compareTo(o.lastName);
		return last == 0? this.firstName.compareTo(o.firstName) : last;
	}

}

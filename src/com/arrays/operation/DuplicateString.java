package com.arrays.operation;

public class DuplicateString {
	
	public static void main(String[] args) {
		String[] names ={"java","c","c++","java","selenium"};
		
		for (int i = 0; i < names.length; i++) {
			for (int j = i+1; j < names.length; j++) {
				if(names[i].equals(names[j])){
					System.out.println("Duplicate element is found::"+names[i]);
				}
			}
		}
	}

}

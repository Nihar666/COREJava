package com.collections.program;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		//Emp e = new Emp(111,"Ratan");
		//Student s = new Student(1,"xxx");
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("ratan");
		al.add("nihar");
		al.add(10.5);
		
		
		System.out.println(al);
		
		al.add(1, "anu");
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(0);
		System.out.println(al);
		
		System.out.println(al.contains("nihar"));
		
		System.out.println(al.isEmpty());
		
		al.clear();
		
		System.out.println(al.isEmpty());
		
		
	}

}

package com.collections.program;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmp {
	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(333,"sachin"));
		al.add(new Emp(222,"nihar"));
		al.add(new Emp(111,"shakti"));
		
		Collections.sort(al);
		
		for(Emp e:al){
			System.out.println(e.eid+"=====");
		}
	}

}

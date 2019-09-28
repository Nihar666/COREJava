package com.collections.program;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
		
    	ArrayList obj1 = new ArrayList();
    	obj1.add(53849);
    	obj1.add('M');
    	obj1.add("selenium");
    	obj1.add("selenium");
    	obj1.add(12.34);
    	
    	System.out.println(obj1);
    	
    	System.out.println(obj1.get(3));
    	System.out.println(obj1.get(4));
    	//System.out.println(obj1.get(5));
    	System.out.println("==============");
    	for (int i = 0; i < obj1.size(); i++) {
			System.out.println(obj1.get(i));
		}
    	
    	System.out.println("=============");
    	
    	for(Object abc:obj1){
    		System.out.println("values are :"+abc);
    	}
    	System.out.println("==============");
    	
    	Iterator it = obj1.iterator();
    	while(it.hasNext()){
    		Object value =it.next();
    		System.out.println("values are ::"+value);
    	}
	}
}

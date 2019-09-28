package com.practice.delete;

public class ChildClass extends ParentClass {

	public void children(){
		System.out.println("No children::");
		
	}
	
	public void favsport(){
		System.out.println("cricket");
	}
	
	public static void main(String[] args) {
		/*ChildClass obj1 = new ChildClass();
	    obj1.children();
	    obj1.house();
	    
	    System.out.println();
	    ParentClass obj2 = new ParentClass();
	    obj2.children();
	    obj2.house();*/
	    
	    System.out.println();
	    ParentClass obj3 = new ChildClass();
	    obj3.children();
	    obj3.house();
	   
	    
		
	}
	
}

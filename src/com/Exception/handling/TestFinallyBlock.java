package com.Exception.handling;

public class TestFinallyBlock {
	public static void main(String[] args) {
		try{
			int data = 25/5;
		}catch(NullPointerException e){
			System.out.println(e);
		}
		finally{
			System.out.println("finally block executed.");
		}
		
		System.out.println("rest of the code");
	}

}

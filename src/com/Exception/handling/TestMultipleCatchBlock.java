package com.Exception.handling;

public class TestMultipleCatchBlock {
    public static void main(String[] args) {
		try{
			int a[] = new int[5];
			a[5]=30/0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("task1 completed");
		}
		catch(ArithmeticException e){
			System.out.println("task2 comppleted");
		}
		catch(Exception e){
			System.out.println("task3 completed");
		}
		System.out.println("rest of the code:;");
	}
}

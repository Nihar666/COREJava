package com.Exception.handling;

/*In this program we are checking the Student age if the student age<12
and weight <40 then our program should return that the student is not
		eligible for registration.
*/
public class ThrowExample {
    static void checkEligibility(int stuage, int stuweight){
    	if(stuage<12 && stuweight<40){
    
    		throw new ArithmeticException("Student is not eligible for registration.");
    	}
    	else{
    		System.out.println("Student Entry is valid");
    	}
    }
    
    public static void main(String[] args) {
		System.out.println("welcome to the registration process:::");
		checkEligibility(10, 30);
		System.out.println("have a nice day.");
	}
}

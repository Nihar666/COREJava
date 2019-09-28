package com.arrays.operation;

public class SingleArrayDemo {
	public static void main(String[] args) {
		//20 bytes of memory
		int student_id[] = new int[5];
		
		student_id[0]= 78;
		student_id[1]= 45;
		student_id[2]= 47;
		student_id[3]= 89;
		student_id[4]= 34;
		
		int sizeOFArray = student_id.length;
		System.out.println("length of the array"+sizeOFArray);
		
		for (int i = 0; i <= student_id.length-1; i++) {
			System.out.println("Student id is ::"+student_id[i]);
		}
		
		String student_name[] = new String[5];
		student_name[0]="Nihar";
	}
	

}

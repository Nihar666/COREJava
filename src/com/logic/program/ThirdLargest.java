package com.logic.program;

public class ThirdLargest {
	
	public static void main(String[] args) {
		
		int[] arr = {34,56,67,56,78,78,99,99,345,23,6,88};
		
		int fh=-1,sh=-1,th=-1,frh=-1,fifh=-1;
		
		for (int i = 0; i < arr.length; i++) {
			int num=arr[i];
			
			if(num>=fh){
				fifh=frh;
				frh=th;
				th=sh;
				sh=fh;
				fh=num;
			}else if(num>=sh){
				fifh=frh;
				frh=th;
				th=sh;
				sh=num;
			}else if(num>=th){
				fifh=frh;
				frh=th;
				th=num;
			}else if(num>=frh){
				fifh=frh;
				frh=num;
			}else if(num>fifh){
				fifh=num;
			}
			
			
			
		}
		System.out.println(fh);
		
		System.out.println(sh);
		System.out.println(th);
		System.out.println(frh);
		System.out.println(fifh);
		
	}

}

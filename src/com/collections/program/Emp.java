package com.collections.program;

public class Emp implements Comparable {
     
	//instance variable
	
	int eid;
	String ename;
	
	Emp(int eid,String ename)//local variables
	{
		//conversion of local to instance
		this.eid=eid;
		this.ename=ename;
		
	}
	
	@Override
	public int compareTo(Object o) {
		Emp e = (Emp)o;
		if(eid==e.eid){
			return 0;
		}
		else if(eid>e.eid){
			return 1;
		}
		else{
			return -1;
		}
	}
      
}

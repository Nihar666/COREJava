package com.pkg.oops;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank hb = new HDFCBank();
		hb.credit();
		hb.loan();
		hb.debit();
		hb.funds();
		
		System.out.println("================");
		
		Bank b=new HDFCBank();
		b.loan();
		b.credit();
		b.debit(); 
		

	}

}

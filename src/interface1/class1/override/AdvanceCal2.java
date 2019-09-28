package interface1.class1.override;

public class AdvanceCal2 implements Calc {
     public static void main(String[] args) {
    	 Calc obj1 = new AdvanceCal2();
   	      obj1.add();
   	      obj1.sub();
   	      
	}
     
     public void add() {
 		System.out.println("I am in add method");
 		
 	}

 	
 	public void sub() {
 		System.out.println("I am in sub method");
 		
 	}

}

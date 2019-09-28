package interface1.class1.override;

public class AdvanceCal implements Calc{
      public static void main(String[] args) {
    	  AdvanceCal obj1 = new AdvanceCal();
    	  obj1.add();
    	  obj1.sub();
    	  obj1.calculateCos();
    	  obj1.calculateSin();
	}
      
    public void calculateSin(){
    	System.out.println("I am in Advance-sin method");
    }
    
    public void calculateCos(){
    	System.out.println("I am in Advance-Cos  method");
    }
	
	public void add() {
		System.out.println("I am in add method");
		
	}

	
	public void sub() {
		System.out.println("I am in sub method");
		
	}

}

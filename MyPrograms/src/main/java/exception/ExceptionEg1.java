package exception;

public class ExceptionEg1 {
      public static void add() {
    	  try {
    	  int a=5;
    	  int b=0;
    	  int c=a/b;
    	  System.out.println(c);
    	  }
    	  //catch(ArithmeticException d) {
    	//	  System.out.println("Skip" +d);
    	 // }
    	  finally {
    		  System.out.println("Thank You");
    	  }
      }
	public static void main(String[] args) {
		ExceptionEg1 a=new ExceptionEg1();
		a.add();
		System.out.println("Before exception");

	}

}

package exception;

public class ThrowEg1 {
	int age=10;
	public void display() {
		if(age>=18) {
			System.out.println("Eligible");
		}
		else {
			throw new ArithmeticException("Not Eligible");
		}
	}


	public static void main(String[] args) {
		ThrowEg1 b=new ThrowEg1();
		b.display();

	}

}

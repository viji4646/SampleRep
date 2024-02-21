package inheritance;

public class MultilvlInhEg3 extends MultilvlInhEg2{
	public void display3() {
		System.out.println("Child class of MultilvlInhEg2");
	}

	public static void main(String[] args) {
		MultilvlInhEg3 a=new MultilvlInhEg3();
		a.display1();
		a.display2();
		a.display3();
		

	}

}

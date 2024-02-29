package interfacepgm;

public class MultipleInhEg3 implements MultipleInhEg2,MultipleInhEg1 {

	public static void main(String[] args) {
		MultipleInhEg3 obj=new MultipleInhEg3();
		obj.display();
		obj.display1();

	}

	@Override
	public void display() {
		System.out.println("Eg for");
		
	}

	@Override
	public void display1() {
		System.out.println("Multiple Inheritance");
		
	}

}

package inheritance;

public class InheritanceEg2 extends InheritanceEg1  {
	public void print() {
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		InheritanceEg2 obj=new InheritanceEg2();
		obj.display();
		obj.print();
	}

}

package abstraction;

public class AbstractEg2 extends AbstractEg1 {

	public void display1() {
		System.out.println("Abstract Method");
		
	}
	public static void main(String[] args) {
		AbstractEg2 obj=new AbstractEg2();
		obj.display();
		obj.display1();

	}

	
	

}

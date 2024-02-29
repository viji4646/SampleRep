package interfacepgm;

public class InterfaceEg2 implements InterfaceEg1 {

	public static void main(String[] args) {
		InterfaceEg2 obj=new InterfaceEg2();
		obj.display();

	}

	@Override
	public void display() {
		System.out.println("Interface");
		
	}

}

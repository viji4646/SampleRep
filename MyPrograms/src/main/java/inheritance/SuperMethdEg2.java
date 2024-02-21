package inheritance;

public class SuperMethdEg2 extends SuperMethdEg1 {
	int b=10;
	public void display() {
		System.out.println(b);
		super.display();
	}


	public static void main(String[] args) {
		SuperMethdEg2 s1=new SuperMethdEg2();
		s1.display();
	}

}

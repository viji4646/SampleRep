package inheritance;

public class SuperEg4 extends SuperEg3 {
	int v=20;
	public void disp() {
		System.out.println(v);
		System.out.println(super.v);
	}

	public static void main(String[] args) {
		SuperEg4 b=new SuperEg4();
		b.disp();

	}

}

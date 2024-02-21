package inheritance;

public class SuperEg2 extends SuperEg1 {
	String a="White";
	public void display2() {
		
		System.out.println(a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		SuperEg2 s=new SuperEg2();
		
		s.display2();

	}

}

package inheritance;

public class SuperMethdEg4 extends SuperMethdEg3 {
	String b="hello";
	public void disp1() {
		System.out.println(b);
		super.disp1();
	}

	public static void main(String[] args) {
		SuperMethdEg4 bj=new SuperMethdEg4();
		bj.disp1();
	}

}

package inheritance;

public class HierarchyInhEg3 extends HierarchyInhEg1 {
	public void print3() {
		System.out.println("Second child class of HierarchyInhEg1");
	}

	public static void main(String[] args) {
		HierarchyInhEg3 c=new HierarchyInhEg3();
		c.print1();
		c.print3();

	}

}

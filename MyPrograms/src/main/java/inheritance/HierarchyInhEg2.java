package inheritance;

public class HierarchyInhEg2 extends HierarchyInhEg1 {
	public void print2() {
		System.out.println("First child class of HierarchyInhEg1 ");
	}

	public static void main(String[] args) {
		HierarchyInhEg2 b=new HierarchyInhEg2();
		b.print1();
		b.print2();

	}

}

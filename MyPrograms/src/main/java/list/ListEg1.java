package list;
import java.util.ArrayList;
import java.util.List;
public class ListEg1 {

	public static void main(String[] args) {
		List<String> a=new ArrayList();
		
			a.add("Hi");
			a.add("Hello");
			a.add("Pgm");
			a.add("Hi");
		
		System.out.println(a);
		a.set(1,"World");
		System.out.println(a);
		int b=a.indexOf("Hi");
		System.out.println(b);
		int c=a.lastIndexOf("Hi");
		System.out.println(c);
	    a.remove("Hi");
	    System.out.println(a);
	    a.remove(2);
	    System.out.println(a);
	    String d=a.get(1);
	    System.out.println(d);
	    
	    
	}


}

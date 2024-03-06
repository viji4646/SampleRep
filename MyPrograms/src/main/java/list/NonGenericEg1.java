package list;
import java.util.ArrayList;

public class NonGenericEg1 {

	public static void main(String[] args) {
		ArrayList obj= new ArrayList();
		obj.add(1);
		obj.add("Hi");
		obj.add('v');
		System.out.println(obj);
	}

}

package list;
import java.util.ArrayList;
import java.util.List;
public class ListEg2 {

	public static void main(String[] args) {
		List<String> obj=new ArrayList<String>();
		obj.add("Sample");
		obj.add("Pgm");
		obj.add("For");
		obj.add("List");
		System.out.println(obj);
		boolean a=obj.contains("Pgm");
		System.out.println(a);
	}

}

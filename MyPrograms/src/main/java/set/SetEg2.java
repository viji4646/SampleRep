package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEg2 {

	public static void main(String[] args) {
		Set<String> obj = new LinkedHashSet<String>();  
		obj.add("This");
		obj.add("is");
		obj.add("another");
		obj.add("Eg");
		obj.add("for");
		obj.add("Set");
		System.out.println(obj);
		Iterator obj1= obj.iterator();// to iterate a set
		//boolean a=obj1.hasNext();
		 while (obj1.hasNext()) {   
	            System.out.println(obj1.next());   
		 }
		
		

	}

}

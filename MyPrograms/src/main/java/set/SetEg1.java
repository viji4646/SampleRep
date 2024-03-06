package set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetEg1 {

	public static void main(String[] args) {
		Set<String> obj = new LinkedHashSet<String>();  
		obj.add("This");
		obj.add("is");
		obj.add("an");
		obj.add("Eg");
		obj.add("for");
		obj.add("Set");
		System.out.println(obj);
		boolean a=obj.contains("Set");// Does the set contains "Set"?
		System.out.println(a);
		boolean b=obj.isEmpty();// Check whether the set is null/not
		System.out.println(b);
		boolean c= obj.remove("Hi");// Returns whether a string is removed/not
		System.out.println(c);
		int d=obj.size();// Find size of set
		System.out.println(d);
		obj.add("Pgm");
		
		
		
		
		Set<String> obj2 = new LinkedHashSet<String>(); //  Does the new set contains the data in old set?
		obj2.add("This");
		obj2.add("Eg");
		obj2.add("for");
		obj.containsAll(obj2);
		
		
		

	}

}

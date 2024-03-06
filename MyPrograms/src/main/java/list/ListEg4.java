package list;

import java.util.ArrayList;

import java.util.Iterator;

public class ListEg4 {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList();
		obj.add("Pgm");
		obj.add("for");
		obj.add("Iterate");
		Iterator<String> i=obj.iterator();
		while (i.hasNext()) {   
            System.out.println(i.next());
           
	 }
		i.remove();
		System.out.println(obj);

	}

}

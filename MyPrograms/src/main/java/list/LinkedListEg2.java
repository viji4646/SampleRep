package list;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListEg2 {

	public static void main(String[] args) {
		LinkedList<String> obj=new LinkedList<String>();
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

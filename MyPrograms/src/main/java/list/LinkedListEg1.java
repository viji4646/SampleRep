package list;

import java.util.LinkedList;

public class LinkedListEg1 {

	public static void main(String[] args) {
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("This");// Add elements 2 set
		obj.add("is");
		obj.add("a");
		System.out.println(obj);
		LinkedList<String> obj1=new LinkedList<String>();
		obj1.add("Program");
		obj1.add("for");
		obj1.add("LinkedList");
		obj.addAll(obj1);// Add elements 2 first set
		System.out.println(obj);
		System.out.println(obj1.contains("for"));// find an element in a set
		System.out.println(obj.get(3));// find an element in an index 
		System.out.println(obj1.isEmpty());// chk a list is empty/not
		System.out.println("Removed element is:"+obj1.remove(2));// To remove an element
		System.out.println("The size of the list is:"+obj.size());// size of a list
		

	}

}

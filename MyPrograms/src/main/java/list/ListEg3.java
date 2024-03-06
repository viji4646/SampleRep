package list;


import java.util.ArrayList;


public class ListEg3 {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList();
		obj.add("This");
		obj.add("is");
		obj.add("an");
		obj.add("Eg");
		obj.add("for");
		obj.add("ArrayList");
		obj.add("Pgm");
		//System.out.println(obj);
		ArrayList<String> obj1=new ArrayList();// merge 2 lists
		obj1.add("An");
		obj1.add("Eg");
		obj1.add("for");
		obj1.add("Add a set");
		obj.addAll(obj1);
		System.out.println(obj);
		ArrayList<String> obj2=new ArrayList();
		obj2.add("An");
		obj2.add("Eg");
		obj2.add("for");
		obj2.add("find an element");
		boolean a=obj2.contains("Eg");// find an element
		System.out.println(a);
		String b=obj2.get(2);// find an element in an index
		System.out.println(b);
		boolean c=obj.isEmpty();// chk a list is empty/not
		System.out.println("Is the list empty?:"+c);
		obj2.remove(2);// remve an elem in a index
		System.out.println(obj2);
		System.out.println(obj1.size());// size f list
		
		
	}

}

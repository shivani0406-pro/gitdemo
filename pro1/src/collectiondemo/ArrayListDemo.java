package collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("Java");
		al.add("Python");
		al.add("SQL");
		al.add("PHP");
		al.add("Python");
		System.out.println("1st way to print");
		System.out.println(al);
		System.out.println("2nd way.......");
		for(String s:al) {
			System.out.println(s);
		}
		System.out.println("3rd way...........");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("4th way......");
		for(Object ob:al) {
			String s = ob.toString();
			System.out.println(s);
		}
		System.out.println("Operations on ArrayList");
		System.out.println(al.get(0));
		
		al.set(2, "PLSQL");
		System.out.println(al);
		
		al.remove(4);
		System.out.println("After removing "+al);
		
		Collections.sort(al);
		System.out.println("After sorting");
		System.out.println(al);

	}

}

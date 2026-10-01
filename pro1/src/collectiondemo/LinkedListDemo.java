package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("React");
		ll.add("Angular");
		ll.add("Spring Boot");
		
		System.out.println("1st way..........");
		System.out.println(ll);
		
		System.out.println("2nd way..........");
		for(String s: ll) {
			System.out.println(s);
		}
		System.out.println("3rd way..........");
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("ArrayList to LinkedList");
		ArrayList<String>al = new ArrayList<>();
		al.add("Java");
		al.add("Python");
		al.add("SQL");
		al.add("PHP");
		al.add("Python");
		
		LinkedList<String>l2 = new LinkedList<>();
		l2.addAll(al);
		System.out.println("All data in linkedlist "+l2);
		
		System.out.println("Forward traverse");
		ListIterator<String> fb = ll.listIterator();
		while(fb.hasNext()) {
			System.out.println(fb.next());
		}
		
		System.out.println("Backward traverse");
		while(fb.hasPrevious()) {
			System.out.println(fb.previous());
		}
	}

}

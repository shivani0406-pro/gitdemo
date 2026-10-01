package collectiondemo;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(50);
		ts.add(20);
		ts.add(70);
		ts.add(10);
		ts.add(40);
		
		System.out.println("TreeSet: "+ts); //treeset maintain ascending order
		System.out.println("Size: "+ts.size()); 
		System.out.println("Contains 20? "+ts.contains(20));
		System.out.println("First Element: "+ts.first());
		System.out.println("Last Element: "+ts.last());
		System.out.println("Higher than 20: "+ts.higher(20)); //prints next immediate number
		System.out.println("Lower than 20: "+ts.lower(20)); //prints previous immediate number
		System.out.println("Ceiling of 25: "+ts.ceiling(25));//upper node
		System.out.println("Floor of 25: "+ts.floor(25));//lower node
		ts.remove(40);
		System.out.println("After Remove: "+ts);
		System.out.println("Removed First: "+ts.pollFirst());//removes the first element and returns the key.
		System.out.println("Removed Last: "+ts.pollLast());//same as above for last key.
		System.out.println("After poll operation: "+ts);
		System.out.println("Is Empty? "+ts.isEmpty());
		ts.clear();
		System.out.println("After clear: "+ts);
		System.out.println("Is Empty? "+ts.isEmpty());
		
	}

}

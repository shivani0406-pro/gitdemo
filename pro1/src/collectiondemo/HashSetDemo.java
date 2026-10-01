package collectiondemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<>();
		hs.add("Java");
		hs.add("Python");
		hs.add("SQL");
		hs.add("PHP");
		hs.add("Python"); //Duplicate not allowed
		hs.add("abcd");
		hs.add(null); // null is allowed in hashset
		hs.add(null); // null is not allowed repeatedly as it not allows duplication
		System.out.println(hs); // Order Not maintained
		
		boolean b = hs.contains("abcd");
		System.out.println(b);
		
		hs.remove("abcd");
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.removeIf(str->hs.contains("sql"));
		//removes all elements if condition satisfied
		
		System.out.println(hs);
		
		hs.clear(); //clears all elements without condition 
		System.out.println(hs);
		
		//Order not maintained so use LinkedHashSet instead 
	}

}

package collectiondemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeMap is in ascending order of key
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(100, "Anand");
		map.put(102, "Rahul");
		map.put(101, "Vijay");
		map.put(103, "Pranita");
		//map.put(null, "Pranita");   // Map does not take key as null.
		map.put(104, null);
		
		for(Map.Entry m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		Iterator<Entry<Integer, String>>itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

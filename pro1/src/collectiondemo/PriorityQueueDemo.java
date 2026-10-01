package collectiondemo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=111;i<1000;i=i+111) {
			pq.add(i);
		}
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.poll();//removes first head element
		System.out.println(pq);
		pq.add(50);// adds least one in the first place
		System.out.println("after adding new number check the sequence");
		System.out.println(pq);
		pq.add(335);// adds the element anywhere(not in order)
		System.out.println("Not a sorted order at all. only least at first place");
		System.out.println(pq);
		Iterator itr = pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		boolean result = pq.remove(2);
		System.out.println("Is the element 2 removed? "+result);
		System.out.println(pq);
		
		//convert priority queue object into array for sorting
		Object[] pqele = pq.toArray();
		//Collections.sort(pq); not allowed as Collections works only for list
		Arrays.sort(pqele);
		System.out.println(pqele);
		
		for(Object o: pqele) {
			System.out.print(o.toString()+",");
		}
		System.out.println();
		System.out.println("Elements in sorted order(by polling)");
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());//removes first element every time
		}
		System.out.println(pq);
	}

}

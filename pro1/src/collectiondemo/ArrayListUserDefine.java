package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

class Mobile{
	private String name;
	private int price;
	
	public Mobile(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}

public class ArrayListUserDefine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 = new Mobile("Nokia", 13232);
		Mobile m2 = new Mobile("Samsung",43435);
		Mobile m3 = new Mobile("Iphone", 343434);
		Mobile m4 = new Mobile("Realme",132343);
		
		ArrayList<Mobile>am = new ArrayList<>();
		am.add(m1);
		am.add(m2);
		am.add(m3);
		am.add(m4);
		
		Iterator<Mobile> itr = am.iterator();
		while(itr.hasNext()) {
			Mobile k = itr.next();
			//System.out.println(k.name+" "+k.price);
			System.out.println("Name: "+k.getName()+" "+"Price: "+k.getPrice());
		}

	}

}

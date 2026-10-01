package oopstest;

import oops.Product;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(1,"bag",9000);
		p1.display();
		
		Product p2 = new Product();
		p2.display();
		
		Product p3 = new Product(p1);
		p3.display();
		
		double total = p1.getPrice()+p2.getPrice()+p3.getPrice();
		/* System.out.println(total); */
		
		
		
		
		

	}

}

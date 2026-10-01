package oopsrevision;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Product products[] = new Product[5];
		
		for(int i=0;i<products.length;i++) {
			products[i] = new Product();
			
			System.out.println("Enter product id");
			products[i].setProductId(sc.nextInt());
			
			System.out.println("Enter product name");
			products[i].setProductName(sc.next());
			
			System.out.println("Enter product price");
			products[i].setPrice(sc.nextDouble());
			
		}
		
		System.out.println("Products costing less than rs.500");
		for(Product product: products) {
			if(product.getPrice()<500) {
				System.out.println(product.toString());
			}
		}

	}

}

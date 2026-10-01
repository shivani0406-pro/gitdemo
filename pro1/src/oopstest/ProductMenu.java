package oopstest;

import java.util.Scanner;

import oops.Product;

public class ProductMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		
		int choice;
		do {
			System.out.println("\n ------------ PRODUCT MENU-------------------------");
			System.out.println("1. Add Product");
			System.out.println("2. Display Product");
			System.out.println("3. Update Product");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Enter Id");
				p.setId(sc.nextInt());
				System.out.println("Enter name: ");
				p.setName(sc.next());
				System.out.println("Enter Price: ");
				p.setPrice(sc.nextDouble());
				break;
			case 2: 
				p.display();break;
				
			case 3:
				System.out.println("Enter new price: ");
				double x = sc.nextDouble();
				
				p.setPrice(x);
				System.out.println("Updated");break;
			case 4: 
				System.out.println("Exiting.....");break;
				default:
					System.out.println("Invalid choice");
				
			}
		}while(choice!=4);
		sc.close();

	}

}

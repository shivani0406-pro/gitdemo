package oopsrevision;

import java.util.Scanner;

public class Product1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Product1[] products = new Product1[3];
		
		
		
		
		
		//------------------------MENU DRIVEN -----------------------------------
		
		int choice;
		do {
			System.out.println("\n----------Product Menu------------------");
			System.out.println("1.Add Products");
			System.out.println("2.Display Product");
			System.out.println("3.Update Product");
			System.out.println("4.Exit");
			System.out.print("Enter your choice");
			
			 choice = sc.nextInt();
			 switch(choice) {
			 case 1:
				 System.out.println("Add 3 products");
				 for(int i=0;i<products.length;i++) {
						
						System.out.println("Enter Product id");
						System.out.println("Enter Product name");
						System.out.println("Enter Product price");
						
						products[i] = new Product1(sc.nextInt(),sc.next(),sc.nextDouble());
						
						
					}
				 break;
			 case 2:
				 System.out.println("----------------LIST OF PRODUCTS------------------");
					for(Product1 product: products) {
						product.display();
					}
				 break;
			 case 3:
				 
				 System.out.println("Enter Id");
				 int id = sc.nextInt();
				 System.out.println("Enter a new price");
				 double price = sc.nextDouble();
				 for(Product1 p: products) {
					 p.display();
					 if(p.getId()==id) {
						
						 p.setPrice(price);
						 System.out.println("Price updated");
						 p.display();
						 break;
					 }
				 }
				 break;
			 case 4:
				 System.out.println("--------Exiting------------");
				 break;
				 default:
					 System.out.println("Invalid choice");
			 }
			 
		}while(choice!=4);
		sc.close();

	}

}

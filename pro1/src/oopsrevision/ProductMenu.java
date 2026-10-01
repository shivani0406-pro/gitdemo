package oopsrevision;

import java.util.Scanner;

public class ProductMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Product1 p = new Product1();
		
		int choice;
		do {
			System.out.println("\n----------Product Menu------------------");
			System.out.println("1.Add Product");
			System.out.println("2.Display Product");
			System.out.println("3.Update Product");
			System.out.println("4.Exit");
			System.out.print("Enter your choice");
			
			 choice = sc.nextInt();
			 switch(choice) {
			 case 1:
				 System.out.println("Enter Id");
				 p.setId(sc.nextInt());
				 
				 System.out.println("Enter Name");
				 p.setName(sc.next());
				 
				 System.out.println("Enter price");
				 p.setPrice(sc.nextDouble());
				 break;
			 case 2:
				 p.display();
				 break;
			 case 3:
				 System.out.println("Enter a new price");
				 p.setPrice(sc.nextDouble());
				 System.out.println("Price updated");
				 p.display();
				 break;
			 case 4:
				 System.out.println("--------Exiting------------");
				 break;
				 default:
					 System.out.println("Invalid choice");
			 }
			 
		}while(choice!=4);
		
		sc.close();
		
		
		/* Array stores references, not actual data. 
		 * 
		 * Objects must be created using new
		 * 
		 * An array of objects is a collection of object references stored in contiguous memory location
		 * 
		 * */

	}

}

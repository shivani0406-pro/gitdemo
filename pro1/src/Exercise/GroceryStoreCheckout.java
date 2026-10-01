package Exercise;

import java.util.Scanner;

public class GroceryStoreCheckout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Product shop[] = new Product[4];
		
		Product parr[] = new Product[4];
		parr[0] = new Product("MILK", 50, 0);
		parr[1] = new Product("BREAD",90,10);
		parr[2] = new Product("EGGS",70,90);
		parr[3] = new Product("APPLE", 80, 0);
		
		
		
		int menu=0;
		do {
		System.out.println("Select Menu");
		System.out.println("1.Search product by product name\n"
				+ "2.List of Out Of Stock Products\n"
				+ "3.Shopping\n"
				+ "4.Exit");
		
		 menu = sc.nextInt();
		
		switch(menu) {
		case 1: 
			System.out.println("Enter Product Name: ");
			String name = sc.next();
			for(Product p : parr) {
				if(p.getName().equals(name.toUpperCase())) {
					System.out.println(p.toString());
					break;
				}
				
			}
			break;
		case 2:
			System.out.println("List of Out Of Stock Products");
			for(Product p: parr) {
				if(p.getStock()==0) {
					System.out.println(p.toString());
				}
			}
		case 3:
			for(Product p: parr) {
				System.out.println(p.toString());
			}
			
			char stop = 'n';
			double subtotal = 0;
			int j=0;
			do {
			System.out.println("To shop a product enter name of product");
			String pname = sc.next();
			System.out.println("Enter Quantity:");
			int quantity = sc.nextInt();
			
			
			for(int i=0;i<parr.length;i++) {
				if(parr[i].getName().equals(pname.toUpperCase()) && parr[i].getStock()!=0) {
					//System.out.println(parr[i].toString());
					parr[i].setQuantity(quantity);
					shop[j] = parr[i];
					subtotal += (parr[i].getPrice()*parr[i].getQuantity());
					j++;
				}
			}
			
			System.out.println("Do you want to stop: y/n");
			stop = sc.next().charAt(0);
			}while(stop!='y');
			
			
			System.out.println("======================================================");
			System.out.println("\t\t"+Product.shopName);
			System.out.println("======================================================");
			System.out.println("Item Name\tQty\tUnit Price\t\tTotal");
			
			for(Product p : shop) {
				if(p!=null)
				System.out.println(p.getName()+"\t\t"+p.getQuantity()+"\t"+p.getPrice()+"\t\t\t"+p.getPrice()*p.getQuantity());
				
			}
			System.out.println("---------------------------------------------------------------");
			System.out.println("Subtotal:\t\t\t\t\t"+subtotal);
			System.out.println("Tax (5%):\t\t\t\t\t"+(subtotal*0.05));
			System.out.println("=================================================================");
			System.out.println("Grand Total:\t\t\t\t\t"+(subtotal*1.05));
			System.out.println("=================================================================");
			System.out.println("         Thank You For Shopping With Us!         ");
			System.out.println("==================================================================");
			break;
		case 4:
			break;
			default:
				System.out.println("Invalid Menu");
		}
		}while(menu!=4);
		
		

	}
 
}

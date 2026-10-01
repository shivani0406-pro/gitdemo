package inheritanceassigment;

import java.util.Scanner;

public class LibraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LibraryBook lb[] = new LibraryBook[5];
		EBook eb[] = new EBook[5];
		char countinue = 'y';
		System.out.println("Welcome to XYZ Library");
		int i=0;
		int j=0;
		do {
			System.out.println("Choice of Book\n"
					+ "1. Physical Library\n"
					+ "2. E-Library");
			int choice = sc.nextInt();
			
			System.out.println("Enter BookId");
			int id = sc.nextInt();
			System.out.println("Enter Title");
			String title = sc.next();
			System.out.println("Author");
			String author = sc.next();
			
			
			switch(choice) {
			case 1: 
				
				lb[i] = new LibraryBook(id, title, author);
				i++;
				break;
			case 2: 
				System.out.println("File Size");
				double size = sc.nextDouble();
				System.out.println("Enter format");
				String format = sc.next();
				
				eb[j] = new EBook(id, title, author, size, format);
				j++;
				break;
				default:
					System.out.println("Invalid Choice!");
			}
			System.out.println("Do you want to continue-(y/n)");
			countinue = sc.next().charAt(0);
			
		}while(countinue!='n');
		
		System.out.println("Physical Library Book");
		for(LibraryBook lbook: lb) {
			if(lbook!=null) {
				lbook.displayLibraryBookDetails();
				System.out.println();
			}
		}
		System.out.println("---------------------------------------------");
		System.out.println("E-Book Library");
		for(EBook ebook: eb) {
			if(ebook!=null) {
				ebook.displayEbookDetails();
				System.out.println();
			}
		}
		sc.close();
	}

}

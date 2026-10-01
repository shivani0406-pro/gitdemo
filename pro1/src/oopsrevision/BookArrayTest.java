package oopsrevision;

import java.util.Scanner;

public class BookArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Book books[] = new Book[4];
		
		for(int i=0;i<4;i++) {
			System.out.println("Enter Book Title "+(i+1));
//			Book book = new Book();
//			book.setTitle(sc.next());
//			books[i] = book;
			books[i] = new Book();
			books[i].setTitle(sc.next());
		}
		
		System.out.println("Book Titles");
		for(int i=0; i<4;i++) {
			System.out.println(books[i].getTitle());
		}
		sc.close();

	}

}

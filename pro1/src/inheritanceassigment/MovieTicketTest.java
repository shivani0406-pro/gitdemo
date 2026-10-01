package inheritanceassigment;

import java.util.Scanner;

public class MovieTicketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie Name");
		String movieName = sc.next();
		System.out.println("Enter Seat No");
		String seatNo = sc.next();
		System.out.println("Enter ticketPrice");
		double price = sc.nextDouble();
		System.out.println("Lounge Access");
		String la = sc.next();
		System.out.println("Snacks Included");
		String snacks = sc.next();
		
		PremiumTicket p = new PremiumTicket(movieName, seatNo, price, la, snacks);
		p.display();
		
		sc.close();

	}

}

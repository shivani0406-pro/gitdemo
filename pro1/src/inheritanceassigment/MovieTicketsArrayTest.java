package inheritanceassigment;

import java.util.Scanner;

public class MovieTicketsArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PremiumTicket[] primeTic = new PremiumTicket[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter Movie Name "+(i+1));
			String movieName = sc.next();
			System.out.println("Enter Seat No "+(i+1));
			String seatNo = sc.next();
			System.out.println("Enter ticketPrice "+(i+1));
			double price = sc.nextDouble();
			System.out.println("Lounge Access "+(i+1));
			String la = sc.next();
			System.out.println("Snacks Included "+(i+1));
			String snacks = sc.next();
			PremiumTicket pt = new PremiumTicket(movieName, seatNo, price, la, snacks);
			primeTic[i] = pt;
		}
		
		for(PremiumTicket pt: primeTic) {
			pt.display();
		}

	}

}

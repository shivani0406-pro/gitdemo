package multithreading;

public class BookSeat {
	int totalSeats = 10;
	
	synchronized void reserve(int n) {
		System.out.print(Thread.currentThread().getName()+ " ->");
		
		if(totalSeats>=n) {
			totalSeats = totalSeats - n;
			System.out.println(n+" Seats booked");
			System.out.println("Seats Left: "+totalSeats);
		}
		else {
			System.out.println("Sorry seats connot be book..........!!");
			System.out.println("Seats Left: "+totalSeats);
		}
	}

}

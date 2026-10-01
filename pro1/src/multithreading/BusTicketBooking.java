package multithreading;

public class BusTicketBooking extends Thread {
	
	static BookSeat obj;
	int seats;
	
	

	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			obj.reserve(seats);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj = new BookSeat();
		BusTicketBooking cust1 = new BusTicketBooking();
		cust1.setName("Agent1");
		cust1.seats = 2;
		cust1.start();

		BusTicketBooking cust2 = new BusTicketBooking();
		cust2.setName("Agent2");
		cust2.seats = 3;
		cust2.start();

	}

}

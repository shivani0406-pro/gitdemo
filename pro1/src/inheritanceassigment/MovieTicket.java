package inheritanceassigment;

public class MovieTicket {
	protected String movieName;
	protected String seatNum;
	protected double ticketPrice;
	
	public MovieTicket() {
		
	}
	
	public MovieTicket(String movieName, String seatNum, double ticketPrice) {
		super();
		this.movieName = movieName;
		this.seatNum = seatNum;
		this.ticketPrice = ticketPrice;
	}



	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	

}

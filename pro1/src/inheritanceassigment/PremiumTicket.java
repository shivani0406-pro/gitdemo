package inheritanceassigment;

public class PremiumTicket extends MovieTicket{

	protected String loungeAccess;
	protected String snacksInclued;
	
	public PremiumTicket() {
		
	}
	
	public PremiumTicket(String loungeAccess, String snacksInclued) {
		super();
		this.loungeAccess = loungeAccess;
		this.snacksInclued = snacksInclued;
	}
	
	public PremiumTicket(String movieName, String seatNo,double ticketPrice, String loungeAccess, String snacksInclued) {
		super(movieName,seatNo,ticketPrice);
		this.loungeAccess = loungeAccess;
		this.snacksInclued = snacksInclued;
	}

	public String getLoungeAccess() {
		return loungeAccess;
	}

	public void setLoungeAccess(String loungeAccess) {
		this.loungeAccess = loungeAccess;
	}

	public String getSnacksInclued() {
		return snacksInclued;
	}

	public void setSnacksInclued(String snacksInclued) {
		this.snacksInclued = snacksInclued;
	}

	void display() {
		System.out.println();
		System.out.println("Movie Name: "+movieName);
		System.out.println("SeatNo: "+seatNum+" Price: "+ticketPrice);
		System.out.println("Lounge Access: "+loungeAccess+" Snacks Included: "+snacksInclued);
	}
	
	
	
}

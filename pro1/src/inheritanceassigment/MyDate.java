package inheritanceassigment;

public class MyDate {
	int dd;
	int mm;
	int yy;
	
	public MyDate() {
		
	}
	
	public MyDate(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	void displayDate() {
		System.out.println("Date: "+dd+"-"+mm+"-"+yy);
	}
	
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	
	

}

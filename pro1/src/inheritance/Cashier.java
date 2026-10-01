package inheritance;

public class Cashier extends HierarchicalEmployee{
	
	private int counterNo;
	
	void setCounter(int counter) {
		counterNo = counter;
	}
	
	void showCashier() {
		showDetails();
		System.out.println("Cashier");
	}

}

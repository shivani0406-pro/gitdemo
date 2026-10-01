package inheritance;

public class HierarchicalBankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Manager1 m = new Manager1();
		m.setDetails(101, "Shivani", 90000);
		m.setDepartment("Loans");
		System.out.println("Manager Details");
		m.showManager();
		
		System.out.println("------------------------------------");
		
		Cashier c = new Cashier();
		c.setDetails(102, "Priya", 40000);
		c.setCounter(5);
		System.out.println("Cashier Details");
		c.showCashier();
		
		
		HierarchicalEmployee e;
		e = new Manager1();
		e.setDetails(101, "ddf", 8900);
		e.showDetails();
		
		e = new Cashier();
		e.setDetails(109, "dsdsd", 7000);
		e.showDetails();
		

	}

}

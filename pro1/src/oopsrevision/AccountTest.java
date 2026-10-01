package oopsrevision;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new Account();
		Account a2 = new Account(5000);
		Account a3 = new Account(a2);
		
		a1.display();
		a2.display();
		a3.display();
		
		a1.setBalance(4000);
		a1.display();

	}

}

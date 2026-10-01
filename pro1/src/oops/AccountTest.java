package oops;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.display();
		
		Account a2 = new Account(5000);
		a2.display();
		
		Account a3 = new Account(a2);
		a3.display();
		
		a1.setBalance(2000);
		a1.display();

	}

}

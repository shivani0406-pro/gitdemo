package Exception;

class Insuff_Balance extends Exception{
	public Insuff_Balance(String str) {
		super(str);
	}
}

public class CustomException {

	public static void main(String[] args) throws Insuff_Balance {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.setAccNo(23);
		a.setAccName("Shivani");
		a.setBalance(20000);
		
		Account a1 = new Account();
		a1.setAccNo(55);
		a1.setAccName("Riya");
		a1.setBalance(10000);
		
		try {
			a.transfer(a1,3000000);
		}
		catch (Insuff_Balance s) {
			System.out.println(s);
		}

	}

}

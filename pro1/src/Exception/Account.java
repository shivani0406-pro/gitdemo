package Exception;

public class Account {
	private double balance;
	private int accNo;
	private String accName;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	public void transfer(Account acc, double amt) throws Insuff_Balance {
		if(this.balance >= amt) {
			acc.balance += amt;
			this.balance -= amt;
			System.out.println("Transfer of amount successful");
			System.out.println(this.accName+" has remaining balance: "+this.balance);
			System.out.println(acc.accName+" has new balance "+acc.balance);
		}
		else {
			throw new Insuff_Balance("plz enter valid amount ....");
		}
	}
}

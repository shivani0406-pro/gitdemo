package oopsrevision;

public class Bank {
	
	private double balance;
	private long accNo;
	private String accName;

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double amt) {
		balance += amt;
	}

	public void withdraw(double amt) {
		if (amt <= balance) {
			balance -= amt;
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	

}

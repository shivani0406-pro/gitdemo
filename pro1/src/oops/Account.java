package oops;

public class Account {
	private double balance;
	
	Account(){
		balance = 0.0;
	}
	
	Account(double b){
		this.balance = b;
	}
	
	Account(Account a){
		this.balance = a.balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void display() {
		System.out.println("Balance "+balance);
	}

}

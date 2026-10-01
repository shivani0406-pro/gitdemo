package abstraction;

abstract class BankAccount{
	 String name;
	 double balance;
	
	public BankAccount(String name, double balance) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.balance = balance;
		System.out.println("Bank Account countrustor call");
	}
	
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
	
	void display() {
		System.out.println("Name "+name);
		System.out.println("Balance "+balance);
	}

}

class SavingsAccount extends BankAccount{
	public SavingsAccount(String name, double balance) {
		// TODO Auto-generated constructor stub
		super(name,balance);
		System.out.println("Savings acc constructor");
	}
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: "+amount);
	}
	void withdraw(double amount) {
		balance -= amount;
		System.out.println("withdraw: "+amount);
	}
}

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount b;
		b = new SavingsAccount("Shivani", 1000);
		b.deposit(50);
		b.withdraw(400);
		b.display();
		
		//BankAccount b1 = new BankAccount("Shivani",1000);

	}

}

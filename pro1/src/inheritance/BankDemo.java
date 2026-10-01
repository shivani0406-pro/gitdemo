package inheritance;

//Single Inheritance
//Banking System
//Parent: Account
//Child: SavingsAccount

class Account{
	double balance = 10000; //If we make member of parent class private it will not be able to access in child class.
	public void showBalance() {
		System.out.println("Balance: "+balance);
	}
}

class SavingsAccount extends Account
{
	public void addInterest() {
		balance = balance +(balance*0.05);
		System.out.println("After Interest: "+balance);
	}
}

public class BankDemo {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount();
		s.showBalance();
		s.addInterest();
	}

}

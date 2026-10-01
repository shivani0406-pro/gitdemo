package oopsrevision;

import oops.Bank;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		b.setAccNo(2347862);
		b.setAccName("shivani");
		b.deposite(1000);
		b.withdraw(300);
		//b.showBalance();
		System.out.println("Account Number: " + b.getAccNo());
		System.out.println("Account Name: " + b.getAccName());
		System.out.println("Balance: " + b.getBalance());
				

	}

}

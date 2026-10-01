package interfacedemo;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	     SavingsAccount savings = new SavingsAccount("Shivani", 8901, "Savings", 5000, 5);
	     CurrentAccount current = new CurrentAccount("Priya", 8190, "Current", 6000, 500, 2);

	     System.out.println("--- Savings Account Operations ---");
	     savings.deposit(5000);
	     savings.computeAndDepositInterest(2);
	     savings.withdraw(2000);
	     savings.displayBalance();

	     System.out.println("\n--- Current Account Operations ---");
	     current.deposit(1500);
	     current.withdraw(600);
	     current.displayBalance();

	     sc.close();
	}

}

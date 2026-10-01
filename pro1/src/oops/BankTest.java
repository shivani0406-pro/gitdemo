package oops;

public class BankTest {
	
	public static void displayLine() {
		System.out.println("*************************************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b = new Bank();
		b.setAccNo(2347862);
		b.setAccName("shivani");
		b.deposite(1000);
		b.withdraw(300);
		//b.showBalance();
//		System.out.println("Account Number: " + b.getAccNo());
//		System.out.println("Account Name: " + b.getAccName());
//		System.out.println("Balance: " + b.getBalance());
		
		Bank b1 = new Bank();
		b1.setAccNo(34561);
		b1.setAccName("riya");
		b1.deposite(5000);
		b1.withdraw(1000);
//		System.out.println("Account Number: " + b1.getAccNo());
//		System.out.println("Account Name: " + b1.getAccName());
//		System.out.println("Balance: " + b1.getBalance());
		double totalBal = b.getBalance() + b1.getBalance();
		displayLine();
		System.out.println("\t\tXYZ Bank");
		displayLine();
		System.out.println("AccNo\t\tAccName\t\tBalance");
		displayLine();
		System.out.println(b.getAccNo()+"\t\t"+b.getAccName()+"\t\t"+b.getBalance());
		System.out.println(b1.getAccNo()+"\t\t"+b1.getAccName()+"\t\t"+b1.getBalance());
		displayLine();
		System.out.println("Total Balance: \t\t\t"+ totalBal);
		displayLine();

	}

}

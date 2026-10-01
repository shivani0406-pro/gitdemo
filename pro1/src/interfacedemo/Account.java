package interfacedemo;

abstract class Account {
	protected String custName;
	protected int accNo;
	protected double balance;
	protected String accType;
	
	public Account() {}
	
	public Account(String custName, int accNo, String accType, double balance) {
		this.custName = custName;
		this.accNo = accNo;
		this.accType = accType;
		this.balance = 0.0;
	}
	
	public void deposit(double amount) {
	     if (amount > 0) {
	         balance += amount;
	         System.out.println("Amount deposited successfully. Updated balance: " + balance);
	     } else {
	         System.out.println("Invalid deposit amount!");
	     }
	 }
	
	public void displayBalance() {
	     System.out.println("\nAccount Holder: " + custName);
	     System.out.println("Account Number: " + accNo);
	     System.out.println("Account Type: " + accType);
	     System.out.println("Current Balance: " + balance);
	 }
	
	// Abstract-like method (to be overridden)
	 public void withdraw(double amount) {
	     // Defined in subclasses
	 }
	
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	
}

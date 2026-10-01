package interfacedemo;

class SavingsAccount extends Account {
	protected double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}
	
	
	public SavingsAccount(String custName,int accNo, String accType, double balance, double interestRate) {
		super(custName,accNo,accType,balance);
		this.interestRate = interestRate;
	}
	
	public void computeAndDepositInterest(int years) {
		 
		 //A=P(1+r/100) raise to n
	     double interest = balance * (Math.pow((1 + interestRate / 100), years) - 1);
	     balance += interest;
	     System.out.println("Interest of " + interest + " has been added to your account.");
	 }
	
	@Override
	 public void withdraw(double amount) {
	     if (amount <= balance) {
	         balance -= amount;
	         System.out.println("Withdrawal successful. Remaining balance: " + balance);
	     } else {
	         System.out.println("Insufficient balance!");
	     
	 }
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	
}

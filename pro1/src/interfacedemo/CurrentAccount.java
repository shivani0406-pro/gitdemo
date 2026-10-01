package interfacedemo;

class CurrentAccount extends Account {
	
	
	 private double minBalance;
	 private double serviceCharge;
	 
	 
	 
	public CurrentAccount(String custName,int accNo, String accType, double balance,double minBalance, double serviceCharge) {
		super(custName,accNo,accType,balance);
		this.minBalance = minBalance;
		this.serviceCharge = serviceCharge;
	}
	
	
	@Override
	 public void withdraw(double amount) {
	     if (amount <= balance) {
	         balance -= amount;
	         checkMinBalance();
	         System.out.println("Withdrawal successful. Remaining balance: " + balance);
	     } else {
	         System.out.println("Insufficient funds!");
	     }
	 }
	
	public void checkMinBalance() {
	     if (balance < minBalance) {
	         balance -= serviceCharge;
	         System.out.println("Balance below minimum! Service charge of " + serviceCharge + " imposed.");
	         System.out.println("Updated balance: " + balance);
	     }
	 }
	
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	public double getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	
	 

}

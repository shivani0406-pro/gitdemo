package interfacedemo;


interface Payment{
	final double pi = 3.14;
	void pay(double amount);
}

class CreditCard implements Payment{
	public void pay(double amount) {
		System.out.println("Paid using credit card: "+amount);
	}
}

class Upi implements Payment{
	public void pay(double amount) {
		System.out.println("Paid using UPI: "+amount);
	}
}

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p;
		p = new CreditCard();
		p.pay(1000);
		System.out.println(p.pi);
		System.out.println(Payment.pi);
		
		p = new Upi();
		p.pay(500);

	}

}

package inheritanceassigment;

import java.util.Scanner;

class FoodOrder{
	protected int orderId;
	protected String customerName;
	protected double amount;
	
	public FoodOrder() {
		
	}
	
	public FoodOrder(int orderId, String customerName, double amount) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.amount = amount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}

class ScheduledOrder extends FoodOrder{
	protected MyDate deliveryDate;
	protected MyTime deliveryTime;
	
	public ScheduledOrder() {
		
	}
	
	public ScheduledOrder(MyDate deliveryDate, MyTime deliveryTime) {
		super();
		this.deliveryDate = deliveryDate;
		this.deliveryTime = deliveryTime;
	}
	
	public ScheduledOrder(int orderId, String customerName, double amount
			,int dd, int mm, int yy,int hr, int min, int sec) {
		super(orderId,customerName,amount);
		
		deliveryDate = new MyDate(dd,mm,yy);
		deliveryTime = new MyTime(hr,min,sec);
	}
	
	void displayDetails() {
		System.out.println("OrderId: "+orderId+" Customer Name: "+customerName);
		System.out.println("Amount: "+amount);
		deliveryDate.displayDate();
		deliveryTime.displayTime();
		
	}

	public MyDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(MyDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public MyTime getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(MyTime deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
	
	
	
	
}

public class FoodDeliveryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter orderId");
		 int orderId = sc.nextInt();
		 System.out.println("Enter Name");
		 String customerName = sc.next();
		 System.out.println("Enter amount");
		 double amount = sc.nextDouble();
		 System.out.println("Enter date");
		 int dd = sc.nextInt();
		 
		 System.out.println("Enter month");
		 int mm = sc.nextInt();
		 
		 System.out.println("Enter year");
		 int yy = sc.nextInt();
		 
		 System.out.println("Enter hour");
		 int hr = sc.nextInt();
		 
		 System.out.println("Enter min");
		 int min = sc.nextInt();
		 
		 System.out.println("Enter sec");
		 int sec = sc.nextInt();
		 
		 ScheduledOrder so = new ScheduledOrder(orderId,customerName,amount,dd,mm,yy,hr,min,sec);
		 so.displayDetails();
		 
		 System.out.println();
		
		 ScheduledOrder soo = new ScheduledOrder();
		 soo.setAmount(amount);
		 soo.setCustomerName(customerName);
		 soo.setDeliveryDate(new MyDate(dd, mm, yy));
		 soo.setDeliveryTime(new MyTime(hr, min, sec));
		 soo.setOrderId(orderId);
		 soo.displayDetails();
		 
		 sc.close();

	}

}

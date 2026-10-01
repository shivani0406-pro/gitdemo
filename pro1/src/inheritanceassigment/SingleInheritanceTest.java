package inheritanceassigment;

import java.util.Scanner;

class Vehicle{
	protected String brand;
	protected double price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
class Car extends Vehicle{
	int model;
	String fuelType;
	
	public Car() {
		
	}
	
	public Car(int model, String fuelType) {
		this.model = model;
		this.fuelType = fuelType;
	}
	
	public Car(int model, String fuelType, String brand, double price) {
		this.model = model;
		this.fuelType = fuelType;
		super.brand = brand;
		super.price = price;
	}
	
	void display() {
		System.out.println(model+" "+fuelType+" "+brand+" "+price);
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	
	
	
}

public class SingleInheritanceTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Model No: ");
		int model = sc.nextInt();
		
		System.out.println("Enter Fuel Type: ");
		String ft = sc.next();
		
		System.out.println("Enter Brand: ");
		String b = sc.next();
		
		System.out.println("Enter price: ");
		double price = sc.nextDouble();
		
		Car c = new Car(model,ft,b,price);
		c.display();
		
		Car c1 = new Car();
		c1.setBrand(b);
		c1.setFuelType(ft);
		c1.setModel(model);
		c1.setPrice(price);
		c1.display();
		
		
		sc.close();
	}

}

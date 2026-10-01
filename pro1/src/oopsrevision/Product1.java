package oopsrevision;

public class Product1 {
	private int id;
	private String name;
	private double price;
	
	public Product1() {
		id = 0;
		name = "Default";
		price = 0.0;
	}
	
	public Product1(int id, String name,double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product1(Product1 p) {
		this.id = p.id;
		this.name = p.name;
		this.price = p.price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+price);
	}

}

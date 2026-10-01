package oops;

public class Product {
	
	private int id;
	private String name;
	private double price;
	
	public Product(){
		id=0;
		name="Default";
		price=0.0;
		//Add(price);
	}
	
	public Product(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
		Add(price);
	}
	
	public Product(Product p){
		this.id = p.id;
		this.name = p.name;
		this.price = p.price;
		Add(p.price);
	}
	static double total = 0;
	public double Add(double price) {
		total = total+price;
		System.out.println(total);
		return total;
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
	
	public void display() {
		System.out.println(id+" "+name+" "+price);
	}

}

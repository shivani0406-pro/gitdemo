package Aggregation;

public class Employee {
	
	/*
	 * Aggregation in Java is a specialized form of association that represents a
	 * "HAS-A" relationship between two independent classes.
	 */
	int id;
	String name;
	Address add;  //this is aggregation relationship
	
	public Employee(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	
	void display() {
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("address: "+add.city+" "+add.state+" "+add.country);
	}
	
	

}

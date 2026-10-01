package oops;

public class Employee2 {
	
	int id;
	String name;
	double salary;
	
	Employee2(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}

}

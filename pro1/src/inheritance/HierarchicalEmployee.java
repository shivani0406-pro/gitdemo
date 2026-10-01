package inheritance;

public class HierarchicalEmployee {
	
	private int empId;
	private String name;
	private double salary;
	
	void setDetails(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	void showDetails() {
		System.out.println("Id: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}

}

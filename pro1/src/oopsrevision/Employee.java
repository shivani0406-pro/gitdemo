package oopsrevision;

public class Employee {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>0) {
			this.salary = salary;
		}
		else {
			System.out.println("Invalid salary");
		}
		
	}
	
	
	

}

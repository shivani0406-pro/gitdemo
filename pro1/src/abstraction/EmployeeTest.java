package abstraction;

abstract class Employee{
	abstract void calculateSalary();
	
	public void display() {
		System.out.println("Hello from parent class");
	}
}

class FullTimeEmployee extends Employee{
	void calculateSalary() {
		System.out.println("Fixed Salary");
	}
}

class PartTimeEmployee extends Employee{
	void calculateSalary() {
		System.out.println("Salary based on hrs");
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e;
		
		e = new FullTimeEmployee();
		e.calculateSalary();
		e.display();
		
		e = new PartTimeEmployee();
		e.calculateSalary();
		e.display();
		
		

	}

}

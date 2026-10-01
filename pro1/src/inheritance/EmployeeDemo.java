package inheritance;

//Multilevel Inheritance
//Employee System
//Employee -> Manager -> Director

class Employee{
	public void work() {
		System.out.println("Employee works");
	}
}

class Manager extends Employee{
	public void manage() {
		System.out.println("Manager manages team");
	}
}

class Director extends Manager1{
	public void plan() {
		System.out.println("Director plans strategy");
	}
}


public class EmployeeDemo {

	public static void main(String[] args) {
		Director d = new Director();
		//d.work();
		//d.manage();
		d.plan();
	}

}

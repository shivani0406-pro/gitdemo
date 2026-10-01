package oopsrevision;

public class Employee2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e1 = new Employee2(101,"Amit",30000);
		Employee2 e2 = new Employee2(102,"Neha",40000);
		
		e1.display();
		e2.display();
		
		double total = e1.getSalary()+e2.getSalary();
		System.out.println("Total salary: "+total);

	}

}

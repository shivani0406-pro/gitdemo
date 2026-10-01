package comparisonsort;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
	private int empId;
	private String name;
	private double salary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
		empId=101;
		name="Abc";
		salary=10000.00;
	}
	public Employee(int empId,String name,double salary) {
		super();
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.empId>o.empId)
			return 1;
		else if(this.empId<o.empId)
			return -1;
		return 0;
	}
	
	
}

public class ComparableSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empobj = new ArrayList<>();
		
		empobj.add(new Employee(105, "Jon", 20000));
		empobj.add(new Employee(111, "Leena", 25000));
		empobj.add(new Employee(104, "Kim",22000));
		empobj.add(new Employee(108, "Adyen", 23000));
		empobj.add(new Employee(101, "Moonai", 30000));
		
		System.out.println("Before Sorting");
		for(Employee emp : empobj) {
			System.out.println(emp);
		}
		
		Collections.sort(empobj);//sort uses compareTo method internally.
		System.out.println("After Sorting");
		for(Employee emp : empobj) {
			System.out.println(emp);
		}

	}

}

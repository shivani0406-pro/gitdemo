package polymorphism;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.empId=101;
		e1.name="Shivani";
		e1.salary=50000;
		
		Employee e2 = new Employee();
		e2.empId=102;
		e2.name="Priya";
		e2.salary=60000;
		
		Employee.showCompany();
		
		Employee.changeCompany("Infosys");
		
		e1.display();
		e2.display();

	}

}

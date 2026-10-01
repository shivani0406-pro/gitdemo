package Aggregation;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add = new Address("pune","mh","in");
		Employee e = new Employee(100, "sam", add);
		e.display();

	}

}

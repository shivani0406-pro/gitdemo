package comparatorAnonymous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emplist = new ArrayList<>();
		
		emplist.add(new Employee(105, "Jon", 20000));
		emplist.add(new Employee(111, "Leena", 25000));
		emplist.add(new Employee(104, "Kim",22000));
		emplist.add(new Employee(108, "Adyen", 23000));
		emplist.add(new Employee(101, "Moonai", 30000));
		
		System.out.println("Before sorting ");
		for(Employee emp: emplist) {
			System.out.println(emp);
		}
		Comparator<Employee>compemp = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				if(o1.getEmpId()>o2.getEmpId())
					return 1;
				else if(o1.getEmpId()<o2.getEmpId())
					return -1;
				else
					return 0;
			}
			
		};
		
		System.out.println("Sorting according to id with anonymous class as comparator");
		Collections.sort(emplist, compemp);//sort internally calls compare method
		
		for(Employee e: emplist) {
			System.out.println(e);
		}
		
		//Collections.sort(emplist);
		//The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<Employee>)


	}

}

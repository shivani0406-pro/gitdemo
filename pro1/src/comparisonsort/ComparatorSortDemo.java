package comparisonsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class EmpNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class EmpIdComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmpId()>o2.getEmpId())
			return 1;
		else if(o1.getEmpId()<o2.getEmpId())
			return -1;
		else
			return 0;
	}
	
}

class EmpSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()>o2.getSalary())
			return 1;
		else if(o1.getSalary()<o2.getSalary())
			return -1;
		else
			return 0;
	}
	
}

public class ComparatorSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empobj = new ArrayList<>();
		
		empobj.add(new Employee(105, "Jon", 20000));
		empobj.add(new Employee(111, "Leena", 25000));
		empobj.add(new Employee(104, "Kim",22000));
		empobj.add(new Employee(108, "Adyen", 23000));
		empobj.add(new Employee(101, "Moonai", 30000));
		
		System.out.println("Before sorting ");
		for(Employee emp: empobj) {
			System.out.println(emp);
		}
		
		Collections.sort(empobj,new EmpNameComparator());
		System.out.println("After sorting by name");
		for(Employee emp: empobj) {
			System.out.println(emp);
		}
		
		Collections.sort(empobj,new EmpSalaryComparator());
		System.out.println("After sorting by Salary");
		for(Employee emp: empobj) {
			System.out.println(emp);
		}
		
		Collections.sort(empobj,new EmpIdComparator());
		System.out.println("After sorting by Id");
		for(Employee emp: empobj) {
			System.out.println(emp);
		}
		
		//Simple sort 
		System.out.println("Simple sort");
		Collections.sort(empobj); //sort by id
		for(Employee emp: empobj) {
			System.out.println(emp);
		}

	}

}

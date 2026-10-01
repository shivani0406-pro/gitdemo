package inheritance;

public class Manager1 extends HierarchicalEmployee {

	private String department;
	
	void setDepartment(String dept) {
		department = dept;
		
	}
	void showManager() {
		showDetails();
		System.out.println("Department: "+department);
	}
	
}

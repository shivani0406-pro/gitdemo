package polymorphism;

public class Employee {
	
	int empId;
	String name;
	double salary;
	
	static String company = "TCS";
	
	static void showCompany() {
		System.out.println("Company: "+company);
	}
	
	static void changeCompany(String newCompany) {
		company = newCompany;
	}
	
	void display() {
		System.out.println(empId+" "+name+" "+salary+" "+company);
	}

}

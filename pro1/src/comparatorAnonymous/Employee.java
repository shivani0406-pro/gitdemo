package comparatorAnonymous;

class Employee{
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
//@Override
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		if(this.empId>o.empId)
//			return 1;
//		else if(this.empId<o.empId)
//			return -1;
//		return 0;
//	}
	
	
}

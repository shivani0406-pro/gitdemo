package employeeProject;

class Employee {

    private int empId;
    private String empName;
    private double salary;

    // Constructor
    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display employee
    public void display() {
        System.out.println(empId + "\t" + empName + "\t" + salary);
    }
}
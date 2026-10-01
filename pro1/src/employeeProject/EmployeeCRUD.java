package employeeProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeCRUD{

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== EMPLOYEE MANAGEMENT =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.println("6. Sort on Employee Id");
            System.out.println("7. Sort on Employee Name");
            System.out.println("8. Sort on Employee Salary");
            System.out.println("9. Employee Salary greater than amount");
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {

            // CREATE
            case 1:

                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                Employee e = new Employee(id, name, salary);

                employees.add(e);

                System.out.println("Employee added successfully.");

                break;
                
            case 2:

                if (employees.isEmpty()) {

                    System.out.println("No employees available.");

                } else {

                    System.out.println("\nID\tName\tSalary");
                    System.out.println("-------------------------");

                    for (Employee emp : employees) {
                        emp.display();
                    }
                }

                break;
             // UPDATE
            case 3:

                System.out.print("Enter Employee ID to update: ");
                int updateId = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < employees.size(); i++) {

                    if (employees.get(i).getEmpId() == updateId) {

                        sc.nextLine();

                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();

                        System.out.print("Enter new salary: ");
                        double newSalary = sc.nextDouble();

                        employees.get(i).setEmpName(newName);
                        employees.get(i).setSalary(newSalary);

                        System.out.println("Employee updated successfully.");

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Employee not found.");
                }

                break;
                
             // DELETE
            case 4:

                System.out.print("Enter Employee ID to delete: ");
                int deleteId = sc.nextInt();

                boolean deleted = false;

                for (int i = 0; i < employees.size(); i++) {

                    if (employees.get(i).getEmpId() == deleteId) {

                        employees.remove(i);

                        System.out.println("Employee deleted successfully.");

                        deleted = true;
                        break;
                    }
                }

                if (!deleted) {
                    System.out.println("Employee not found.");
                }

                break;
            case 5:

                System.out.println("Thank you!");

                break;
            case 6:
            	//sort on id
            	Collections.sort(employees,new EmpIdComparator());
        		for(Employee emp: employees) {
        			emp.display();
        		}
        		break;
            case 7:
            	//sort on name
            	Collections.sort(employees,new EmpNameComparator());
            	for(Employee emp: employees) {
            		emp.display();
            	}
            	break;
            case 8:
            	//sort on salary
            	Collections.sort(employees,new EmpSalaryComparator());
        		for(Employee emp: employees) {
        			emp.display();
        		}
        		break;
            case 9:
            	//greater than a particular value of salary
            	System.out.println("Enter salary");
            	double sal = sc.nextDouble();
            	for (Employee emp : employees) {
            		if(emp.getSalary()>sal)
                    emp.display();
                }
            	break;
            	default:
                System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
         

 
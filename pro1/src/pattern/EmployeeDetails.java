package pattern;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Employee Id: ");
		Scanner sc = new Scanner(System.in);
		int empId = sc.nextInt();
		
		System.out.println("Enter Employee Name: ");
		Scanner sc1 = new Scanner(System.in);
		String empName = sc1.next();
		
		System.out.println("Enter Employee Salary: ");
		Scanner sc3 = new Scanner(System.in);
		double empSal = sc3.nextDouble();
		
		double pf = empSal * 0.12;
		System.out.println("The amount deducted as provident fund is: "+pf);
		
		empSal = empSal - pf;
		
		double rent = empSal * 0.10;
		System.out.println("The amount spend on rent: "+rent);
		
		double edu = empSal * 0.20;
		System.out.println("The amount spend on education: "+edu);
		sc.close();

	}

}

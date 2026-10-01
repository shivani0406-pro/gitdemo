package assignments;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		char wish = 'y';
		do {
		// TODO Auto-generated method stub
		System.out.println("Enter 1st number");
		Scanner sc = new Scanner(System.in);
		double fn = sc.nextDouble();
		
		System.out.println("Enter 2nd number");
		Scanner sc1 = new Scanner(System.in);
		double sn = sc1.nextDouble();
		
		System.out.println("Enter 1 for Addition\nEnter 2 for Substraction\n"
				+ "Enter 3 for Multiplication\nEnter 4 for Division");
		
		System.out.println("Enter operation number");
		Scanner sc3 = new Scanner(System.in);
		int num = sc3.nextInt();
		
		
		
		switch (num) {
		case 1: 
			System.out.println(fn+sn);
			break;
		case 2: 
			System.out.println(fn-sn);
			break;
		case 3: 
			System.out.println(fn*sn);
			break;
		case 4: 
			System.out.println(fn/sn);
			break;
			
		default:
			System.out.println("Invalid Operation");
		}
		
		System.out.println("Do you want to continue? y/n");
		Scanner sc4 = new Scanner(System.in);
		wish = sc4.next().charAt(0);
		
		}while(wish=='y');

	}
		

}

package revision;

import java.util.Scanner;

public class MenuDrivenProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'c' to calculate area of circle\n"
				+ "Enter 's' to calculate area of square\n"
				+ "Enter 'r' tocalculate area of rectangle");
		char choice = sc.next().charAt(0);
		
		switch(choice) {
		case 'c':
			System.out.println("Enter Radius: ");
			double r = sc.nextDouble();
			double p =22/7;
			double area = r*r*p;
			System.out.println("Area of circle: "+area);
			break;
		case 's':
			System.out.println("Enter side:");
			double s = sc.nextDouble();
			double areas = s*s;
			System.out.println("Area of Square: "+areas);
			break;
		case 'r':
			System.out.println("Enter Length");
			double l = sc.nextDouble();
			System.out.println("Enter Breadth");
			double b = sc.nextDouble();
			double area_r = l*b;
			System.out.println("Area of rectangle: "+area_r);
			break;
			default:
				System.out.println("Invalid Input");
			
		}

	}

}

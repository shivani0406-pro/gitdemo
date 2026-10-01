package revision;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter RollNo: ");
		int rollNo = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter marks in 1st subject");
		int mark1 = sc.nextInt();
		
		System.out.println("Enter marks in 2nd subject");
		int mark2 = sc.nextInt();
		
		System.out.println("Enter marks in 3rd subject");
		int mark3 = sc.nextInt();
		
		int averageMarks =  (mark1+mark2+mark3)/3;
		System.out.println("Average Marks: "+averageMarks);
		
		if(averageMarks>=85) {
			System.out.println("Excellent");
		}
		else if(averageMarks>=75) {
			System.out.println("Distinction");
		}
		else if(averageMarks>=60) {
			System.out.println("First Class");
		}
		else if(averageMarks>=40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Poor");
		}

	}

}

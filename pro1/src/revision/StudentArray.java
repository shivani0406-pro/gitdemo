package revision;

import java.util.Scanner;

public class StudentArray {
	static void displayStar() {
		System.out.println("*******************************************************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rollNos[] = new int[3];
		String names[] = new String [3];
		int marks[][] = new int[3][3];
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter RollNo: ");
			int rollNo = sc.nextInt();
			rollNos[i]=rollNo;
			
			System.out.println("Enter Name: ");
			String name = sc.next();
			names[i] = name;
			
			
				System.out.println("Enter marks in 1st subject");
				int mark1 = sc.nextInt();
				marks[i][0]= mark1;
				
				System.out.println("Enter marks in 2nd subject");
				int mark2 = sc.nextInt();
				marks[i][1] = mark2;
				
				System.out.println("Enter marks in 3rd subject");
				int mark3 = sc.nextInt();
				marks[i][2]=mark3;
				
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
			
		
		displayStar();
		System.out.println("\t\tResult");
		displayStar();
		System.out.println("RollNo\tName\tMark1\t\tMark2\t\tMark3");
		displayStar();
		
			
			for(int i=0;i<3;i++) {
				
				
				System.out.print(rollNos[i]+"\t"+names[i]);
				
				for(int j=0;j<3;j++) {
					System.out.print("\t"+marks[i][j]+"\t");
				}
				System.out.println();
				
			}
			
		
		
		
		sc.close();

	}

}

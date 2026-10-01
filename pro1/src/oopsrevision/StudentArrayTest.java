package oopsrevision;

import java.util.Scanner;

public class StudentArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student students[] = new Student[5];
		for(int i=0;i<students.length;i++) {
			students[i] = new Student();
			System.out.println("Enter Student Name");
			students[i].setName(sc.next());
			System.out.println("Enter Student RollNo");
			students[i].setRollNo(sc.nextInt());
			System.out.println("Enter Your Marks");
			students[i].setMarks(sc.nextInt());
			if(students[i].getMarks()>=40) {
				students[i].setStatus("Pass");
			}
			else {
				students[i].setStatus("Fail");
			}
			
		}
		
		for(int i=0;i<students.length;i++) {
			if(students[i].getStatus()=="Pass")
			System.out.println(students[i].toString());
		}
		
		System.out.println("Enter RollNo");
		int rollNo = sc.nextInt();
		
		for(int i=0;i<students.length;i++) {
			if(students[i].getRollNo()==rollNo) {
				System.out.println(students[i]);
			}
			
		}
		

	}

}

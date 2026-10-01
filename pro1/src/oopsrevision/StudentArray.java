package oopsrevision;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student arr[] = new Student[3];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			Student s = new Student();
			System.out.println("Enter Student name");
			s.setName(sc.next());
			System.out.println("Enter Student RollNo");
			s.setRollNo(sc.nextInt());
			arr[i]=s;
			
		}
		
		for(int i=0;i<3;i++) {
			System.out.println("Name: "+arr[i].getName()+" Rollno: "+arr[i].getRollNo());
			
		}
		sc.close();

	}

}

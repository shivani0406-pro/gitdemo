package pattern;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a marks: ");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		if(marks>90) {
			System.out.println("Grade: A");
		}
		else if(marks>70) {
			System.out.println("Grade: B");
		}
		else if(marks>=50) {
			System.out.println("Grade: C");
		}

	}

}

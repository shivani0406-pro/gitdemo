package assignments;

import java.util.Scanner;

public class IsPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your marks");
		Scanner sc = new Scanner(System.in);
		double marks = sc.nextDouble();
		if(marks>=35)
			System.out.println("Pass");
		else
			System.out.println("Fail");

	}

}

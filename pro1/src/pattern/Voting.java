package pattern;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		else {
			System.out.println("Not Eligible for voting");
		}

	}

}
